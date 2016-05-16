package Game;

import Input.Keyboard;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.*;
import java.awt.image.*;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	public static int width = 300;
	public static int height = width / 16 * 10;
	public static int scale = 3;

	private Thread thread;
	private JFrame frame;
	private Keyboard key;
	private boolean running = false;
	private Screen screen;
	public static Level level;
	private Player player;

	public static String title = "Game";

	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();

	public Game() {
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size);
		screen = new Screen(width, height);
		frame = new JFrame();
		key = new Keyboard();
		// level = new RandomLevel(64, 64);
		level = Level.spawn;
		player = new Player(12, 12, key);
		player.init(level);
		addKeyListener(key);
		//Mouse mouse = new Mouse();
		//addMouseListener(mouse);
		//addMouseMotionListener(mouse);
	}

	public synchronized void start() {
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}

	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		final double ns = 1000000000.0 / 60;
		double delta = 0;
		int frames = 0;
		int updates = 0;
		requestFocus();
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				update();
				updates++;
				delta--;
			}
			render();
			frames++;
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + " ups, " + frames + " fps");
				frame.setTitle(title + " | " + updates + " ups, " + frames + " fps");
				updates = 0;
				frames = 0;
			}
			// System.out.println("Finished Run Loop");
		}
	}

	public void update() {
		key.update();
		player.update();
		level.update();
	}

	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}

		screen.clear();
		level.render(player.x, player.y, screen);
		player.render(screen);
		//level.renderTopLayer(player.x, player.y, screen);
		
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = screen.pixels[i];
		}

		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		//g.fillRect(Mouse.getX() - 32, Mouse.getY()- 32, 64, 64);
		g.dispose();
		bs.show();
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.frame.setResizable(false);
		game.frame.setTitle(title);
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);

		game.start();
	}
	

	public Screen getScreen(){
		return screen;
	}
}

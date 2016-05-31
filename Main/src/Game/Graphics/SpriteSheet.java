package Game.Graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

    private final String path;
    public final int WIDTH, HEIGHT;
    public int[] pixels;

    public static SpriteSheet tiles = new SpriteSheet("/textures/Grass1.png", 16);
    public static SpriteSheet rock = new SpriteSheet("/textures/Rock.png", 16);
    public static SpriteSheet sand = new SpriteSheet("/textures/SandFloor1.png", 16);
    public static SpriteSheet sand4 = new SpriteSheet("/textures/SandFloor4.png", 16);
    //public static SpriteSheet player = new SpriteSheet("/textures/mario.png", 32);
    public static SpriteSheet wall = new SpriteSheet("/textures/WallTest.png", 16);
    
    public static SpriteSheet sprites = new SpriteSheet("/textures/spritesheet.png", 256);
    
    public static SpriteSheet mainmenu = new SpriteSheet("/textures/mainmenu.png", 300, 168);
    
   // public static SpriteSheet sprites = new SpriteSheet("/textures/spritesheet.png", 32);
    

    public SpriteSheet(String path, int size) {
        this.path = path;
        WIDTH = size;
        HEIGHT = size;
        pixels = new int[size * size];
        load();
    }
    
    public SpriteSheet(String path, int w, int h) {
        this.path = path;
        WIDTH = w;
        HEIGHT = h;
        pixels = new int[w * h];
        load();
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

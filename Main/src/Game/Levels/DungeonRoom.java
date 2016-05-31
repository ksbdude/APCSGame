package Game.Levels;

import Game.Graphics.SpriteSheet;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DungeonRoom {

    public static DungeonRoom room1 = new DungeonRoom("");

    int w, h;
    String path;

    public int[] pixels;

    public DungeonRoom(String path, int w, int h) {
        this.w = w;
        this.h = h;
        pixels = new int[w * h];
        this.path = path;
        load();
    }

    public DungeonRoom(String path) {
        this(path, 24, 24);
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
            System.out.println("Loaded DungeonRoom");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getTile(int x, int y) {
        if (pixels[x + y * w] == 0xFF000000) {
            return 5;
        } else {
            return 1;
        }
    }
}

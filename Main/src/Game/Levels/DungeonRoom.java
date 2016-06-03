package Game.Levels;

import Game.Graphics.SpriteSheet;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class DungeonRoom {

    ArrayList<DungeonRoom> rooms = new ArrayList<>();

//    public static DungeonRoom r0 = new DungeonRoom("/DungeonRooms/R0.png");
    public static DungeonRoom r1 = new DungeonRoom("/Dungeons/R001.png");
    public static DungeonRoom r11 = new DungeonRoom("/Dungeons/R011.png");
//    public static DungeonRoom r21 = new DungeonRoom("/Dungeons/R021.png");
//    public static DungeonRoom r31 = new DungeonRoom("/Dungeons/R031.png");
//    public static DungeonRoom r41 = new DungeonRoom("/Dungeons/R041.png");
//    public static DungeonRoom r51 = new DungeonRoom("/Dungeons/R051.png");
//    public static DungeonRoom r61 = new DungeonRoom("/Dungeons/R061.png");
//    public static DungeonRoom r71 = new DungeonRoom("/Dungeons/R071.png");
//    public static DungeonRoom r81 = new DungeonRoom("/Dungeons/R081.png");
//    public static DungeonRoom r91 = new DungeonRoom("/Dungeons/R091.png");
//    public static DungeonRoom r101 = new DungeonRoom("/Dungeons/R101.png");

    int w, h;
    String path;

    public int[] pixels;

    public DungeonRoom(String path, int w, int h) {
        this.w = w;
        this.h = h;
        pixels = new int[w * h];
        this.path = path;
        load();
        rooms.add(this);
    }

    public DungeonRoom(String path) {
        this(path, 24, 24);
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            this.w = w;
            this.h = h;
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

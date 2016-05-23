package Game.Levels;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Structure {

    public static Structure dungeon = new Structure("/textures/Room1.png", 26);

    private int[] floorplan;
    private int width, height;
    private String path;
    private int SIZE;

    public int[] pixels;

    public Structure(String path, int size) {
        this.path = path;
        SIZE = size;
        floorplan = new int[SIZE * SIZE];
        load();
    }

    public int[] getfloorplan() {
        return floorplan;
    }

    public int getSize() {
        return SIZE;
    }

    public void load() {
        try {
            BufferedImage image = ImageIO.read(Structure.class.getResource(path));
            int w = width = image.getWidth();
            int h = height = image.getHeight();
            floorplan = new int[w * h];
            image.getRGB(0, 0, w, h, floorplan, 0, w);
            width = w;
            height = h;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cant load Level file!");
        }
    }

    public void fix() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if(floorplan[x + y * width] == 0xFF22b14c){
                    floorplan[x + y * width] = 1;
                } else {
                    floorplan[x + y * width] = 9;
                }
            }
        }
    }
}

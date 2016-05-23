package Game;


import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Structure {

    //public static Structure dungeon = new Structure("", 16);

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
            image.getRGB(0, 0, image.getWidth(), image.getHeight(), floorplan, 0, image.getWidth());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package Game.Graphics;

public class Sprite {

    public final int SIZE;
    private int x, y;
    public int[] pixels;
    private SpriteSheet sheet;

    public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
    public static Sprite rock = new Sprite(16, 0, 0, SpriteSheet.rock);
    public static Sprite sand = new Sprite(16, 0, 0, SpriteSheet.sand);
    public static Sprite sand4 = new Sprite(16, 0, 0, SpriteSheet.sand4);
    //public static Sprite player = new Sprite(32, 0, 0, SpriteSheet.player);
    public static Sprite wall = new Sprite(16, 0, 0, SpriteSheet.wall);

    public static Sprite playerF = new Sprite(32, 0, 4, SpriteSheet.sprites);
    public static Sprite playerF1 = new Sprite(32, 1, 4, SpriteSheet.sprites);
    public static Sprite playerF2 = new Sprite(32, 2, 4, SpriteSheet.sprites);

    public static Sprite playerL = new Sprite(32, 0, 5, SpriteSheet.sprites);
    public static Sprite playerL1 = new Sprite(32, 1, 5, SpriteSheet.sprites);
    public static Sprite playerL2 = new Sprite(32, 2, 5, SpriteSheet.sprites);

    public static Sprite playerR = new Sprite(32, 0, 6, SpriteSheet.sprites);
    public static Sprite playerR1 = new Sprite(32, 1, 6, SpriteSheet.sprites);
    public static Sprite playerR2 = new Sprite(32, 2, 6, SpriteSheet.sprites);

    public static Sprite playerU = new Sprite(32, 0, 7, SpriteSheet.sprites);
    public static Sprite playerU1 = new Sprite(32, 1, 7, SpriteSheet.sprites);
    public static Sprite playerU2 = new Sprite(32, 2, 7, SpriteSheet.sprites);

    public static Sprite door1 = new Sprite(16, 5, 0, SpriteSheet.sprites);
    public static Sprite door2 = new Sprite(16, 6, 0, SpriteSheet.sprites);
    public static Sprite door3 = new Sprite(16, 5, 1, SpriteSheet.sprites);
    public static Sprite door4 = new Sprite(16, 6, 1, SpriteSheet.sprites);

    public static Sprite projectile = new Sprite(16, 0, 2, SpriteSheet.sprites);

    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        SIZE = size;
        pixels = new int[size * size];
        this.x = x * size;
        this.y = y * size;
        this.sheet = sheet;
        load();
    }

    public Sprite(int size, int color) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        setColor(color);
    }

    private void setColor(int color) {
        for (int i = 0; i < SIZE * SIZE; i++) {
            pixels[i] = color;
        }
    }

    private void load() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.WIDTH];
            }
        }
    }
}

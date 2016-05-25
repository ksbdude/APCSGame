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

//    public static Sprite wall = new Sprite(16, 1, 1, SpriteSheet.tiles);
//    public static Sprite wallTop = new Sprite(16, 2, 1, SpriteSheet.tiles);
//    public static Sprite sand = new Sprite(16, 3, 1, SpriteSheet.tiles);
//    public static Sprite flower = new Sprite(16, 1, 0, SpriteSheet.tiles);
//    public static Sprite flowerRed = new Sprite(16, 3, 0, SpriteSheet.tiles);
//    public static Sprite rock = new Sprite(16, 2, 0, SpriteSheet.tiles);
//    public static Sprite voidSprite = new Sprite(16, 0x00a0ff);
//
//    public static Sprite playerF = new Sprite(32, 0, 4, SpriteSheet.tiles);
//    public static Sprite playerF1 = new Sprite(32, 1, 4, SpriteSheet.tiles);
//    public static Sprite playerF2 = new Sprite(32, 2, 4, SpriteSheet.tiles);
//
//    public static Sprite playerL = new Sprite(32, 0, 5, SpriteSheet.tiles);
//    public static Sprite playerL1 = new Sprite(32, 1, 5, SpriteSheet.tiles);
//    public static Sprite playerL2 = new Sprite(32, 2, 5, SpriteSheet.tiles);
//
//    public static Sprite playerR = new Sprite(32, 0, 6, SpriteSheet.tiles);
//    public static Sprite playerR1 = new Sprite(32, 1, 6, SpriteSheet.tiles);
//    public static Sprite playerR2 = new Sprite(32, 2, 6, SpriteSheet.tiles);
//
//    public static Sprite playerU = new Sprite(32, 0, 7, SpriteSheet.tiles);
//    public static Sprite playerU1 = new Sprite(32, 1, 7, SpriteSheet.tiles);
//    public static Sprite playerU2 = new Sprite(32, 2, 7, SpriteSheet.tiles);
//
//    public static Sprite enemyD = new Sprite(32, 4, 4, SpriteSheet.tiles);
//    public static Sprite enemyD1 = new Sprite(32, 3, 4, SpriteSheet.tiles);
//    public static Sprite enemyD2 = new Sprite(32, 2, 4, SpriteSheet.tiles);
//
//    public static Sprite enemyR = new Sprite(32, 4, 6, SpriteSheet.tiles);
//    public static Sprite enemyR1 = new Sprite(32, 3, 6, SpriteSheet.tiles);
//    public static Sprite enemyR2 = new Sprite(32, 2, 6, SpriteSheet.tiles);
//
//    public static Sprite enemyL = new Sprite(32, 4, 5, SpriteSheet.tiles);
//    public static Sprite enemyL1 = new Sprite(32, 3, 5, SpriteSheet.tiles);
//    public static Sprite enemyL2 = new Sprite(32, 2, 5, SpriteSheet.tiles);
//
//    public static Sprite enemyU = new Sprite(32, 4, 7, SpriteSheet.tiles);
//    public static Sprite enemyU1 = new Sprite(32, 3, 7, SpriteSheet.tiles);
//    public static Sprite enemyU2 = new Sprite(32, 2, 7, SpriteSheet.tiles);
//    public static Sprite particle = new Sprite(3, 0xAAAAAA);
    //projectile Sprites
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
                pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
            }
        }
    }
}

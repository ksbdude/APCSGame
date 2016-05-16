package Game;

public class Tile {

    public int x, y;
    public Sprite sprite;

    public static Tile grass = new GrassTile(Sprite.grass);
    /*public static Tile wood = new GrassTile(Sprite.wood);
     public static Tile wallTop = new GrassTile(Sprite.wallTop);
     public static Tile rock = new GrassTile(Sprite.rock);
     public static Tile voidTile = new VoidTile(Sprite.voidSprite);
     public static Tile sand = new GrassTile(Sprite.sand);
     */

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {
    }

    public boolean solid() {
        return false;
    }
}

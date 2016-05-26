package Game.Tile;

import Game.Graphics.Sprite;
import Game.Graphics.Screen;
import Game.Levels.Level;

public class Tile {

    public int x, y;
    public Sprite sprite;

    public static Tile grass = new GrassTile(Sprite.grass);
    public static Tile rock = new GrassTile(Sprite.rock);
    public static Tile sand = new GrassTile(Sprite.sand);
    public static Tile sand4 = new GrassTile(Sprite.sand4);
    public static Tile wall = new RockTile(Sprite.wall);

    public static Tile voidTile = new VoidTile(16, 0xFF0000ff);
    
    public static Tile door1 = new DoorTile(Sprite.door1, Level.level2);
    

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    public boolean solid() {
        return false;
    }
    
    public boolean isDoor() {
        return false;
    }
    
    public Level getLevel() {
        return null;
    }
}

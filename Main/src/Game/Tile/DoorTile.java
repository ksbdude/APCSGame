package Game.Tile;

import Game.Graphics.Sprite;
import Game.Levels.Level;

public class DoorTile extends Tile {
    public DoorTile(Sprite sprite) {
        super(sprite);
    }

    public boolean door() {
        return true;
    }
}

package Game.Tile;

import Game.Graphics.Sprite;
import Game.Levels.Level;

public class DoorTile extends Tile {

    private Level level;

    public DoorTile(Sprite sprite, Level level) {
        super(sprite);
        this.level = level;
    }

    public boolean door() {
        return true;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}

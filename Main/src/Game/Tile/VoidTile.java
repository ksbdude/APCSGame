package Game.Tile;

import Game.Graphics.Sprite;
import Game.Graphics.Screen;

public class VoidTile extends Tile {

    public VoidTile(Sprite sprite) {
        super(sprite);
    }

    public VoidTile(int i, int i0) {
        super(new Sprite(i, i0));
    }

    @Override
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    public boolean solid() {
        return true;
    }
}

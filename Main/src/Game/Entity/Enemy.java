package Game.Entity;

import Game.Graphics.Screen;
import Game.Graphics.Sprite;
import Game.Levels.Level;

public class Enemy extends Mob {

    public Enemy(int x, int y, Level level) {
        super(level);
        this.x = x;
        this.y = y;
        sprite = Sprite.playerF;
    }

    @Override
    public void update() {
        int targetx = Game.Game.player.x;
        int targety = Game.Game.player.y;
        int xa = 0, ya = 0;
        if (targetx < x) {
            xa = -1;
        } else if (targetx > x) {
            xa = 1;
        } else {
            xa = 0;
        }
        if (targety < y) {
            ya = -1;
        } else if (targety > y) {
            ya = 1;
        } else {
            ya = 0;
        }

        if (Math.abs(x - targetx) > 75 && Math.abs(y - targety) > 75) {
            xa = 0;
            ya = 0;
        }
        
        x += xa;
        y += ya;
        
        if (Math.abs(x - targetx) < 10 && Math.abs(y - targety) < 10) {
            Game.Game.player.health--;
        }
        
//        if(!level.getTile(x + xa, y).solid()){
//            x += xa;
//        }
//        if(!level.getTile(x, y + ya).solid()){
//            y += ya;
//        }
    }

    @Override
    public void render(Screen screen) {
        screen.renderMob(x + screen.width / 2 - 16, y + screen.height / 2 - 16, sprite);
    }
}

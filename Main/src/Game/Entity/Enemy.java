package Game.Entity;

import Game.Graphics.Screen;
import Game.Graphics.Sprite;
import Game.Levels.Level;

public class Enemy extends Mob {

    private int range = 75;
    private int speed = 1;

    public Enemy(int x, int y, Level level, int range, int speed){
        this(x, y);
        this.range = range;
        this.speed = speed;
    }
    
    public Enemy(int x, int y) {
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
            xa = -speed;
        } else if (targetx > x) {
            xa = speed;
        } else {
            xa = 0;
        }
        if (targety < y) {
            ya = -speed;
        } else if (targety > y) {
            ya = speed;
        } else {
            ya = 0;
        }

        if (Math.abs(x - targetx) > range && Math.abs(y - targety) > range) {
            xa = 0;
            ya = 0;
        }

        x += xa;
        y += ya;

        if (Math.abs(x - targetx) < 10 && Math.abs(y - targety) < 10) {
            Game.Game.player.health--;
        }
    }

    @Override
    public void render(Screen screen) {
        screen.renderMob(x + screen.width / 2 - 16, y + screen.height / 2 - 16, sprite);
    }
}

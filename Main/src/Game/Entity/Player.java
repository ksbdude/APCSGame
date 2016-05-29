package Game.Entity;

import Game.Game;
import Game.Graphics.Screen;
import Game.Graphics.Sprite;
import Game.Keyboard;
import Game.Levels.Level;
import Game.Mouse;
import Game.Tile.DoorTile;
import java.awt.Graphics;

public class Player extends Mob {

    private Keyboard input;
    private int fireRate = 0;
    double state = 0;
    int health = 100;

    public Player(Keyboard input, Level l) {
        super(l);
        this.input = input;
        sprite = Sprite.playerF;
        dir = Direction.DOWN;
    }

    public Player(int x, int y, Keyboard input, Level l) {
        this(input, l);
        this.x = x;
        this.y = y;
        //fireRate = MagicProjectile.FIRE_RATE;
    }

    private int speed = 2;

    @Override
    public void update() {
        int xa = 0, ya = 0;
        if (input.up) {
            ya -= speed;
        }
        if (input.down) {
            ya += speed;
        }
        if (input.left) {
            xa -= speed;
        }
        if (input.right) {
            xa += speed;
        }

        if (xa != 0 || ya != 0) {
            move(xa, ya);
            if (state == 40) {
                state = 0;
            } else {
                state += 0.5;
            }
        } else {
            state = 0;
        }

        //System.out.println((x >> 4) + " " + (y >> 4) + " " + level.getTile(x >> 4, y >> 4).isDoor());
        for (int c = 0; c < 4; c++) {
            int xt = ((x + xa + Game.width / 2) + c % 2 * 21 - 10) / 16;
            int yt = ((y + ya + Game.height / 2) + c / 2 * 16 - 1) / 16;
            if (level.getTile(xt, yt) instanceof DoorTile) {
                System.out.println("DOOR");
                level = level.getTile(xt, yt).getLevel();
                Game.level = level;
                x = 5;
                y = 5;
            }
        }

        clear();
        if (fireRate > 0) {
            fireRate--;
        }
        updateShooting();
    }

    private void clear() {
        for (int i = 0; i < level.getProjectiles().size(); i++) {
            Projectile p = level.getProjectiles().get(i);
            if (p.isRemoved()) {
                level.getProjectiles().remove(i);
            }
        }
    }

    public void updateShooting() {
        if (Mouse.getButton() == 1 && fireRate <= 0) {
            double dx = Mouse.getX() - Game.width * Game.scale / 2;
            double dy = Mouse.getY() - Game.height * Game.scale / 2;
            double direction = Math.atan2(dy, dx);
            shoot(x, y, direction);
            fireRate = Projectile.FIRE_RATE;
            System.out.println(direction);
        }
    }

    @Override
    public void render(Screen screen) {
        if (dir == Direction.RIGHT) {
            if (state < 10 || (state > 20 && state < 30)) {
                sprite = Sprite.playerR1;
            } else if (state < 20) {
                sprite = Sprite.playerR;
            } else {
                sprite = Sprite.playerR2;
            }
        } else if (dir == Direction.DOWN) {
            if (state < 10 || (state > 20 && state < 30)) {
                sprite = Sprite.playerF1;
            } else if (state < 20) {
                sprite = Sprite.playerF;
            } else {
                sprite = Sprite.playerF2;
            }
        } else if (dir == Direction.LEFT) {
            if (state < 10 || (state > 20 && state < 30)) {
                sprite = Sprite.playerL1;
            } else if (state < 20) {
                sprite = Sprite.playerL;
            } else {
                sprite = Sprite.playerL2;
            }
        } else if (dir == Direction.UP) {
            if (state < 10 || (state > 20 && state < 30)) {
                sprite = Sprite.playerU1;
            } else if (state < 20) {
                sprite = Sprite.playerU;
            } else {
                sprite = Sprite.playerU2;
            }
        }

        screen.renderMob(x + screen.width / 2 - 16, y + screen.height / 2 - 16, sprite);
        screen.renderBar(5, 5, 102, 8, 0xFFFFFFFF);
        screen.renderBar(6, 6, health, 6, 0xFFFF0000);
    }
}

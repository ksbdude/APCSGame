package Game;

import Input.Keyboard;

public class Player extends Mob {

    private Keyboard input;
    private Sprite sprite;
    private int fireRate = 0;
    double state = 0;

    public Player(Keyboard input) {
        this.input = input;
        sprite = Sprite.grass;
        dir = Direction.DOWN;
    }

    public Player(int x, int y, Keyboard input) {
        this(input);// calls above
        this.x = x;
        this.y = y;
        //fireRate = MagicProjectile.FIRE_RATE;
    }

    public void update() {
        int xa = 0, ya = 0;
        if (input.up) {
            ya--;
        }
        if (input.down) {
            ya++;
        }
        if (input.left) {
            xa--;
        }
        if (input.right) {
            xa++;
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
        clear();
        if (fireRate > 0) {
            fireRate--;
        }
        updateShooting();
    }

    private void clear() {
        /*for (int i = 0; i < level.getProjectiles().size(); i++) {
         Projectile p = level.getProjectiles().get(i);
         if (p.isRemoved()) {
         level.getProjectiles().remove(i);
         }
         }*/
    }

    public void updateShooting() {
        /*if (Mouse.getButton() == 1 && fireRate <= 0) {
         double dx = Mouse.getX() - Game.width * Game.scale / 2;
         double dy = Mouse.getY() - Game.height * Game.scale / 2;
         double direction = Math.atan2(dy, dx);
         shoot(x, y, direction);
         fireRate = MagicProjectile.FIRE_RATE;
         }*/
    }

    public void render(Screen screen) {
        /*if (dir == Direction.RIGHT) {
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
         */

        screen.renderMob(x + screen.width / 2 - 16, y + screen.height / 2 - 16, sprite);
    }
}

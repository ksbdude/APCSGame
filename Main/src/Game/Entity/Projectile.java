/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.Entity;

import Game.Game;
import Game.Graphics.Screen;
import Game.Graphics.Sprite;
import Game.Levels.Level;

/**
 *
 * @author 16burnskevin
 */
public class Projectile extends Entity {

    private final double xOrigin, yOrigin;
    private double angle;
    private Sprite sprite;
    private double x, y;
    private double nx, ny;
    private double speed, range, damage;

    public Sprite getSprite() {
        return sprite;
    }

    public int getSpriteSize() {
        return sprite.SIZE;
    }

    public static final int FIRE_RATE = 10;

    public Projectile(double x, double y, double dir, Level l) {
        super(l);
        xOrigin = x;
        yOrigin = y;
        angle = dir;
        this.x = x;
        this.y = y;
        range = Math.random() * 50 + 100;
        damage = 20;
        speed = 3;
        sprite = Sprite.projectile;
        nx = speed * Math.cos(angle);
        ny = speed * Math.sin(angle);
        sprite = Sprite.projectile;
        level = l;
    }

    @Override
    public void update() {
        if (level.tilecollision((int) (x + nx), (int) (y + ny), 7, 5, 4)) {
            remove();
        }
        move();
    }

    public void move() {
        if (!level.tilecollision((int) (x + nx), (int) (y + 8 + ny), 1, 5, 4)) {
            x += nx;
            y += ny;
        } else {
            remove();
        }
        if (distance() > range) {
            remove();
        }
    }

    private double distance() {
        return Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (yOrigin - y)));
    }

    @Override
    public void render(Screen screen) {
        if (!isRemoved()) {
            screen.renderSprite((int) x + Game.width / 2 - 8, (int) y + Game.height / 2 - 8, sprite);
        }
    }
}

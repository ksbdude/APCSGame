package Game.Entity;

import Game.Game;
import Game.Graphics.Sprite;

public class Mob extends Entity {
	protected Sprite sprite;
	protected boolean moving = false;

	protected enum Direction {
		UP, LEFT, RIGHT, DOWN
	}

	boolean solid = true;
	protected Direction dir;

	public void move(int xa, int ya) {
		if (xa != 0 && ya != 0) {
			move(xa, 0);
			move(0, ya);
			return;
		}
		if (xa > 0)
			dir = Direction.RIGHT;
		if (xa < 0)
			dir = Direction.LEFT;
		if (ya > 0)
			dir = Direction.DOWN;
		if (ya < 0)
			dir = Direction.UP;

		if (solid) {
			if (!collision(xa, ya)) {
				x += xa;
				y += ya;
			}
		} else {
			x += xa;
			y += ya;
		}

	}
	//
	// public abstract void update();
	//
	// public abstract void render(Screen screen);

	protected void shoot(int xa, int xy, double dir) {
		// dir *= 180 / Math.PI;
		//Projectile p = new MagicProjectile(x, y, dir, Game.level);
		//level.add(p);
	}

	private boolean collision(int xa, int ya) {
		for (int c = 0; c < 4; c++) {
			int xt = ((x + xa + Game.width / 2) + c % 2 * 21 - 10) / 16;
			int yt = ((y + ya + Game.height / 2) + c / 2 * 16 - 1) / 16;
			if (level.getTile(xt, yt).solid()) {
				return true;
			}
		}
		//
		// System.out.println("x: " + ((x + xa + Game.width / 2) / 16) + "y: " +
		// ((y + ya + Game.height / 2) / 16));
		// if (level.getTile(((x + xa + Game.width / 2) / 16), ((y + ya +
		// Game.height / 2) / 16)).solid()) {
		// solid = true;
		//
		// } else if (level.getTile(((x + xa + Game.width / 2) / 16), ((16 + y +
		// ya + Game.height / 2) / 16))
		// .solid()) {
		// solid = true;
		// }

		return false;
	}
}

package Game.Entity;

import Game.Graphics.Screen;
import Game.Levels.Level;
import java.util.Random;

public class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();

	public Entity(Level level) {
		this.level = level;
	}

	public void update() {
		
	}

	public void render(Screen screen) {

	}

	public void remove() {
		removed = true;
	}

	public boolean isRemoved() {
		return removed;
	}
        
        public Level getLevel(){
            return level;
        }

}

package Game.Levels;

import Game.Entity.Entity;
import Game.Entity.Projectile;
import Game.Game;
import Game.Graphics.Screen;
import Game.Tile.Tile;
import java.util.ArrayList;
import java.util.List;

public class Level {

    public static Level spawn = new GenLevel(64, 64);
    public static Level level2 = new GenLevel(64, 64, 1);

    //public static Level dungeon = new DungeonLevel(2, 2);

    protected int width, height;
    protected int[][] tiles;

    List<Entity> entites = new ArrayList<Entity>();
    List<Projectile> projectiles = new ArrayList<Projectile>();

    public List<Projectile> getProjectiles() {
        return projectiles;
    }
    
    public List<Entity> getEntites() {
        return entites;
    }

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new int[width][height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
        generateLevel();
    }
    
    public void reset(){
        generateLevel();
    }

    protected void generateLevel() {

    }

    protected void loadLevel(String path) {

    }

    public void update() {
        for (Entity entite : entites) {
            entite.update();
        }
        for (Projectile projectile : projectiles) {
            projectile.update();
        }
        remove();
    }

    private void remove() {
        for (int i = 0; i < entites.size(); i++) {
            if (entites.get(i).isRemoved() == true) {
                entites.remove(i);
            }
        }
        for (int i = 0; i < projectiles.size(); i++) {
            if (projectiles.get(i).isRemoved() == true) {
                projectiles.remove(i);
            }
        }
    }

    public void add(Entity e) {
        if (e instanceof Projectile) {
            projectiles.add((Projectile) e);
        } else {
            entites.add(e);
        }
    }

    public void render(int xScroll, int yScroll, Screen screen) {
        screen.setOffset(xScroll, yScroll);
        int x0 = xScroll >> 4;
        int x1 = (xScroll + screen.width + 16) >> 4;
        int y0 = yScroll >> 4;
        int y1 = (yScroll + screen.height + 16) >> 4;

        for (int y = y0; y < y1; y++) {
            for (int x = x0; x < x1; x++) {
                getTile(x, y).render(x, y, screen);
            }
        }

        for (int i = 0; i < entites.size(); i++) {
            entites.get(i).render(screen);

        }
        for (int i = 0;
                i < projectiles.size();
                i++) {
            projectiles.get(i).render(screen);
        }
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x > width - 1 || y > height - 1) {
            return Tile.voidTile;
        } else if (tiles[x][y] == 1) {
            return Tile.grass;
        } else if (tiles[x][y] == 2) {
            return Tile.rock;
        } else if (tiles[x][y] == 3) {
            return Tile.sand;
        } else if (tiles[x][y] == 4) {
            return Tile.sand4;
        } else if (tiles[x][y] == 5) {
            return Tile.wall;
        } else if (tiles[x][y] == 11) {
            return Tile.door1;
        } else if (tiles[x][y] == 12) {
            return Tile.door2;
        } else if (tiles[x][y] == 13) {
            return Tile.door3;
        } else if (tiles[x][y] == 14) {
            return Tile.door4;
        }
        return Tile.voidTile;
    }

    public boolean tilecollision(int x, int y, int size, int xOffset, int yOffset) {
        for (int c = 0; c < 4; c++) {
            int xt = (x - c % 2 * size + (xOffset + Game.width / 2)) >> 4;
            int yt = (y - c / 2 * size + (yOffset + Game.height / 2)) >> 4;
            if (getTile(xt, yt).solid()) {
                return true;
            }
        }
        return false;
    }
}

package Game;

import Game.Graphics.Screen;
import Game.Tile.Tile;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.parser.Entity;

public class Level {

    public static Level spawn = new RandomLevel(64, 64);

    protected int width, height;
    protected int[] tileInt;
    protected int[] tiles;

    private List<Entity> entites = new ArrayList<Entity>();
    //List<Projectile> projectiles = new ArrayList<Projectile>();
    //List<Particle> particles = new ArrayList<Particle>();

    /*public List<Projectile> getProjectiles() {
     return projectiles;
     }
     */
    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        tileInt = new int[width * height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
        generateLevel();
    }

    protected void generateLevel() {

    }

    protected void loadLevel(String path) {

    }

    public void update() {
        /*for (int i = 0; i < entites.size(); i++) {
         entites.get(i).update();
         }
         for (int i = 0; i < projectiles.size(); i++) {
         projectiles.get(i).update();
         }
         for (int i = 0; i < particles.size(); i++) {
         particles.get(i).update();
         }
         */
        remove();
    }

    private void remove() {
        /*for (int i = 0; i < entites.size(); i++) {
         if (entites.get(i).isRemoved() == true) {
         entites.remove(i);
         }
         }
         for (int i = 0; i < projectiles.size(); i++) {
         if (projectiles.get(i).isRemoved() == true) {
         projectiles.remove(i);
         }
         }
         for (int i = 0; i < particles.size(); i++) {
         if (particles.get(i).isRemoved() == true) {
         particles.remove(i);
         }
         }
         */
    }

    private void time() {

    }

    public void add(Entity e) {
        /*e.init(this);
         if (e instanceof Particle) {
         particles.add((Particle) e);
         } else if (e instanceof Projectile) {
         projectiles.add((Projectile) e);
         } else {
         entites.add(e);
         }
         */
    }

    public void render(int xScroll, int yScroll, Screen screen) {
        // System.out.println("Called Level render");
        screen.setOffset(xScroll, yScroll);
        int x0 = xScroll >> 4;
        int x1 = (xScroll + screen.width + 16) >> 4;
        int y0 = yScroll >> 4;
        int y1 = (yScroll + screen.height + 16) >> 4;

        for (int y = y0; y < y1; y++) {
            for (int x = x0; x < x1; x++) {
                getTile(x, y).render(x, y, screen);
                // if (x + y * 16 < 0 || x + y * 16 >= 256) {
                // Tile.voidTile.render(x, y, screen);
                // continue;
                // }
                // tiles[x + y * 16].render(x, y, screen);
            }
        }

        /*for (int i = 0; i < entites.size(); i++) {
         entites.get(i).render(screen);
         }*/
        /*for (int i = 0; i < projectiles.size(); i++) {
         projectiles.get(i).render(screen);
         }
         for (int i = 0; i < particles.size(); i++) {
         particles.get(i).render(screen);
         }*/
    }

    // public void renderTopLayer(int xScroll, int yScroll, Screen screen) {
    // // System.out.println("Called Level render");
    // screen.setOffset(xScroll, yScroll);
    // int x0 = xScroll >> 4;
    // int x1 = (xScroll + screen.width + 16) >> 4;
    // int y0 = yScroll >> 4;
    // int y1 = (yScroll + screen.height + 16) >> 4;
    //
    // for (int y = y0; y < y1; y++) {
    // for (int x = x0; x < x1; x++) {
    // if (tiles[x + y * width] == 0xFFFF0000) {
    // Tile.wallTop.render(x, y, screen);
    // }
    // // if (x + y * 16 < 0 || x + y * 16 >= 256) {
    // // Tile.voidTile.render(x, y, screen);
    // // continue;
    // // }
    // // tiles[x + y * 16].render(x, y, screen);
    // }
    // }
    // }
    // Grass = 00FF00
    // Wall = 000000
    // Flower = FFFF00
    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0) {
            return Tile.voidTile;
        }
        if (x < 0 || y < 0) {
            return Tile.grass;
        } else if (x == 0 || y == 0) {
            return Tile.rock;
        }
        if (tileInt[x + y * width] == 1 || tileInt[x + y * width] == 3) {
            return Tile.sand;
        } else if (tileInt[x + y * width] == 2) {
            return Tile.rock;
        }
        return Tile.grass;
//        
//        if (x < 0 || y < 0 || x >= width || y >= height) {
//            return Tile.voidTile;
//        }
//
//        int tile = tiles[x + y * width];
//        if (tile == 0xFF00FF00) {
//            return Tile.grass;
//        } else if (tile == 0xFFFFFF00) {
//            return Tile.rock;
//        } else if (tile == 0xFF7F3300) {
//            return Tile.wood;
//        } else if (tile == 0xFFFF0000) {
//            return Tile.wallTop;
//        } else if (tile == 0xFFFFFFAA) {
//            return Tile.sand;
//        } else {
//            return Tile.voidTile;
//        }
    }

    public boolean tilecollision(int x, int y, int size, int xOffset, int yOffset) {
        for (int c = 0; c < 4; c++) {
            // double xt = ((x + Game.width / 2) + c % 2 * size) / 16;
            // double yt = ((y + Game.height / 2) + c % 2 * size) / 16;
            int xt = (x - c % 2 * size + (xOffset + Game.width / 2)) >> 4;
            int yt = (y - c / 2 * size + (yOffset + Game.height / 2)) >> 4;
            if (getTile(xt, yt).solid()) {
                return true;
            }
        }
        return false;
    }
}

package Game.Graphics;

import Game.Game;
import Game.Tile.Tile;

public class Screen {

    public int width, height;
    public int[] pixels;
    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE - 1;

    public int xOffset = Game.width / 2, yOffset = Game.height / 2;

    // public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

    public void renderTile(int xp, int yp, Tile tile) {
        renderSprite(xp, yp, tile.sprite);
    }

    public void renderSprite(int xp, int yp, Sprite sprite) {
        xp -= xOffset;
        yp -= yOffset;
        for (int y = 0; y < sprite.SIZE; y++) {
            int ya = y + yp;
            for (int x = 0; x < sprite.SIZE; x++) {
                int xa = x + xp;
                if (xa >= width || ya < 0 || ya >= height) {
                    break;
                }
                if (xa < 0) {
                    xa = 0;
                }
                int col = sprite.pixels[x + y * sprite.SIZE];
                if (col != 0xffff00ff) {
                    pixels[xa + ya * width] = col;
                }
            }
        }
    }
    
    public void renderSpriteSheet(int xp, int yp, SpriteSheet sprite) {
//        xp -= xOffset;
//        yp -= yOffset;
        for (int y = 0; y < sprite.HEIGHT; y++) {
            int ya = y + yp;
            for (int x = 0; x < sprite.WIDTH; x++) {
                int xa = x + xp;
                if (xa >= width || ya < 0 || ya >= height) {
                    break;
                }
                if (xa < 0) {
                    xa = 0;
                }
                int col = sprite.pixels[x + y * sprite.WIDTH];
                if (col != 0xffff00ff) {
                    pixels[xa + ya * width] = col;
                }
            }
        }
    }

    public void renderPixel(int x, int y, int color) {
        pixels[x + y * width] = color;
    }

    public void renderMob(int xp, int yp, Sprite sprite) {
        xp -= xOffset;
        yp -= yOffset;
        for (int y = 0; y < sprite.SIZE; y++) {
            int ya = y + yp;
            for (int x = 0; x < sprite.SIZE; x++) {
                int xa = x + xp;
                if (xa >= width || ya < 0 || ya >= height) {
                    break;
                }
                if (xa < 0) {
                    xa = 0;
                }
                int col = sprite.pixels[x + y * sprite.SIZE];
                if (col != 0xFFFF00FF) {
                    pixels[xa + ya * width] = col;
                }
            }
        }
    }

    public void renderBar(int xa, int ya, int w, int h, int color) {
        for (int x = xa; x < xa + w; x++) {
            for (int y = ya; y < ya + h; y++) {
                pixels[x + y * width] = color;
            }
        }
    }

    public void setOffset(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
}

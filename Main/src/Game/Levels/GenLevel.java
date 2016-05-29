package Game.Levels;

import Game.Entity.Enemy;
import Game.Tile.Tile;
import java.util.ArrayList;

public class GenLevel extends Level {

    public ArrayList<Structure> structures = new ArrayList<>();
    private final int type; //0 = grass, 1 = sand

    public GenLevel(int width, int height, int type) {
        super(width, height);
        this.type = type;
    }

    public GenLevel(int width, int height) {
        super(width, height);
        this.type = 0;
    }

    @Override
    protected void generateLevel() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (x == 0 || x == width - 1) {
                    tiles[x][y] = 0;
                } else if (y == 0 || y == height - 1) {
                    tiles[x][y] = 0;
                } else {
                    int random = (int) (Math.random() * 11) + 1;
                    if (random > 4) {
                        random = 1;
                    }
                    tiles[x][y] = random;
                }
            }
        }
        placestructure(Structure.dungeon);
        placestructure(Structure.dungeon);
        add(new Enemy(200, 200, Level.spawn));
        add(new Enemy(600, 600, Level.spawn));
    }

    @Override
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

    public void placestructure(Structure a) {
        int x = (int) (Math.random() * (width - a.getSize()));
        int y = (int) (Math.random() * (height - a.getSize()));
        //if(isValid(a, x, y)){
        placestructure(a, x, y);
        //}
    }

    private boolean isValid(Structure a, int x, int y) {
        if (structures.isEmpty()) {
            return true;
        }
//        for (int xa = 0; xa < structures.size(); xa++) {
//            for (int ya = 0; ya < structures.size(); ya++) {
//                if (x + a.getSize() > xa && y + a.getSize() > ya && x < xa + a.getSize() && y < ya + a.getSize()) {
//                    return false;
//                }
//            }
//        }
        return true;
    }

    public void placestructure(Structure a, int upperleftX, int upperleftY) {
        System.out.println("Structure placing");
        //CONVERT IMAGE TO PROPER FORMAT-----------------------------------------------------------

        //copies the pixel array and size from the floorplan (an image from the structure class)
        int size = a.getSize();
        int[] floorplan = a.getfloorplan();
        //converts to a 2d array for better placement on the map and replaces hex codes with tile ID#
        int[][] build = singleto2D(floorplan, size);

        //CONFIRM LOCATION TO PLACE STRUCTURE------------------------------------------------------
        int upperleftcornerX = upperleftX;
        int upperleftcornerY = upperleftY;

        //PLACE STRUCTURE ON THE MAP.--------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (build[i][j] == 0xFF000000) {
                    tiles[upperleftcornerX + i][upperleftcornerY + j] = 5;
                } else if (build[i][j] == 0xFFFFAEC9) {
                    tiles[upperleftcornerX + i][upperleftcornerY + j] = 11;
                } else if (build[i][j] == 0xFFFF0080) {
                    tiles[upperleftcornerX + i][upperleftcornerY + j] = 12;
                } else if (build[i][j] == 0xFFFF719F) {
                    tiles[upperleftcornerX + i][upperleftcornerY + j] = 13;
                } else if (build[i][j] == 0xFFFF00FF) {
                    tiles[upperleftcornerX + i][upperleftcornerY + j] = 14;
                } else {
                    tiles[upperleftcornerX + i][upperleftcornerY + j] = 1;
                }
                System.out.print(tiles[upperleftcornerX + i][upperleftcornerY + j] + "\t");
                //tiles[upperleftcornerX + i][upperleftcornerY + j] = build[i][j];
            }
            System.out.println();
        }
    }

    public int[][] singleto2D(int[] a, int b) {
        //converts single line array to 2d array.
        int size = b;
        int[][] building = new int[size][size];

        for (int s = 0; s < size; s += 1) {
            for (int i = 0; i < size; i++) {
                building[i][s] = a[s * size + i];
            }
        }
        return building;
    }
}

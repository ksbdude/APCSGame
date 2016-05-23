package Game.Levels;

import Game.Tile.Tile;
import java.util.ArrayList;

public class GenLevel extends Level {

    private ArrayList<Integer> addedstructureX = new ArrayList<Integer>();
    private ArrayList<Integer> addedstructureY = new ArrayList<Integer>();
    private int wall = 0, floor1 = 1, floor2 = 2;

    public GenLevel(int width, int height) {
        super(width, height);
    }

    protected void generateLevel() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (x == 0 || x == width - 1) {
                    tiles[x][y] = 0;
                } else if (y == 0 || y == height - 1) {
                    tiles[x][y] = 0;
                } else {
                    tiles[x][y] = (int) (Math.random() * 11) + 1;
                }
            }
        }
        placestructure(Structure.dungeon);
    }

    @Override
    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0) {
            return Tile.voidTile;
        }
        if (tiles[x][y] < 9) {
            return Tile.grass;
        } else if (tiles[x][y] == 9) {
            return Tile.rock;
        } else if (tiles[x][y] == 10) {
            return Tile.sand;
        } else if (tiles[x][y] == 11) {
            return Tile.sand4;
        }
        return Tile.voidTile;
    }

    public void placestructure(Structure a) {
        System.out.println("Structure placing");
        //CONVERT IMAGE TO PROPER FORMAT-----------------------------------------------------------

        //copies the pixel array and size from the floorplan (an image from the structure class)
        int size = a.getSize();
        int[] floorplan = a.getfloorplan();
        //converts to a 2d array for better placement on the map
        int[][] build = singleto2D(floorplan, size);
        build = hexToInt(build);

        //FIND AND CONFIRM LOCATION TO PLACE STRUCTURE---------------------------------------------
        int upperleftcornerX = 1;
        int upperleftcornerY = 1;

        //check if structure goes outside of the level map or if structure is going to be placed in another structure. If yes, find another location at random.
        ArrayList<Integer> tempX = new ArrayList<Integer>();
        ArrayList<Integer> tempY = new ArrayList<Integer>();

        do {
            tempX.clear();
            tempY.clear();
            upperleftcornerX = (int) (Math.random() * width);
            upperleftcornerY = (int) (Math.random() * height);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    tempX.add(upperleftcornerX + i);
                    tempY.add(upperleftcornerY + j);
                }
            }
        } while ((upperleftcornerX + size) >= width || (upperleftcornerY + size) >= height );

        //PLACE STRUCTURE ON THE MAP.--------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tiles[upperleftcornerX + i][upperleftcornerY + j] = build[i][j];
                System.out.println(build[i][j]);
//                addedstructureX.add(upperleftcornerX + i);
//                addedstructureY.add(upperleftcornerY + j);
            }
            System.out.println();
        }
    }

    public void placestructure(Structure a, int upperleftX, int upperleftY) {
        //CONVERT IMAGE TO PROPER FORMAT-----------------------------------------------------------

        //copies the pixel array and size from the floorplan (an image from the structure class)
        int size = a.getSize();
        int[] floorplan = a.getfloorplan();
        //converts to a 2d array for better placement on the map and replaces hex codes with tile ID#
        int[][] build = singleto2D(floorplan, size);
        build = hexToInt(build);

        //CONFIRM LOCATION TO PLACE STRUCTURE------------------------------------------------------
        int upperleftcornerX = upperleftX;
        int upperleftcornerY = upperleftY;

        //PLACE STRUCTURE ON THE MAP.--------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tiles[upperleftcornerX + i][upperleftcornerY + j] = build[i][j];
            }
        }
    }

    public int[][] singleto2D(int[] a, int b) {
        //converts single line array to 2d array.
        int size = b;
        int[][] building = new int[size][size];

        for (int s = 0; s < size; s += size) {
            for (int i = 0; i < size; i++) {
                building[i][s] = a[s * size + i];
            }
        }
        return building;
    }

    public int[][] hexToInt(int[][] a) {
        //reads building array and replaces the HEXADECIMAL color codes with int that represents what tile is supposed to go there.
        int[][] building = new int[a.length][a[0].length];
        building = a;
        for (int r = 0; r < building.length; r++) {
            for (int c = 0; c < building[0].length; c++) {
                if (building[r][c] == 0xFFFFFFFF) //black
                {
                    building[r][c] = wall;
                } else if (building[r][c] == 0xff22B14C) //green
                {
                    building[r][c] = (int) (Math.random() * 11) + 1;;  //any green will be the same as the floor of the map.
                }                //list other hex codes and conversion here:
            }
        }
        return building;
    }

//    public boolean validstructurelocation(ArrayList<Integer> aX, ArrayList<Integer> aY, ArrayList<Integer> bX, ArrayList<Integer> bY, int s) {
//        for (int i = 0; i < s; i++) {
//            for (int j = 0; j < s; j++) {
//                if (aX.contains(bX.get(i)) && aY.contains(bY.get(j))) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}

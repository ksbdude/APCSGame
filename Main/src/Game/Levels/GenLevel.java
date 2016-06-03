package Game.Levels;

import Game.Entity.Enemy;
import Game.Tile.Tile;
import java.util.ArrayList;

public class GenLevel extends Level {

    public ArrayList<Structure> structures = new ArrayList<>();
    private int type; //0 = grass, 1 = sand, 2 = dungeon

    //DUNGEON ONLY-------------------
    RoomGen rooms = new RoomGen(3, 3);
    int[][] map = new int[3][3];
    //-------------------------------

    public GenLevel(int width, int height, int type) {
        super(width, height);
        this.type = type;

        //--------------------------------------------------
        //DUNGEON ONLY (print out "layout" of dungeons)-----
        map = rooms.getmap();
        for (int f = 0; f < map.length; f++) {
            for (int k = 0; k < map[0].length; k++) {
                System.out.print(map[f][k] + "\t");
            }
            System.out.println();
        }
        //--------------------------------------------------
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
                    if (type == 1 && (random == 1 || random == 2)) {
                        random = 3;
                    }

                    tiles[x][y] = random;
                }
            }
        }
        if (type == 0) {
            System.out.println(0);
            placestructure(Structure.dungeon);
            for (int i = 0; i < 100; i++) {
                add(new Enemy((int) (Math.random() * 3000) + 100, (int) (Math.random() * 3000) + 100));
            }
        } else if (type == 1) {
            System.out.println(1);
            placestructure(Structure.dungeon);
            add(new Enemy(200, 200));
            add(new Enemy(600, 600));
        } else {
//            System.out.println(2);
//            for (int r = 0; r < map.length; r++) {
//                for (int c = 0; c < map[0].length; c++) {
//                    if (map[r][c] == 1) {
//                        placestructure(Structure.r1, r * 24, c * 24);
//                    } else if (map[r][c] == 2) {
//                        placestructure(Structure.r2, r * 24, c * 24);
//                    } else if (map[r][c] == 3) {
//                        placestructure(Structure.r3, r * 24, c * 24);
//                    } else if (map[r][c] == 4) {
//                        placestructure(Structure.r4, r * 24, c * 24);
//                    } else if (map[r][c] == 5) {
//                        placestructure(Structure.r5, r * 24, c * 24);
//                    } else if (map[r][c] == 6) {
//                        placestructure(Structure.r6, r * 24, c * 24);
//                    } else if (map[r][c] == 7) {
//                        placestructure(Structure.r7, r * 24, c * 24);
//                    } else if (map[r][c] == 8) {
//                        placestructure(Structure.r8, r * 24, c * 24);
//                    } else if (map[r][c] == 9) {
//                        placestructure(Structure.r9, r * 24, c * 24);
//                    } else if (map[r][c] == 10) {
//                        placestructure(Structure.r10, r * 24, c * 24);
//                    } else if (map[r][c] == 11) {
//                        placestructure(Structure.r11, r * 24, c * 24);
//                    } else if (map[r][c] == 12) {
//                        placestructure(Structure.r12, r * 24, c * 24);
//                    } else if (map[r][c] == 13) {
//                        placestructure(Structure.r13, r * 24, c * 24);
//                    } else if (map[r][c] == 14) {
//                        placestructure(Structure.r14, r * 24, c * 24);
//                    } else if (map[r][c] == 15) {
//                        placestructure(Structure.r15, r * 24, c * 24);
//                    } else if (map[r][c] == 16) {
//                        placestructure(Structure.r16, r * 24, c * 24);
//                    } else if (map[r][c] == 17) {
//                        placestructure(Structure.r17, r * 24, c * 24);
//                    } else if (map[r][c] == 18) {
//                        placestructure(Structure.r18, r * 24, c * 24);
//                    } else if (map[r][c] == 19) {
//                        placestructure(Structure.r19, r * 24, c * 24);
//                    } else if (map[r][c] == 20) {
//                        placestructure(Structure.r20, r * 24, c * 24);
//                    } else if (map[r][c] == 21) {
//                        placestructure(Structure.r21, r * 24, c * 24);
//                    } else if (map[r][c] == 22) {
//                        placestructure(Structure.r22, r * 24, c * 24);
//                    } else if (map[r][c] == 23) {
//                        placestructure(Structure.r23, r * 24, c * 24);
//                    } else if (map[r][c] == 24) {
//                        placestructure(Structure.r24, r * 24, c * 24);
//                    } else if (map[r][c] == 25) {
//                        placestructure(Structure.r25, r * 24, c * 24);
//                    } else if (map[r][c] == 26) {
//                        placestructure(Structure.r26, r * 24, c * 24);
//                    } else if (map[r][c] == 27) {
//                        placestructure(Structure.r27, r * 24, c * 24);
//                    } else if (map[r][c] == 28) {
//                        placestructure(Structure.r28, r * 24, c * 24);
//                    } else if (map[r][c] == 29) {
//                        placestructure(Structure.r29, r * 24, c * 24);
//                    } else if (map[r][c] == 30) {
//                        placestructure(Structure.r30, r * 24, c * 24);
//                    } else if (map[r][c] == 31) {
//                        placestructure(Structure.r31, r * 24, c * 24);
//                    } else if (map[r][c] == 32) {
//                        placestructure(Structure.r32, r * 24, c * 24);
//                    } else if (map[r][c] == 33) {
//                        placestructure(Structure.r33, r * 24, c * 24);
//                    } else if (map[r][c] == 34) {
//                        placestructure(Structure.r34, r * 24, c * 24);
//                    } else if (map[r][c] == 35) {
//                        placestructure(Structure.r35, r * 24, c * 24);
//                    } else if (map[r][c] == 36) {
//                        placestructure(Structure.r36, r * 24, c * 24);
//                    } else if (map[r][c] == 37) {
//                        placestructure(Structure.r37, r * 24, c * 24);
//                    } else if (map[r][c] == 38) {
//                        placestructure(Structure.r38, r * 24, c * 24);
//                    } else if (map[r][c] == 39) {
//                        placestructure(Structure.r39, r * 24, c * 24);
//                    } else if (map[r][c] == 40) {
//                        placestructure(Structure.r40, r * 24, c * 24);
//                    } else if (map[r][c] == 41) {
//                        placestructure(Structure.r41, r * 24, c * 24);
//                    } else if (map[r][c] == 42) {
//                        placestructure(Structure.r42, r * 24, c * 24);
//                    } else if (map[r][c] == 43) {
//                        placestructure(Structure.r43, r * 24, c * 24);
//                    } else if (map[r][c] == 44) {
//                        placestructure(Structure.r44, r * 24, c * 24);
//                    } else if (map[r][c] == 45) {
//                        placestructure(Structure.r45, r * 24, c * 24);
//                    } else if (map[r][c] == 46) {
//                        placestructure(Structure.r46, r * 24, c * 24);
//                    } else if (map[r][c] == 47) {
//                        placestructure(Structure.r47, r * 24, c * 24);
//                    } else if (map[r][c] == 48) {
//                        placestructure(Structure.r48, r * 24, c * 24);
//                    } else if (map[r][c] == 49) {
//                        placestructure(Structure.r49, r * 24, c * 24);
//                    } else if (map[r][c] == 50) {
//                        placestructure(Structure.r50, r * 24, c * 24);
//                    } else if (map[r][c] == 51) {
//                        placestructure(Structure.r51, r * 24, c * 24);
//                    } else if (map[r][c] == 52) {
//                        placestructure(Structure.r52, r * 24, c * 24);
//                    } else if (map[r][c] == 53) {
//                        placestructure(Structure.r53, r * 24, c * 24);
//                    } else if (map[r][c] == 54) {
//                        placestructure(Structure.r54, r * 24, c * 24);
//                    } else if (map[r][c] == 55) {
//                        placestructure(Structure.r55, r * 24, c * 24);
//                    } else if (map[r][c] == 56) {
//                        placestructure(Structure.r56, r * 24, c * 24);
//                    } else if (map[r][c] == 57) {
//                        placestructure(Structure.r57, r * 24, c * 24);
//                    } else if (map[r][c] == 58) {
//                        placestructure(Structure.r58, r * 24, c * 24);
//                    } else if (map[r][c] == 59) {
//                        placestructure(Structure.r59, r * 24, c * 24);
//                    } else if (map[r][c] == 60) {
//                        placestructure(Structure.r60, r * 24, c * 24);
//                    } else if (map[r][c] == 61) {
//                        placestructure(Structure.r61, r * 24, c * 24);
//                    } else if (map[r][c] == 62) {
//                        placestructure(Structure.r62, r * 24, c * 24);
//                    } else if (map[r][c] == 63) {
//                        placestructure(Structure.r63, r * 24, c * 24);
//                    } else if (map[r][c] == 64) {
//                        placestructure(Structure.r64, r * 24, c * 24);
//                    } else if (map[r][c] == 65) {
//                        placestructure(Structure.r65, r * 24, c * 24);
//                    } else if (map[r][c] == 66) {
//                        placestructure(Structure.r66, r * 24, c * 24);
//                    } else if (map[r][c] == 67) {
//                        placestructure(Structure.r67, r * 24, c * 24);
//                    } else if (map[r][c] == 68) {
//                        placestructure(Structure.r68, r * 24, c * 24);
//                    } else if (map[r][c] == 69) {
//                        placestructure(Structure.r69, r * 24, c * 24);
//                    } else if (map[r][c] == 70) {
//                        placestructure(Structure.r70, r * 24, c * 24);
//                    } else if (map[r][c] == 71) {
//                        placestructure(Structure.r71, r * 24, c * 24);
//                    } else if (map[r][c] == 72) {
//                        placestructure(Structure.r72, r * 24, c * 24);
//                    } else if (map[r][c] == 73) {
//                        placestructure(Structure.r73, r * 24, c * 24);
//                    } else if (map[r][c] == 74) {
//                        placestructure(Structure.r74, r * 24, c * 24);
//                    } else if (map[r][c] == 75) {
//                        placestructure(Structure.r75, r * 24, c * 24);
//                    } else if (map[r][c] == 76) {
//                        placestructure(Structure.r76, r * 24, c * 24);
//                    } else if (map[r][c] == 77) {
//                        placestructure(Structure.r77, r * 24, c * 24);
//                    } else if (map[r][c] == 78) {
//                        placestructure(Structure.r78, r * 24, c * 24);
//                    } else if (map[r][c] == 79) {
//                        placestructure(Structure.r79, r * 24, c * 24);
//                    } else if (map[r][c] == 80) {
//                        placestructure(Structure.r80, r * 24, c * 24);
//                    } else if (map[r][c] == 81) {
//                        placestructure(Structure.r81, r * 24, c * 24);
//                    } else if (map[r][c] == 82) {
//                        placestructure(Structure.r82, r * 24, c * 24);
//                    } else if (map[r][c] == 83) {
//                        placestructure(Structure.r83, r * 24, c * 24);
//                    } else if (map[r][c] == 84) {
//                        placestructure(Structure.r84, r * 24, c * 24);
//                    } else if (map[r][c] == 85) {
//                        placestructure(Structure.r85, r * 24, c * 24);
//                    } else if (map[r][c] == 86) {
//                        placestructure(Structure.r86, r * 24, c * 24);
//                    } else if (map[r][c] == 87) {
//                        placestructure(Structure.r87, r * 24, c * 24);
//                    } else if (map[r][c] == 88) {
//                        placestructure(Structure.r88, r * 24, c * 24);
//                    } else if (map[r][c] == 89) {
//                        placestructure(Structure.r89, r * 24, c * 24);
//                    } else if (map[r][c] == 90) {
//                        placestructure(Structure.r90, r * 24, c * 24);
//                    } else if (map[r][c] == 91) {
//                        placestructure(Structure.r91, r * 24, c * 24);
//                    } else if (map[r][c] == 92) {
//                        placestructure(Structure.r92, r * 24, c * 24);
//                    } else if (map[r][c] == 93) {
//                        placestructure(Structure.r93, r * 24, c * 24);
//                    } else if (map[r][c] == 94) {
//                        placestructure(Structure.r94, r * 24, c * 24);
//                    } else if (map[r][c] == 95) {
//                        placestructure(Structure.r95, r * 24, c * 24);
//                    } else if (map[r][c] == 96) {
//                        placestructure(Structure.r96, r * 24, c * 24);
//                    } else if (map[r][c] == 97) {
//                        placestructure(Structure.r97, r * 24, c * 24);
//                    } else if (map[r][c] == 98) {
//                        placestructure(Structure.r98, r * 24, c * 24);
//                    } else if (map[r][c] == 99) {
//                        placestructure(Structure.r99, r * 24, c * 24);
//                    } else if (map[r][c] == 100) {
//                        placestructure(Structure.r100, r * 24, c * 24);
//                    } else if (map[r][c] == 101) {
//                        placestructure(Structure.r101, r * 24, c * 24);
//                    } else if (map[r][c] == 102) {
//                        placestructure(Structure.r102, r * 24, c * 24);
//                    } else if (map[r][c] == 103) {
//                        placestructure(Structure.r103, r * 24, c * 24);
//                    } else if (map[r][c] == 104) {
//                        placestructure(Structure.r104, r * 24, c * 24);
//                    } else if (map[r][c] == 105) {
//                        placestructure(Structure.r105, r * 24, c * 24);
//                    } else if (map[r][c] == 106) {
//                        placestructure(Structure.r106, r * 24, c * 24);
//                    } else if (map[r][c] == 107) {
//                        placestructure(Structure.r107, r * 24, c * 24);
//                    } else if (map[r][c] == 108) {
//                        placestructure(Structure.r108, r * 24, c * 24);
//                    } else if (map[r][c] == 109) {
//                        placestructure(Structure.r109, r * 24, c * 24);
//                    } else if (map[r][c] == 110) {
//                        placestructure(Structure.r110, r * 24, c * 24);
//                    } else if (map[r][c] == 111) {
//                        placestructure(Structure.r111, r * 24, c * 24);
//                    } else if (map[r][c] == 112) {
//                        placestructure(Structure.r112, r * 24, c * 24);
//                    } else if (map[r][c] == 113) {
//                        placestructure(Structure.r113, r * 24, c * 24);
//                    } else if (map[r][c] == 114) {
//                        placestructure(Structure.r114, r * 24, c * 24);
//                    } else if (map[r][c] == 115) {
//                        placestructure(Structure.r115, r * 24, c * 24);
//                    } else if (map[r][c] == 116) {
//                        placestructure(Structure.r116, r * 24, c * 24);
//                    } else if (map[r][c] == 117) {
//                        placestructure(Structure.r117, r * 24, c * 24);
//                    } else if (map[r][c] == 118) {
//                        placestructure(Structure.r118, r * 24, c * 24);
//                    } else if (map[r][c] == 119) {
//                        placestructure(Structure.r119, r * 24, c * 24);
//                    } else if (map[r][c] == 120) {
//                        placestructure(Structure.r120, r * 24, c * 24);
//                    } else if (map[r][c] == 121) {
//                        placestructure(Structure.r121, r * 24, c * 24);
//                    } else if (map[r][c] == 122) {
//                        placestructure(Structure.r122, r * 24, c * 24);
//                    } else if (map[r][c] == 123) {
//                        placestructure(Structure.r123, r * 24, c * 24);
//                    } else if (map[r][c] == 124) {
//                        placestructure(Structure.r124, r * 24, c * 24);
//                    } else if (map[r][c] == 125) {
//                        placestructure(Structure.r125, r * 24, c * 24);
//                    } else if (map[r][c] == 126) {
//                        placestructure(Structure.r126, r * 24, c * 24);
//                    } else if (map[r][c] == 127) {
//                        placestructure(Structure.r127, r * 24, c * 24);
//                    } else if (map[r][c] == 128) {
//                        placestructure(Structure.r128, r * 24, c * 24);
//                    } else if (map[r][c] == 129) {
//                        placestructure(Structure.r129, r * 24, c * 24);
//                    } else if (map[r][c] == 130) {
//                        placestructure(Structure.r130, r * 24, c * 24);
//                    } else if (map[r][c] == 131) {
//                        placestructure(Structure.r131, r * 24, c * 24);
//                    } else if (map[r][c] == 132) {
//                        placestructure(Structure.r132, r * 24, c * 24);
//                    } else if (map[r][c] == 133) {
//                        placestructure(Structure.r133, r * 24, c * 24);
//                    } else if (map[r][c] == 134) {
//                        placestructure(Structure.r134, r * 24, c * 24);
//                    } else if (map[r][c] == 135) {
//                        placestructure(Structure.r135, r * 24, c * 24);
//                    } else if (map[r][c] == 136) {
//                        placestructure(Structure.r136, r * 24, c * 24);
//                    } else if (map[r][c] == 137) {
//                        placestructure(Structure.r137, r * 24, c * 24);
//                    } else if (map[r][c] == 138) {
//                        placestructure(Structure.r138, r * 24, c * 24);
//                    } else if (map[r][c] == 139) {
//                        placestructure(Structure.r139, r * 24, c * 24);
//                    } else if (map[r][c] == 140) {
//                        placestructure(Structure.r140, r * 24, c * 24);
//                    } else if (map[r][c] == 141) {
//                        placestructure(Structure.r141, r * 24, c * 24);
//                    } else if (map[r][c] == 142) {
//                        placestructure(Structure.r142, r * 24, c * 24);
//                    } else if (map[r][c] == 143) {
//                        placestructure(Structure.r143, r * 24, c * 24);
//                    } else if (map[r][c] == 144) {
//                        placestructure(Structure.r144, r * 24, c * 24);
//                    } else if (map[r][c] == 145) {
//                        placestructure(Structure.r145, r * 24, c * 24);
//                    } else if (map[r][c] == 146) {
//                        placestructure(Structure.r146, r * 24, c * 24);
//                    } else if (map[r][c] == 147) {
//                        placestructure(Structure.r147, r * 24, c * 24);
//                    } else if (map[r][c] == 148) {
//                        placestructure(Structure.r148, r * 24, c * 24);
//                    } else if (map[r][c] == 149) {
//                        placestructure(Structure.r149, r * 24, c * 24);
//                    } else if (map[r][c] == 150) {
//                        placestructure(Structure.r150, r * 24, c * 24);
//                    } else //Just in case
//                    {
//                        placestructure(Structure.r121, r * 24, c * 24);
//                    }
//                }
//            }
        }
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
                //System.out.print(tiles[upperleftcornerX + i][upperleftcornerY + j] + "\t");
                //tiles[upperleftcornerX + i][upperleftcornerY + j] = build[i][j];
            }
            //System.out.println();
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

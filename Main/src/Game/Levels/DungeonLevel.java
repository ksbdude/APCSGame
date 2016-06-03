package Game.Levels;

public class DungeonLevel extends Level {

    RoomGen rooms = new RoomGen(3, 3);

    int w, h;

    public DungeonLevel(int width, int height) {
        super(width * 24, height * 24);
        w = width;
        h = height;
    }

    @Override
    protected void generateLevel() {
        //decides what room goes where
//        for (int x = 0; x < width; x++) {
//            for (int y = 0; y < height; y++) {
//                rooms[x][y] = 0;
//            }
//        }

        //gets tile for each room
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                System.out.println(x + " " + y);
                
                int ypos = y % 24;
                int xpos = x % 24;

                //tiles[x][y] = DungeonRoom.rooms.get(rooms.getmap()[x/24][y/24]).getTile(xpos, ypos);
                int room = rooms.getmap()[x / 24][y / 24];

                if (room == 1) {
                    tiles[x][y] = DungeonRoom.r1.getTile(ypos, xpos);
                } else if (room == 2) {
                    tiles[x][y] = DungeonRoom.r2.getTile(ypos, xpos);
                } else if (room == 3) {
                    tiles[x][y] = DungeonRoom.r3.getTile(ypos, xpos);
                } else if (room == 4) {
                    tiles[x][y] = DungeonRoom.r4.getTile(ypos, xpos);
                } else if (room == 5) {
                    tiles[x][y] = DungeonRoom.r5.getTile(ypos, xpos);
                } else if (room == 6) {
                    tiles[x][y] = DungeonRoom.r6.getTile(ypos, xpos);
                } else if (room == 7) {
                    tiles[x][y] = DungeonRoom.r7.getTile(ypos, xpos);
                } else if (room == 8) {
                    tiles[x][y] = DungeonRoom.r8.getTile(ypos, xpos);
                } else if (room == 9) {
                    tiles[x][y] = DungeonRoom.r9.getTile(ypos, xpos);
                } else if (room == 10) {
                    tiles[x][y] = DungeonRoom.r10.getTile(ypos, xpos);
                }
                
                else if (room == 11) {
                    tiles[x][y] = DungeonRoom.r11.getTile(ypos, xpos);
                } else if (room == 12) {
                    tiles[x][y] = DungeonRoom.r12.getTile(ypos, xpos);
                } else if (room == 13) {
                    tiles[x][y] = DungeonRoom.r13.getTile(ypos, xpos);
                } else if (room == 14) {
                    tiles[x][y] = DungeonRoom.r14.getTile(ypos, xpos);
                } else if (room == 15) {
                    tiles[x][y] = DungeonRoom.r15.getTile(ypos, xpos);
                } else if (room == 16) {
                    tiles[x][y] = DungeonRoom.r16.getTile(ypos, xpos);
                } else if (room == 17) {
                    tiles[x][y] = DungeonRoom.r17.getTile(ypos, xpos);
                } else if (room == 18) {
                    tiles[x][y] = DungeonRoom.r18.getTile(ypos, xpos);
                } else if (room == 19) {
                    tiles[x][y] = DungeonRoom.r19.getTile(ypos, xpos);
                } else if (room == 20) {
                    tiles[x][y] = DungeonRoom.r20.getTile(ypos, xpos);
                    
                    
                } else {
                    tiles[x][y] = DungeonRoom.r121.getTile(ypos, xpos);
                }

                if (x == 0 || y == 0) {
                    tiles[x][y] = 5;
                }
            }
        }
    }
}

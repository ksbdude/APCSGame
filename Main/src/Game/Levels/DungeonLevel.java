package Game.Levels;

public class DungeonLevel extends Level {

    int[][] rooms;
    int w, h;

    public DungeonLevel(int width, int height) {
        super(width * 24, height * 24);
        w = width;
        h = height;
    }

    @Override
    protected void generateLevel() {
        rooms = new int[2][2];
        //decides what room goes where
//        for (int x = 0; x < width; x++) {
//            for (int y = 0; y < height; y++) {
//                rooms[x][y] = 0;
//            }
//        }
        rooms[0][0] = 0;
        rooms[0][1] = 1;
        rooms[1][0] = 1;
        rooms[1][1] = 1;

        //gets tile for each room
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                
                int ypos = y % 24;
                int xpos = x % 24;
                int r = rooms[x / 24][y / 24];
                if (r == 0) {
                    tiles[x][y] = DungeonRoom.r121.getTile(ypos, xpos);
                } else {
                    tiles[x][y] = DungeonRoom.r121.getTile(ypos, xpos);
                }
                if(x == 0 || y == 0){
                    tiles[x][y] = 5;
                }
            }
        }
    }
}

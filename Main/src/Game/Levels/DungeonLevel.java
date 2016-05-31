package Game.Levels;

public class DungeonLevel extends Level {

    public DungeonLevel(int width, int height) {
        super(width * 24, height * 24);
    }

    int[][] rooms = new int[width][height];

    @Override
    protected void generateLevel() {
        //decides what room goes where
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                rooms[x][y] = 0;
            }
        }

        //gets tile for each room
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (rooms[x][y] == 0) {

                    for (int xa = 0; xa < 24; xa++) {
                        for (int ya = 0; ya < 24; ya++) {
                            tiles[xa + 24 * width][ya + 24 * height] = DungeonRoom.room1.getTile(xa, ya);
                        }
                    }

                }
            }
        }
    }
}


public class RoomStructure {

    private int[][] layout;

    //16x16 tiles per rooms
    public int getvariation(int min) {
        return (int) (Math.random() * 10) + min;
    }

    /*15 total rooms
    0     - block room
    1~40  - single opening
    41~80 - double opening (also 131~150)
    81~120 - triple opening
    121~130- all opening
     */
    public int getlayout(int roomstyle) {
        if (roomstyle == 0) {
            return 0;
        }
        if (roomstyle == 1) {
            return getvariation(1);
        } else if (roomstyle == 2) {
            return getvariation(11);
        } else if (roomstyle == 3) {
            return getvariation(21);
        } else if (roomstyle == 4) {
            return getvariation(31);
        } else if (roomstyle == 5) {
            return getvariation(41);
        } else if (roomstyle == 6) {
            return getvariation(51);
        } else if (roomstyle == 7) {
            return getvariation(61);
        } else if (roomstyle == 8) {
            return getvariation(71);
        } else if (roomstyle == 9) {
            return getvariation(81);
        } else if (roomstyle == 10) {
            return getvariation(91);
        } else if (roomstyle == 11) {
            return getvariation(101);
        } else if (roomstyle == 12) {
            return getvariation(111);
        } else if (roomstyle == 13) {
            return getvariation(121);
        } else if (roomstyle == 14) {
            return getvariation(131);
        } else {
            return getvariation(141);
        }
    }

    public int[][] assignvariation(int[][] dung) {
        int[][] dungy = new int[dung.length][dung.length];
        for (int x = 0; x < dungy.length; x++) {
            for (int y = 0; y < dungy.length; y++) {
                dungy[x][y] = getlayout(dung[x][y]);
            }
        }
        return dungy;
    }
}

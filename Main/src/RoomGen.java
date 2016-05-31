
public class RoomGen {

    private int[][] dungen;

    public RoomGen(int x, int y) {
        dungen = new int[x][y];
    }

    public int[][] getmap() {
        return dungen;
    }

    /*14 total rooms
     0   - block room
     1~4 - single opening
     5~8 - double opening
     9~12- triple opening
     13  - all opening
     */
    public void generateblock() {
        for (int x = 0; x < dungen.length; x++) {
            for (int y = 0; y < dungen.length; y++) {
                int rng = (int) (Math.random() * 2);

                if (rng == 1 && dungen[x][y] != -1) {
                    //not efficient AF change later if poss
                    dungen[x][y] = 0;
                    if (x != 0) {
                        dungen[x - 1][y] = -1;
                    }
                    if (y != 0) {
                        dungen[x][y - 1] = -1;
                    }
                    if (x != 0 && y != 0) {
                        dungen[x - 1][y - 1] = -1;
                    }
                    if (x != 0 && y != dungen[0].length - 1) {
                        dungen[x - 1][y + 1] = -1;
                    }
                    if (x != dungen.length - 1) {
                        dungen[x + 1][y] = -1;
                    }
                    if (x != dungen.length - 1 && y != 0) {
                        dungen[x + 1][y - 1] = -1;
                    }
                    if (y != dungen[0].length - 1) {
                        dungen[x][y + 1] = -1;
                    }
                    if (x != dungen.length - 1 && y != dungen[0].length - 1) {
                        dungen[x + 1][y + 1] = -1;
                    }
                }
            }
        }
    }

    public void fillrooms() {
        for (int x = 0; x < dungen.length; x++) {
            for (int y = 0; y < dungen.length; y++) {
                boolean up = false; //true==blocked
                boolean down = false;
                boolean left = false;
                boolean right = false;
                int blocked = 0;

                //mark status
                if (dungen[x][y] != 0) {
                    dungen[x][y] = 2;
                    if (x != 0) {
                        if (dungen[x - 1][y] == 0) {
                            up = true;
                            blocked++;
                        }
                    } else {
                        up = true;
                        blocked++;
                    }
                    if (y != 0) {
                        if (dungen[x][y - 1] == 0) {
                            left = true;
                            blocked++;
                        }
                    } else {
                        left = true;
                        blocked++;
                    }
                    if (x < dungen.length - 1) {
                        if (dungen[x + 1][y] == 0) {
                            down = true;
                            blocked++;
                        }
                    } else {
                        down = true;
                        blocked++;
                    }
                    if (y < dungen.length - 1) {
                        if (dungen[x][y + 1] == 0) {
                            right = true;
                            blocked++;
                        }
                    } else {
                        right = true;
                        blocked++;
                    }

                    //set room layout
                    if (blocked <= 0) {
                        dungen[x][y] = 13;
                    } else if (blocked == 1) {
                        if (up == true) {
                            dungen[x][y] = 11;
                        }
                        if (down == true) {
                            dungen[x][y] = 9;
                        }
                        if (left == true) {
                            dungen[x][y] = 10;
                        }
                        if (right == true) {
                            dungen[x][y] = 12;
                        }
                    } else if (blocked == 2) {
                        if (up == true && down == true) {
                            dungen[x][y] = 15;
                        }
                        if (up == true && right == true) {
                            dungen[x][y] = 7;
                        }
                        if (up == true && left == true) {
                            dungen[x][y] = 6;
                        }
                        if (left == true && right == true) {
                            dungen[x][y] = 14;
                        }
                        if (left == true && down == true) {
                            dungen[x][y] = 5;
                        }
                        if (down == true && right == true) {
                            dungen[x][y] = 8;
                        }
                    } else if (blocked >= 3) {
                        if (up == false) {
                            dungen[x][y] = 2;
                        }
                        if (down == false) {
                            dungen[x][y] = 3;
                        }
                        if (left == false) {
                            dungen[x][y] = 4;
                        }
                        if (up == false) {
                            dungen[x][y] = 1;
                        }
                    }
                }
            }
        }
    }
}

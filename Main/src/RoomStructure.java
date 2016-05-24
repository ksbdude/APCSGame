public class RoomStructure
{
    private int[][] layout;
    //16x16 tiles per room
    public int getvariation(int min)
    {
        return (int) (Math.random()*25) + min;
    }
    
    /*14 total rooms
    0     - block room
    1~25  - single opening
    26~50 - double opening
    51~75 - triple opening
    76~100- all opening
    */
    public int getlayout(int roomstyle)
    {
        if(roomstyle==0)
            return 0;
        if(roomstyle<=4)
            return getvariation(1);
        else if(roomstyle<=8 || roomstyle>13)
            return getvariation(26);
        else if(roomstyle<=12)
            return getvariation(51);
        else
            return getvariation(76);
    }
    
    public int[][] assignvariation(int[][] dung)
    {
        int[][] dungy=new int[dung.length][dung.length];
        for (int x=0;x<dungy.length;x++)
        {
            for (int y=0;y<dungy.length;y++)
            {
                dungy[x][y]=getlayout(dung[x][y]);
            }
        }
        return dungy;
    }
}
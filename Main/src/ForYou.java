
import Game.Levels.RoomGen;

public class ForYou
{
    public static void main (String [] args)
    {
        RoomGen ha=new RoomGen(10,10);
        
        int[][] haha= new int[10][10];
        ha.generateblock();
        haha=ha.getmap();
        int x;
        int y;
        for(x=0;x<haha.length;x++)
        {
            System.out.println();
            for(y=0;y<haha[0].length;y++)
            {
                System.out.print(haha[x][y] + "\t");
            }
        }
        System.out.println();
        
        //actually generates room structures
        ha.fillrooms();
        haha=ha.getmap();
        for(x=0;x<haha.length;x++)
        {
            System.out.println();
            for(y=0;y<haha[0].length;y++)
            {
                System.out.print(haha[x][y] + "\t");
            }
        }
        
        //implements RoomStructure class
        for(x=0;x<haha.length;x++)
        {
            for(y=0;y<haha[0].length;y++)
            {
                //will add later
            }
        }
    }
}
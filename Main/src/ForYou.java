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
        
        //implements RoomStructure class TRANSLATES INTO ROOM ID IN GRAPHICS
        System.out.println();
        
        RoomStructure ja=new RoomStructure(10,10);
        //int test = ja.getlayout(1);
        ja.setmapp(haha);
        haha=ja.getmapp();
        
        for(x=0;x<haha.length;x++)
        {
            System.out.println();
            for(y=0;y<haha[0].length;y++)
            {
                int temp = ja.getlayout(haha[x][y]);
                haha[x][y]=temp;
                System.out.print(haha[x][y] + "\t");
            }
        }
        
    }
}
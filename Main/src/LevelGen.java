public class LevelGen
{
    private int[][] level;
    private int width, height;
    private int numOfDifferentFloorTiles;
    
    private int wall = 0, floor = 1;
    
    public LevelGen(int w, int h)
    {
        level = new int[w][h];
        width = w;
        height = h;
    }
    
    public void randomgen()
    {
        for(int x = 0; x < width; x++)
        {
            for(int y = 0; y < height; y++)
            {
                if(x == 0 || x == width)
                {
                    level[x][y] = 0;
                }
                if(y == 0 || y == height)
                {
                    level[x][y] = 0;
                }
                else
                {
                    level[x][y] = (int)(Math.random()*numOfDifferentFloorTiles)+1;
                }
            }
        }
    }
    
    public void placestructure(Structure a)
    {
        //copies the pixel array from the floorplan (an image from the structure class) to the building 2d array for better placement on the map
        int size = a.getSize();
        int[][] building = new int[size][size];
        for (int s = 0; s < size*size; s+=size)
        {
            for (int i = 0; i < size; i++)
            {
                building[i][s] = a.getfloorplan()[s*size + i];
            }
        }
        building = hexToInt(building);
        
        //HAS NOT PLACED STRUCTURE ONTO MAP YET
    }
    
    public int[][] hexToInt(int[][] a)
    {
        //reads building array and replaces the HEXADECIMAL color codes with designated
        int [][] building = new int[a.length][a[0].length];
        building = a;
        for (int r = 0; r < building.length; r++)
        {
            for (int c = 0; c < building[0].length; c++)
            {
                if (building[r][c] == 0xFFFFFFFF)           //black
                    building[r][c] = wall;
                else if (building[r][c] == 0xff22B14C)      //green
                    building[r][c] = floor;
            }
        }
        return building;
    }
    
    
}
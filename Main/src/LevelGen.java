public class LevelGen
{
    private int[][] level;
    private int width, height;
    private int[] FloorTiles = {1, 2};
    private int numOfDifferentFloorTiles = FloorTiles.length;
    
    private int wall = 0, floor1 = 1, floor2 = 2;
    
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
                    level[x][y] = FloorTiles[(int)(Math.random()*numOfDifferentFloorTiles)+1];
                }
            }
        }
    }
    
    public void placestructure(Structure a)
    {
        //CONVERT IMAGE TO PROPER FORMAT-----------------------------------------------------------
        
        //copies the pixel array and size from the floorplan (an image from the structure class)
        int size = a.getSize();
        int[] floorplan = a.getfloorplan();
        //converts to a 2d array for better placement on the map
        int[][] build = singleto2D(floorplan, size);
        build = hexToInt(build);
        
        //FIND AND CONFIRM LOCATION TO PLACE STRUCTURE---------------------------------------------
        
        //ERROR: Needs code that can determine if a structure was already placed at the location
        
        int upperleftcornerX = 1;
        int upperleftcornerY = 1;
        
        //check if structure goes outside of the level map. If yes, find another location at random.
        do
        {
            upperleftcornerX = (int)(Math.random()*width)+1;
            upperleftcornerY = (int)(Math.random()*height)+1;
        } while (upperleftcornerX + size >= width && upperleftcornerY + size >= height);
        
        //PLACE STRUCTURE ON THE MAP.--------------------------------------------------------------
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                level[upperleftcornerX + i][upperleftcornerY + j] = build[i][j];
            }
        }
    }
    
    public void placestructure(Structure a, int upperleftX, int upperleftY)
    {
        //CONVERT IMAGE TO PROPER FORMAT-----------------------------------------------------------
        
        //copies the pixel array and size from the floorplan (an image from the structure class)
        int size = a.getSize();
        int[] floorplan = a.getfloorplan();
        //converts to a 2d array for better placement on the map and replaces hex codes with tile ID#
        int[][] build = singleto2D(floorplan, size);
        build = hexToInt(build);
        
        //CONFIRM LOCATION TO PLACE STRUCTURE------------------------------------------------------
                
        int upperleftcornerX = upperleftX;
        int upperleftcornerY = upperleftY;
        
        //PLACE STRUCTURE ON THE MAP.--------------------------------------------------------------
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                level[upperleftcornerX + i][upperleftcornerY + j] = build[i][j];
            }
        }
    }
    
    public int[][] singleto2D(int[] a, int b)
    {
        //converts single line array to 2d array.
        int size = b;
        int[][] building = new int[size][size];
        
        for (int s = 0; s < size; s+=size)
        {
            for (int i = 0; i < size; i++)
            {
                building[i][s] = a[s*size + i];
            }
        }
        return building;
    }
    
    public int[][] hexToInt(int[][] a)
    {
        //reads building array and replaces the HEXADECIMAL color codes with int that represents what tile is supposed to go there.
        int [][] building = new int[a.length][a[0].length];
        building = a;
        for (int r = 0; r < building.length; r++)
        {
            for (int c = 0; c < building[0].length; c++)
            {
                if (building[r][c] == 0xFFFFFFFF)           //black
                    building[r][c] = wall;
                else if (building[r][c] == 0xff22B14C)      //green
                    building[r][c] = floor1;
                //list other hex codes and conversion here:
            }
        }
        return building;
    }
    
    
    
}

package Game;

public class TestingLevelGenUsingPrintOutput
{
    public static void main(String [] args)
    {
        LevelGen g = new LevelGen(70, 70);
        g.randomgen();
        
        Structure a = new Structure("/textures/SandFloor1.png",16);
        Structure b = new Structure("/textures/SandFloor1.png",16);
        Structure d = new Structure("/textures/SandFloor1.png",16);
        g.placestructure(a);
        g.placestructure(b);
        g.placestructure(d);
        
        for (int r = 0; r < g.getLevel().length; r++)
        {
            for (int c = 0; c < g.getLevel()[0].length; c++)
            {
                System.out.print(g.getLevel()[r][c] + "\t");
            }
            System.out.println();
        }
        
    }
}
package Game.Levels;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Structure {

    public static Structure dungeon = new Structure("/textures/Room1dungeon.png", 26);
    
    //FOR DUNGEON USE ONLY---------------------------------------------------------------
//    public static Structure r0 = new Structure("/Dungeons/R0.png", 24);
//    //
    public static Structure r1 = new Structure("/Dungeons/R001.png", 24);
    public static Structure r2 = new Structure("/Dungeons/R002.png", 24);
    public static Structure r3 = new Structure("/Dungeons/R003.png", 24);
    public static Structure r4 = new Structure("/Dungeons/R004.png", 24);
    public static Structure r5 = new Structure("/Dungeons/R005.png", 24);
//    public static Structure r6 = new Structure("/Dungeons/R006.png", 24);
//    public static Structure r7 = new Structure("/Dungeons/R007.png", 24);
//    public static Structure r8 = new Structure("/Dungeons/R008.png", 24);
//    public static Structure r9 = new Structure("/Dungeons/R009.png", 24);
//    public static Structure r10 = new Structure("/Dungeons/R010.png", 24);
//    //
//    public static Structure r11 = new Structure("/Dungeons/R011.png");
//    public static Structure r12 = new Structure("/Dungeons/R012.png");
//    public static Structure r13 = new Structure("/Dungeons/R013.png");
//    public static Structure r14 = new Structure("/Dungeons/R014.png");
//    public static Structure r15 = new Structure("/Dungeons/R015.png");
//    public static Structure r16 = new Structure("/Dungeons/R016.png");
//    public static Structure r17 = new Structure("/Dungeons/R017.png");
//    public static Structure r18 = new Structure("/Dungeons/R018.png");
//    public static Structure r19 = new Structure("/Dungeons/R019.png");
//    public static Structure r20 = new Structure("/Dungeons/R020.png");
//    //
//    public static Structure r21 = new Structure("/Dungeons/R021.png");
//    public static Structure r22 = new Structure("/Dungeons/R022.png");
//    public static Structure r23 = new Structure("/Dungeons/R023.png");
//    public static Structure r24 = new Structure("/Dungeons/R024.png");
//    public static Structure r25 = new Structure("/Dungeons/R025.png");
//    public static Structure r26 = new Structure("/Dungeons/R026.png");
//    public static Structure r27 = new Structure("/Dungeons/R027.png");
//    public static Structure r28 = new Structure("/Dungeons/R028.png");
//    public static Structure r29 = new Structure("/Dungeons/R029.png");
//    public static Structure r30 = new Structure("/Dungeons/R030.png");
//    //
//    public static Structure r31 = new Structure("/Dungeons/R031.png");
//    public static Structure r32 = new Structure("/Dungeons/R032.png");
    public static Structure r33 = new Structure("/Dungeons/R033.png");
    public static Structure r34 = new Structure("/Dungeons/R034.png");
    public static Structure r35 = new Structure("/Dungeons/R035.png");
    public static Structure r36 = new Structure("/Dungeons/R036.png");
    public static Structure r37 = new Structure("/Dungeons/R037.png");
//    public static Structure r38 = new Structure("/Dungeons/R038.png");
//    public static Structure r39 = new Structure("/Dungeons/R039.png");
    public static Structure r40 = new Structure("/Dungeons/R040.png");
//    //
//    public static Structure r41 = new Structure("/Dungeons/R041.png");
//    public static Structure r42 = new Structure("/Dungeons/R042.png");
//    public static Structure r43 = new Structure("/Dungeons/R043.png");
//    public static Structure r44 = new Structure("/Dungeons/R044.png");
//    public static Structure r45 = new Structure("/Dungeons/R045.png");
//    public static Structure r46 = new Structure("/Dungeons/R046.png");
//    public static Structure r47 = new Structure("/Dungeons/R047.png");
//    public static Structure r48 = new Structure("/Dungeons/R048.png");
//    public static Structure r49 = new Structure("/Dungeons/R049.png");
//    public static Structure r50 = new Structure("/Dungeons/R050.png");
//    //
//    public static Structure r51 = new Structure("/Dungeons/R051.png");
//    public static Structure r52 = new Structure("/Dungeons/R052.png");
//    public static Structure r53 = new Structure("/Dungeons/R053.png");
//    public static Structure r54 = new Structure("/Dungeons/R054.png");
//    public static Structure r55 = new Structure("/Dungeons/R055.png");
//    public static Structure r56 = new Structure("/Dungeons/R056.png");
//    public static Structure r57 = new Structure("/Dungeons/R057.png");
//    public static Structure r58 = new Structure("/Dungeons/R058.png");
//    public static Structure r59 = new Structure("/Dungeons/R059.png");
//    public static Structure r60 = new Structure("/Dungeons/R060.png");
//    //
//    public static Structure r61 = new Structure("/Dungeons/R061.png");
//    public static Structure r62 = new Structure("/Dungeons/R062.png");
//    public static Structure r63 = new Structure("/Dungeons/R063.png");
//    public static Structure r64 = new Structure("/Dungeons/R064.png");
//    public static Structure r65 = new Structure("/Dungeons/R065.png");
//    public static Structure r66 = new Structure("/Dungeons/R066.png");
//    public static Structure r67 = new Structure("/Dungeons/R067.png");
//    public static Structure r68 = new Structure("/Dungeons/R068.png");
//    public static Structure r69 = new Structure("/Dungeons/R069.png");
//    public static Structure r70 = new Structure("/Dungeons/R070.png");
//    //
//    public static Structure r71 = new Structure("/Dungeons/R071.png");
//    public static Structure r72 = new Structure("/Dungeons/R072.png");
    public static Structure r73 = new Structure("/Dungeons/R073.png");
    public static Structure r74 = new Structure("/Dungeons/R074.png");
//    public static Structure r75 = new Structure("/Dungeons/R075.png");
//    public static Structure r76 = new Structure("/Dungeons/R076.png");
//    public static Structure r77 = new Structure("/Dungeons/R077.png");
//    public static Structure r78 = new Structure("/Dungeons/R078.png");
//    public static Structure r79 = new Structure("/Dungeons/R079.png");
//    public static Structure r80 = new Structure("/Dungeons/R080.png");
//    //
//    public static Structure r81 = new Structure("/Dungeons/R081.png");
//    public static Structure r82 = new Structure("/Dungeons/R082.png");
//    public static Structure r83 = new Structure("/Dungeons/R083.png");
//    public static Structure r84 = new Structure("/Dungeons/R084.png");
//    public static Structure r85 = new Structure("/Dungeons/R085.png");
//    public static Structure r86 = new Structure("/Dungeons/R086.png");
//    public static Structure r87 = new Structure("/Dungeons/R087.png");
//    public static Structure r88 = new Structure("/Dungeons/R088.png");
//    public static Structure r89 = new Structure("/Dungeons/R089.png");
//    public static Structure r90 = new Structure("/Dungeons/R090.png");
//    //
//    public static Structure r91 = new Structure("/Dungeons/R091.png");
//    public static Structure r92 = new Structure("/Dungeons/R092.png");
//    public static Structure r93 = new Structure("/Dungeons/R093.png");
//    public static Structure r94 = new Structure("/Dungeons/R094.png");
//    public static Structure r95 = new Structure("/Dungeons/R095.png");
//    public static Structure r96 = new Structure("/Dungeons/R096.png");
//    public static Structure r97 = new Structure("/Dungeons/R097.png");
//    public static Structure r98 = new Structure("/Dungeons/R098.png");
//    public static Structure r99 = new Structure("/Dungeons/R099.png");
//    public static Structure r100 = new Structure("/Dungeons/R100.png");
//    //
//    public static Structure r101 = new Structure("/Dungeons/R101.png");
//    public static Structure r102 = new Structure("/Dungeons/R102.png");
//    public static Structure r103 = new Structure("/Dungeons/R103.png");
//    public static Structure r104 = new Structure("/Dungeons/R104.png");
//    public static Structure r105 = new Structure("/Dungeons/R105.png");
//    public static Structure r106 = new Structure("/Dungeons/R106.png");
//    public static Structure r107 = new Structure("/Dungeons/R107.png");
//    public static Structure r108 = new Structure("/Dungeons/R108.png");
//    public static Structure r109 = new Structure("/Dungeons/R109.png");
//    public static Structure r110 = new Structure("/Dungeons/R110.png");
//    //
//    public static Structure r111 = new Structure("/Dungeons/R111.png");
//    public static Structure r112 = new Structure("/Dungeons/R112.png");
//    public static Structure r113 = new Structure("/Dungeons/R113.png");
//    public static Structure r114 = new Structure("/Dungeons/R114.png");
//    public static Structure r115 = new Structure("/Dungeons/R115.png");
//    public static Structure r116 = new Structure("/Dungeons/R116.png");
//    public static Structure r117 = new Structure("/Dungeons/R117.png");
//    public static Structure r118 = new Structure("/Dungeons/R118.png");
//    public static Structure r119 = new Structure("/Dungeons/R119.png");
//    public static Structure r120 = new Structure("/Dungeons/R120.png");
//    //
    public static Structure r121 = new Structure("/Dungeons/R121.png", 24);
    public static Structure r122 = new Structure("/Dungeons/R122.png", 24);
    public static Structure r123 = new Structure("/Dungeons/R123.png", 24);
    public static Structure r124 = new Structure("/Dungeons/R124.png", 24);
//    public static Structure r125 = new Structure("/Dungeons/R125.png", 24);
//    public static Structure r126 = new Structure("/Dungeons/R126.png", 24);
//    public static Structure r127 = new Structure("/Dungeons/R127.png", 24);
//    public static Structure r128 = new Structure("/Dungeons/R128.png", 24);
//    public static Structure r129 = new Structure("/Dungeons/R129.png", 24);
//    public static Structure r130 = new Structure("/Dungeons/R130.png", 24);
//    //
//    public static Structure r131 = new Structure("/Dungeons/R131.png");
//    public static Structure r132 = new Structure("/Dungeons/R132.png");
//    public static Structure r133 = new Structure("/Dungeons/R133.png");
//    public static Structure r134 = new Structure("/Dungeons/R134.png");
//    public static Structure r135 = new Structure("/Dungeons/R135.png");
//    public static Structure r136 = new Structure("/Dungeons/R136.png");
//    public static Structure r137 = new Structure("/Dungeons/R137.png");
//    public static Structure r138 = new Structure("/Dungeons/R138.png");
//    public static Structure r139 = new Structure("/Dungeons/R139.png");
//    public static Structure r140 = new Structure("/Dungeons/R140.png");
//    //
//    public static Structure r141 = new Structure("/Dungeons/R141.png");
//    public static Structure r142 = new Structure("/Dungeons/R142.png");
//    public static Structure r143 = new Structure("/Dungeons/R143.png");
//    public static Structure r144 = new Structure("/Dungeons/R144.png");
//    public static Structure r145 = new Structure("/Dungeons/R145.png");
//    public static Structure r146 = new Structure("/Dungeons/R146.png");
//    public static Structure r147 = new Structure("/Dungeons/R147.png");
//    public static Structure r148 = new Structure("/Dungeons/R148.png");
//    public static Structure r149 = new Structure("/Dungeons/R149.png");
//    public static Structure r150 = new Structure("/Dungeons/R150.png");
    //FOR DUNGEON USE ONLY---------------------------------------------------------------

    private int[] floorplan;
    private int width, height;
    private String path;
    private int SIZE;

    public int[] pixels;

    public Structure(String path, int size) {
        this.path = path;
        SIZE = size;
        floorplan = new int[SIZE * SIZE];
        load();
        System.out.println("Structure loaded!");
    }
    
    public Structure(String path) {
        this.path = path;
        SIZE = 24;
        floorplan = new int[SIZE * SIZE];
        load();
        System.out.println("Structure loaded!");
    }

    public int[] getfloorplan() {
        return floorplan;
    }

    public int getSize() {
        return SIZE;
    }

    public void load() {
        try {
            BufferedImage image = ImageIO.read(Structure.class.getResource(path));
            int w = width = image.getWidth();
            int h = height = image.getHeight();
            floorplan = new int[w * h];
            image.getRGB(0, 0, w, h, floorplan, 0, w);
            width = w;
            height = h;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cant load Level file!");
        }
    }

    public void fix() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (floorplan[x + y * width] == 0xFF22b14c) {
                    floorplan[x + y * width] = 12;
                } else {
                    floorplan[x + y * width] = 9;
                }
            }
        }
    }

    private int x, y;

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
}

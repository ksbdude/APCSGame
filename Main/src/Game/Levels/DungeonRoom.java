package Game.Levels;

import Game.Graphics.SpriteSheet;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class DungeonRoom {

    public static ArrayList<DungeonRoom> rooms = new ArrayList<>();

    //public static DungeonRoom r0 = new DungeonRoom("/Dungeons/R0.png");
    //
    public static DungeonRoom r1 = new DungeonRoom("/Dungeons/R001.png");
    public static DungeonRoom r2 = new DungeonRoom("/Dungeons/R002.png");
    public static DungeonRoom r3 = new DungeonRoom("/Dungeons/R003.png");
    public static DungeonRoom r4 = new DungeonRoom("/Dungeons/R004.png");
    public static DungeonRoom r5 = new DungeonRoom("/Dungeons/R005.png");
    public static DungeonRoom r6 = new DungeonRoom("/Dungeons/R006.png");
    public static DungeonRoom r7 = new DungeonRoom("/Dungeons/R007.png");
    public static DungeonRoom r8 = new DungeonRoom("/Dungeons/R008.png");
    public static DungeonRoom r9 = new DungeonRoom("/Dungeons/R009.png");
    public static DungeonRoom r10 = new DungeonRoom("/Dungeons/R010.png");
    //
    public static DungeonRoom r11 = new DungeonRoom("/Dungeons/R011.png");
    public static DungeonRoom r12 = new DungeonRoom("/Dungeons/R012.png");
    public static DungeonRoom r13 = new DungeonRoom("/Dungeons/R013.png");
    public static DungeonRoom r14 = new DungeonRoom("/Dungeons/R014.png");
    public static DungeonRoom r15 = new DungeonRoom("/Dungeons/R015.png");
    public static DungeonRoom r16 = new DungeonRoom("/Dungeons/R016.png");
    public static DungeonRoom r17 = new DungeonRoom("/Dungeons/R017.png");
    public static DungeonRoom r18 = new DungeonRoom("/Dungeons/R018.png");
    public static DungeonRoom r19 = new DungeonRoom("/Dungeons/R019.png");
    public static DungeonRoom r20 = new DungeonRoom("/Dungeons/R020.png");
    //
    public static DungeonRoom r21 = new DungeonRoom("/Dungeons/R021.png");
    public static DungeonRoom r22 = new DungeonRoom("/Dungeons/R022.png");
    public static DungeonRoom r23 = new DungeonRoom("/Dungeons/R023.png");
    public static DungeonRoom r24 = new DungeonRoom("/Dungeons/R024.png");
    public static DungeonRoom r25 = new DungeonRoom("/Dungeons/R025.png");
    public static DungeonRoom r26 = new DungeonRoom("/Dungeons/R026.png");
    public static DungeonRoom r27 = new DungeonRoom("/Dungeons/R027.png");
    public static DungeonRoom r28 = new DungeonRoom("/Dungeons/R028.png");
    public static DungeonRoom r29 = new DungeonRoom("/Dungeons/R029.png");
    public static DungeonRoom r30 = new DungeonRoom("/Dungeons/R030.png");
    //
    public static DungeonRoom r31 = new DungeonRoom("/Dungeons/R031.png");
    public static DungeonRoom r32 = new DungeonRoom("/Dungeons/R032.png");
    public static DungeonRoom r33 = new DungeonRoom("/Dungeons/R033.png");
    public static DungeonRoom r34 = new DungeonRoom("/Dungeons/R034.png");
    public static DungeonRoom r35 = new DungeonRoom("/Dungeons/R035.png");
    public static DungeonRoom r36 = new DungeonRoom("/Dungeons/R036.png");
    public static DungeonRoom r37 = new DungeonRoom("/Dungeons/R037.png");
    public static DungeonRoom r38 = new DungeonRoom("/Dungeons/R038.png");
    public static DungeonRoom r39 = new DungeonRoom("/Dungeons/R039.png");
    public static DungeonRoom r40 = new DungeonRoom("/Dungeons/R040.png");
    //
    public static DungeonRoom r41 = new DungeonRoom("/Dungeons/R041.png");
    public static DungeonRoom r42 = new DungeonRoom("/Dungeons/R042.png");
    public static DungeonRoom r43 = new DungeonRoom("/Dungeons/R043.png");
    public static DungeonRoom r44 = new DungeonRoom("/Dungeons/R044.png");
    public static DungeonRoom r45 = new DungeonRoom("/Dungeons/R045.png");
    public static DungeonRoom r46 = new DungeonRoom("/Dungeons/R046.png");
    public static DungeonRoom r47 = new DungeonRoom("/Dungeons/R047.png");
    public static DungeonRoom r48 = new DungeonRoom("/Dungeons/R048.png");
    public static DungeonRoom r49 = new DungeonRoom("/Dungeons/R049.png");
    public static DungeonRoom r50 = new DungeonRoom("/Dungeons/R050.png");
    //
    public static DungeonRoom r51 = new DungeonRoom("/Dungeons/R051.png");
    public static DungeonRoom r52 = new DungeonRoom("/Dungeons/R052.png");
    public static DungeonRoom r53 = new DungeonRoom("/Dungeons/R053.png");
    public static DungeonRoom r54 = new DungeonRoom("/Dungeons/R054.png");
    public static DungeonRoom r55 = new DungeonRoom("/Dungeons/R055.png");
    public static DungeonRoom r56 = new DungeonRoom("/Dungeons/R056.png");
    public static DungeonRoom r57 = new DungeonRoom("/Dungeons/R057.png");
    public static DungeonRoom r58 = new DungeonRoom("/Dungeons/R058.png");
    public static DungeonRoom r59 = new DungeonRoom("/Dungeons/R059.png");
    public static DungeonRoom r60 = new DungeonRoom("/Dungeons/R060.png");
    //
    public static DungeonRoom r61 = new DungeonRoom("/Dungeons/R061.png");
    public static DungeonRoom r62 = new DungeonRoom("/Dungeons/R062.png");
    public static DungeonRoom r63 = new DungeonRoom("/Dungeons/R063.png");
    public static DungeonRoom r64 = new DungeonRoom("/Dungeons/R064.png");
    public static DungeonRoom r65 = new DungeonRoom("/Dungeons/R065.png");
    public static DungeonRoom r66 = new DungeonRoom("/Dungeons/R066.png");
    public static DungeonRoom r67 = new DungeonRoom("/Dungeons/R067.png");
    public static DungeonRoom r68 = new DungeonRoom("/Dungeons/R068.png");
    public static DungeonRoom r69 = new DungeonRoom("/Dungeons/R069.png");
    public static DungeonRoom r70 = new DungeonRoom("/Dungeons/R070.png");
    //
    public static DungeonRoom r71 = new DungeonRoom("/Dungeons/R071.png");
    public static DungeonRoom r72 = new DungeonRoom("/Dungeons/R072.png");
    public static DungeonRoom r73 = new DungeonRoom("/Dungeons/R073.png");
    public static DungeonRoom r74 = new DungeonRoom("/Dungeons/R074.png");
    public static DungeonRoom r75 = new DungeonRoom("/Dungeons/R075.png");
    public static DungeonRoom r76 = new DungeonRoom("/Dungeons/R076.png");
    public static DungeonRoom r77 = new DungeonRoom("/Dungeons/R077.png");
    public static DungeonRoom r78 = new DungeonRoom("/Dungeons/R078.png");
    public static DungeonRoom r79 = new DungeonRoom("/Dungeons/R079.png");
    public static DungeonRoom r80 = new DungeonRoom("/Dungeons/R080.png");
    //
    public static DungeonRoom r81 = new DungeonRoom("/Dungeons/R081.png");
    public static DungeonRoom r82 = new DungeonRoom("/Dungeons/R082.png");
    public static DungeonRoom r83 = new DungeonRoom("/Dungeons/R083.png");
    public static DungeonRoom r84 = new DungeonRoom("/Dungeons/R084.png");
    public static DungeonRoom r85 = new DungeonRoom("/Dungeons/R085.png");
    public static DungeonRoom r86 = new DungeonRoom("/Dungeons/R086.png");
    public static DungeonRoom r87 = new DungeonRoom("/Dungeons/R087.png");
    public static DungeonRoom r88 = new DungeonRoom("/Dungeons/R088.png");
    public static DungeonRoom r89 = new DungeonRoom("/Dungeons/R089.png");
    public static DungeonRoom r90 = new DungeonRoom("/Dungeons/R090.png");
    //
    public static DungeonRoom r91 = new DungeonRoom("/Dungeons/R091.png");
    public static DungeonRoom r92 = new DungeonRoom("/Dungeons/R092.png");
    public static DungeonRoom r93 = new DungeonRoom("/Dungeons/R093.png");
    public static DungeonRoom r94 = new DungeonRoom("/Dungeons/R094.png");
    public static DungeonRoom r95 = new DungeonRoom("/Dungeons/R095.png");
    public static DungeonRoom r96 = new DungeonRoom("/Dungeons/R096.png");
    public static DungeonRoom r97 = new DungeonRoom("/Dungeons/R097.png");
    public static DungeonRoom r98 = new DungeonRoom("/Dungeons/R098.png");
    public static DungeonRoom r99 = new DungeonRoom("/Dungeons/R099.png");
    public static DungeonRoom r100 = new DungeonRoom("/Dungeons/R100.png");
    //
    public static DungeonRoom r101 = new DungeonRoom("/Dungeons/R101.png");
    public static DungeonRoom r102 = new DungeonRoom("/Dungeons/R102.png");
    public static DungeonRoom r103 = new DungeonRoom("/Dungeons/R103.png");
    public static DungeonRoom r104 = new DungeonRoom("/Dungeons/R104.png");
    public static DungeonRoom r105 = new DungeonRoom("/Dungeons/R105.png");
    public static DungeonRoom r106 = new DungeonRoom("/Dungeons/R106.png");
    public static DungeonRoom r107 = new DungeonRoom("/Dungeons/R107.png");
    public static DungeonRoom r108 = new DungeonRoom("/Dungeons/R108.png");
    public static DungeonRoom r109 = new DungeonRoom("/Dungeons/R109.png");
    public static DungeonRoom r110 = new DungeonRoom("/Dungeons/R110.png");
    //
    public static DungeonRoom r111 = new DungeonRoom("/Dungeons/R111.png");
    public static DungeonRoom r112 = new DungeonRoom("/Dungeons/R112.png");
    public static DungeonRoom r113 = new DungeonRoom("/Dungeons/R113.png");
    public static DungeonRoom r114 = new DungeonRoom("/Dungeons/R114.png");
    public static DungeonRoom r115 = new DungeonRoom("/Dungeons/R115.png");
    public static DungeonRoom r116 = new DungeonRoom("/Dungeons/R116.png");
    public static DungeonRoom r117 = new DungeonRoom("/Dungeons/R117.png");
    public static DungeonRoom r118 = new DungeonRoom("/Dungeons/R118.png");
    public static DungeonRoom r119 = new DungeonRoom("/Dungeons/R119.png");
    public static DungeonRoom r120 = new DungeonRoom("/Dungeons/R120.png");
    //
    public static DungeonRoom r121 = new DungeonRoom("/Dungeons/R121.png");
    public static DungeonRoom r122 = new DungeonRoom("/Dungeons/R122.png");
    public static DungeonRoom r123 = new DungeonRoom("/Dungeons/R123.png");
    public static DungeonRoom r124 = new DungeonRoom("/Dungeons/R124.png");
    public static DungeonRoom r125 = new DungeonRoom("/Dungeons/R125.png");
    public static DungeonRoom r126 = new DungeonRoom("/Dungeons/R126.png");
    public static DungeonRoom r127 = new DungeonRoom("/Dungeons/R127.png");
    public static DungeonRoom r128 = new DungeonRoom("/Dungeons/R128.png");
    public static DungeonRoom r129 = new DungeonRoom("/Dungeons/R129.png");
    public static DungeonRoom r130 = new DungeonRoom("/Dungeons/R130.png");
    //
    public static DungeonRoom r131 = new DungeonRoom("/Dungeons/R131.png");
    public static DungeonRoom r132 = new DungeonRoom("/Dungeons/R132.png");
    public static DungeonRoom r133 = new DungeonRoom("/Dungeons/R133.png");
    public static DungeonRoom r134 = new DungeonRoom("/Dungeons/R134.png");
    public static DungeonRoom r135 = new DungeonRoom("/Dungeons/R135.png");
    public static DungeonRoom r136 = new DungeonRoom("/Dungeons/R136.png");
    public static DungeonRoom r137 = new DungeonRoom("/Dungeons/R137.png");
    public static DungeonRoom r138 = new DungeonRoom("/Dungeons/R138.png");
    public static DungeonRoom r139 = new DungeonRoom("/Dungeons/R139.png");
    public static DungeonRoom r140 = new DungeonRoom("/Dungeons/R140.png");
    //
    public static DungeonRoom r141 = new DungeonRoom("/Dungeons/R141.png");
    public static DungeonRoom r142 = new DungeonRoom("/Dungeons/R142.png");
    public static DungeonRoom r143 = new DungeonRoom("/Dungeons/R143.png");
    public static DungeonRoom r144 = new DungeonRoom("/Dungeons/R144.png");
    public static DungeonRoom r145 = new DungeonRoom("/Dungeons/R145.png");
    public static DungeonRoom r146 = new DungeonRoom("/Dungeons/R146.png");
    public static DungeonRoom r147 = new DungeonRoom("/Dungeons/R147.png");
    public static DungeonRoom r148 = new DungeonRoom("/Dungeons/R148.png");
    public static DungeonRoom r149 = new DungeonRoom("/Dungeons/R149.png");
    public static DungeonRoom r150 = new DungeonRoom("/Dungeons/R150.png");

    int w, h;
    String path;

    public int[] pixels;

    public DungeonRoom(String path, int w, int h) {
        this.w = w;
        this.h = h;
        pixels = new int[w * h];
        this.path = path;
        load();
        rooms.add(this);
    }

    public DungeonRoom(String path) {
        this(path, 24, 24);
    }

    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            this.w = w;
            this.h = h;
            image.getRGB(0, 0, w, h, pixels, 0, w);
            System.out.println("Loaded DungeonRoom");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getTile(int x, int y) {
        if (pixels[x + y * w] == 0xFF000000) {
            return 5;
        } else {
            return 1;
        }
    }
}

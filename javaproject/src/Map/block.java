package Map;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class block {

    private int[][] maps;
    private BufferedImage tileSheet;
    public block (int[][] existingMap){

        maps = new int[existingMap.length][existingMap[0].length];

        for (int y =0 ; y<maps.length;y++){
            for (int x =0 ; x<maps[y].length;x++){
                maps [y][x] =existingMap[y][x];
            }
        }
        tileSheet = Loadmap("map.jpg");
    }

    public BufferedImage Loadmap(String fileName){
        BufferedImage img = null;
        try {
            img= ImageIO.read(new File(fileName));
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.print("could not load image !");
        }

        return img;
    }
    public  void DrawLayer(Graphics g){
        for (int y =0 ; y<maps.length;y++){
            for (int x =0 ; x<maps[y].length;x++){
               int index = maps[y][x];
               int yOffset=0;
               if (index>(tileSheet.getWidth() / Engine.TILE_WIDTH )-1){
                   yOffset++;

                   index = index -(tileSheet.getWidth()/Engine.TILE_WIDTH);
               }
               g.drawImage(tileSheet,x*Engine.TILE_WIDTH
                       ,y*Engine.TILE_HEIGHT
                       ,(x*Engine.TILE_WIDTH)+Engine.TILE_WIDTH
                       ,(y*Engine.TILE_HEIGHT)+Engine.TILE_HEIGHT
                       ,index*Engine.TILE_WIDTH
                       ,yOffset*Engine.TILE_HEIGHT
                       , (index*Engine.TILE_WIDTH)+Engine.TILE_WIDTH
                       ,(yOffset*Engine.TILE_HEIGHT)+Engine.TILE_HEIGHT
                       ,null);
            }
        }

    }


}

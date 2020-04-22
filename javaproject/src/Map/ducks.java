package Map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ducks extends JPanel{


    private BufferedImage image;

    public ducks() {
        try {
            image = ImageIO.read(new File("duck.png"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    public void DrawLayer(Graphics g) {
        super.paintComponent(g);

    }

    @Override
    protected void paintComponent(Graphics gq) {
        super.paintComponent(gq);
        gq.drawImage(image, 50, 50,50,50, this); // see javadoc for more info on the parameters
    }

}
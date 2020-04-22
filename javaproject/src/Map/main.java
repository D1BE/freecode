package Map;

import javax.swing.*;
import java.awt.*;

public class main {




    public static void main(String[] args){

        JFrame frame = new JFrame("duck simulator");
        map panel = new map();

        frame.setSize(new Dimension(1200,900));
        frame.setLocation(new Point(0,0));

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

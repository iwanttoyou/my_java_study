import java.awt.Color;

import java.awt.*;

public class gui {
    public static void main(String[] args){
        Frame f=new Frame("计算器");
        Panel p=new Panel();
        f.setSize(200,200);
        f.setBackground(Color.BLUE);
        f.setLayout(null);
        p.setSize(100,100);
        p.setBackground(Color.BLACK);
        f.add(p);
        f.setVisible(true);
    }
}

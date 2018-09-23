package ImgIcon;

import javax.swing.*;
import java.awt.*;


public class Img extends JFrame {
    private ImageIcon imageIcon;
    private  JLabel jLabel;


    public Img(){
        setLayout(new FlowLayout());

        imageIcon = new ImageIcon("/Users/LewisWilliams/Downloads/plane.png");
        jLabel = new JLabel(imageIcon);
        add(jLabel);
    }
}
//        imageIcon = new ImageIcon("https://icon2.kisspng.com/20171221/ise/airplane-png-clipart-5a3c3660dbd448.1598914515138955209004.jpg");


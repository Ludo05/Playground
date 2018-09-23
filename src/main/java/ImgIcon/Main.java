package ImgIcon;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Img img = new Img();
        img.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        img.setVisible(true);
        img.pack();
        img.setTitle("Test");
    }
}

package g30126.pol.paula.l9.e2;



import java.awt.*;
import javax.swing.*;

class TestButtonPannel2 {

    public static void main(String [] args)
    {
        JFrame buttonFrame2 = new JFrame("Button Panel 2");

        ButtonPannel2 panel2 = new ButtonPannel2();

        buttonFrame2.add(panel2);
        buttonFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame2.setSize(400 , 400);
        buttonFrame2.setVisible(true);
    }
}
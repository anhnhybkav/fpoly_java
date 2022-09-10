package java2.lab8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JPanel jpan = new JPanel();
        frame.add(jpan);
        JButton btnHello = new JButton("hello");
        jpan.add(btnHello);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}

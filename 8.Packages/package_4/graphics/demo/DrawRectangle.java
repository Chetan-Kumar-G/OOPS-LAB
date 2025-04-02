package graphics.demo;

import java.awt.*;
import javax.swing.*;

public class DrawRectangle extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new DrawRectangle());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

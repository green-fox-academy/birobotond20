import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.decode("#00313f"));
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.YELLOW);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);

        drawSquareFractal(WIDTH / 2, 0, WIDTH, graphics);
    }

    private static void (){

    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

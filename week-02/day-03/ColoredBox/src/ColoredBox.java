import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.ORANGE);
        graphics.fillRect(100, 100, 100, 100);
        graphics.setColor(Color.decode("#0" +
                "08000"));
        graphics.drawLine(100, 100, 200, 100);
        graphics.setColor(Color.decode("#800080"));
        graphics.drawLine(200, 100, 200, 200);
        graphics.setColor(Color.decode("#800000"));
        graphics.drawLine(200, 200, 100, 200);
        graphics.setColor(Color.decode("#000080"));
        graphics.drawLine(100, 200, 100, 100);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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

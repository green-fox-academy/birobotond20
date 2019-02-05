import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareFractal {
    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.decode("#00313f"));
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);

        drawSquareFractal(0, 0, WIDTH, graphics);
    }

    public static void drawSquareFractal(int startX, int startY, int width, Graphics graphics) {

        int size = width / 3;

        graphics.drawRect(startX + size, startY, size, size);
        graphics.drawRect(startX, startY + size, size, size);
        graphics.drawRect(startX  + 2 * size, startY + size, size, size);
        graphics.drawRect(startX + size, startY + 2 * size, size, size);

        if (size != 0){
            drawSquareFractal(startX + size, startY, size, graphics);
            drawSquareFractal(startX + 2 * size, startY + size, size, graphics);
            drawSquareFractal(startX, startY + size, size, graphics);
            drawSquareFractal(startX + size, startY + 2 * size, size, graphics);
        }
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

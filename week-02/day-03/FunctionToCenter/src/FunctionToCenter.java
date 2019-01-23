import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        draw(0, 0, graphics);
    }

    private static void draw(int startX, int startY, Graphics graphics){
        for (int row = startX; row <= WIDTH; row+=20){
            for (int col = startY; col <= WIDTH; col+=20) {
                if (row == 0 || row == WIDTH || col == 0 || col == WIDTH) {
                    graphics.drawLine(row, col, (WIDTH / 2), (HEIGHT / 2));
                }
            }
        }
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

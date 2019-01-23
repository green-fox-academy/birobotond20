import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int size = 15;

        for (int row = 0; row < 8; row++){
            for (int col = 0; col < 8; col++){
                if (row % 2 == 0 && col % 2 == 1){
                    blackSquareDraw(col, row, size, graphics);
                } else if (row % 2 == 1 && col % 2 == 0){
                    blackSquareDraw(col, row, size, graphics);
                }
            }
        }
    }

    private static void blackSquareDraw(int currentCol, int currentRow, int size, Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(currentCol * size, currentRow * size, size, size);
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

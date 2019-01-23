import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        drawPurpleSteps(10, 6, graphics);
    }

    private static void drawPurpleSteps(int size, int times, Graphics graphics){
        for (int i = 1, startingPoint = 10; i <= times; startingPoint+=size*i, i++){
            graphics.setColor(Color.decode("#b145f3"));
            graphics.fillRect(startingPoint, startingPoint, size*i, size*i);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(startingPoint, startingPoint, size*i, size*i);
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

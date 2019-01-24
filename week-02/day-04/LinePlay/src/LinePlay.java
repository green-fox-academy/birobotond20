import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {


        String green = "#3bd549";
        String purple = "#b145f3";
        int increment = 20;

        for (int x = 0; x < WIDTH; x+=increment){
            for (int y = 0; y < WIDTH; y+=increment){
                if (x > 2*increment && y == 0) {
                    graphics.setColor(Color.decode(purple));
                    graphics.drawLine(x, y, WIDTH, x - 2*increment);
                } else if(y > 2*increment && x == 0){
                    graphics.setColor(Color.decode(green));
                    graphics.drawLine(x, y, y - 2*increment, WIDTH);
                }
            }
        }

    }

    public static void drawLinePlay (int minVert, int maxVert, int minHor, int maxHor, Graphics graphics){
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
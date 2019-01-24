import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {


        int divide = 4;
        int increment = Math.;

        for (int row = 0; row < WIDTH; row+=increment){
            for (int col = 0; col < HEIGHT; col+=increment) {
                drawLinePlay(WIDTH - (WIDTH - col), WIDTH - (WIDTH - col) + increment, graphics);
            }
        }

    }

    public static void drawLinePlay (int min, int max, Graphics graphics){
        String green = "#3bd549";
        String purple = "#b145f3";
        int increment = max / 20;
        for (int x = min; x < max; x+=increment){
            for (int y = min; y < max; y+=increment){
                if (x > 2*increment && y == min) {
                    graphics.setColor(Color.decode(purple));
                    graphics.drawLine(x, y, max, x - 2*increment);
                } else if(y > 2*increment && x == min){
                    graphics.setColor(Color.decode(green));
                    graphics.drawLine(x, y, y - 2*increment, max);
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

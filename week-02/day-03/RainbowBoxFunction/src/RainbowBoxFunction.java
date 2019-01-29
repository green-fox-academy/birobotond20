import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        String[] colors = {"#FF0000", "#FF6600", "#FFEE00", "#00FF00", "#0099FF", "#4400FF", "#9900FF"};

        squareDraw(0, colors, graphics);
    }

    private static void squareDraw(int size, String[] colors, Graphics graphics){
        for (int i = 0; i < colors.length; i++){
            int calcSize = 200 - i*20;
            graphics.setColor(Color.decode(colors[i]));
            graphics.fillRect((WIDTH / 2) - (calcSize / 2), (HEIGHT / 2) - (calcSize / 2), calcSize, calcSize);
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

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int divideCanvasBy = 4;
        int spaceBetweenLines = 5;
        int currentWidthOfEye = WIDTH / divideCanvasBy;

        for (int i = 0; i < divideCanvasBy; i++){
            for (int j = 0; j < divideCanvasBy; j++){
                drawEye(j*currentWidthOfEye, i*currentWidthOfEye,
                        spaceBetweenLines, currentWidthOfEye, graphics);
            }
        }
    }

    public static void drawEye(int startX, int startY, int spaceBetweenLines, int currentWidthOfEye, Graphics graphics){

        int numberOfLinesToDraw = currentWidthOfEye / spaceBetweenLines;

        for (int i = 0; i < numberOfLinesToDraw; i++){
            graphics.setColor(Color.decode("#a300f2"));
            graphics.drawLine(startX + i*spaceBetweenLines, startY, startX+currentWidthOfEye, startY+ i*spaceBetweenLines);
            graphics.setColor(Color.decode("#00d001"));
            graphics.drawLine(startX, startY + i*spaceBetweenLines, startX + i* spaceBetweenLines, startY + currentWidthOfEye);
        }
    }



    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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

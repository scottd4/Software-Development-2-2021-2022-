import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class WordArt extends JFrame {

    public WordArt()
    {
        setTitle("Simple Java 2D example");
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init()
    {
        add(new CanvasPanel());
        setVisible(true);
    }

    class CanvasPanel extends JPanel{

        public void paintSomething(Graphics g)
        {
            Graphics2D g2d = (Graphics2D)g;

            int w = getWidth();
            int h = getHeight();

            Font font = new Font("Serif", Font.BOLD, 48);

            g2d.setFont(font);

            g2d.setColor(Color.RED);

            g2d.drawString("JAVA 2D", w/2 - 75, h/2 - 24);


            font = new Font("Serif", Font.PLAIN, 30);

            g2d.setFont(font);

            g2d.setColor(Color.BLUE);

            AffineTransform affineTransform = new AffineTransform();

            affineTransform.setToRotation(Math.PI/2.0);

            g2d.setTransform(affineTransform);

            g2d.drawString("This is a vertical test string", 10, -30);


            font = new Font("Times", Font.ITALIC, 24);

            g2d.setFont(font);

            g2d.setColor(Color.BLACK);

            affineTransform = new AffineTransform();

            affineTransform.setToRotation(-Math.PI);

            g2d.setTransform(affineTransform);

            g2d.drawString("This is an upside-down test string at the bottom", -w + 5, -h+24);

        }
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            paintSomething(g);
        }
    }


    public static void main(String[] args) {
        new WordArt().init();
    }
}

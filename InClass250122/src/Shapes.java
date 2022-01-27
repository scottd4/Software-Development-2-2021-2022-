import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Shapes extends JFrame {


    private CanvasPanel drawingArea = new CanvasPanel();

    //private Container contentPane = this.getContentPane();

    public Shapes()
    {
        setSize(750, 750);
        setTitle("Shapes");

    }

    public void init()
    {
        add(drawingArea);
        setVisible(true);
    }

    class CanvasPanel extends JPanel{

        public CanvasPanel()
        {

        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            drawShapes(g);
        }

        public void drawShapes(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            g2d.setPaint(Color.red);

            RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

            g2d.setRenderingHints(rh);

            g2d.fillRect(30,20,50,50);

            g2d.fillRect(120,20, 90, 60);

            g2d.fillRoundRect(250,20,70,60, 25, 25);


            g2d.fill(new Ellipse2D.Double(10,100,80,100));

            g2d.fillArc(120, 130, 110, 100, 5, 150);

            g2d.fillOval(270,130,50,50);


        }
    }

    public static void main(String[] args) {
        new Shapes().init();
    }

}

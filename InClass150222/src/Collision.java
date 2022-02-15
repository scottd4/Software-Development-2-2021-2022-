import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Collision extends JFrame {

    private CanvasPanel canvas = new CanvasPanel();

    public Collision()
    {
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public void init()
    {
        this.add(canvas);
        this.setVisible(true);
    }

    class CanvasPanel extends JPanel{

        Shape shape1 = new Rectangle2D.Double(10, 10, 50, 50);

        Shape shape2 = new Ellipse2D.Double(55, 55, 50, 50);

        public CanvasPanel()
        {
            System.out.println(CheckCollision1());
            System.out.println(CheckCollision2());
            System.out.println(CheckCollision3());
        }

        public boolean CheckCollision1()
        {
            return shape1.intersects(shape2.getBounds2D());
        }

        public boolean CheckCollision2()
        {
            Area a = new Area(shape1);
            a.intersect(new Area(shape2));

            return !a.isEmpty();
        }

        public boolean CheckCollision3()
        {
            if(CheckCollision1())
                return CheckCollision2();

            return false;
        }



        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.BLUE);

            g2d.fill(shape1);

            g2d.setColor(Color.RED);

            g2d.fill(shape2);

        }

    }



    public static void main(String[] args) {
        new Collision().init();
    }
}

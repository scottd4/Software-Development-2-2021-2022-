import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Lab8 extends JFrame {

    private CanvasPanel canvas = new CanvasPanel();

    public Lab8()
    {
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void init()
    {
        this.add(canvas);
        this.setVisible(true);
    }

    class CanvasPanel extends JPanel implements MouseListener, MouseMotionListener
    {
        private ArrayList<Shape> shapes = new ArrayList<>();
        private int activeShapeIndex = -1;

        public CanvasPanel()
        {
            this.addMouseMotionListener(this);
            this.addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.BLUE);

            for(Shape s : shapes){
                g2d.fill(s);
            }


        }


        @Override
        public void mouseClicked(MouseEvent e) {

            System.out.println("here");
            shapes.add(new Rectangle2D.Double(e.getX(), e.getY(), 25,25));
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).contains(e.getPoint()))
                {
                    activeShapeIndex = i;
                    break;
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {
            activeShapeIndex = -1;
        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if(activeShapeIndex != -1)
            {
                shapes.set(activeShapeIndex, new Rectangle2D.Double(e.getX(), e.getY(), 25,25));
                repaint();
            }

        }

        @Override
        public void mouseMoved(MouseEvent mouseEvent) {

        }
    }

    public static void main(String[] args) {
        new Lab8().init();
    }
}

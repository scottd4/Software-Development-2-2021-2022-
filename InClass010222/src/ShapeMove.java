import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;

public class ShapeMove extends JFrame {

    private CanvasPanel canvas = new CanvasPanel();

    public ShapeMove()
    {
        this.setSize(400, 400);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void init()
    {
        this.add(canvas);
        this.setVisible(true);
    }

    class CanvasPanel extends JPanel implements MouseListener, MouseMotionListener
    {
        private Rectangle2D rect = new Rectangle2D.Double(100,100,50,50);

        private boolean pressed = false;

        private Color [] colors = {Color.BLUE, Color.RED, Color.GREEN};

        private int colorTracker = 0;

        public CanvasPanel(){
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(colors[colorTracker]);

            g2d.fill(rect);

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if(rect.contains(e.getPoint())) {
                colorTracker = (colorTracker + 1) % colors.length;
                repaint();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(rect.contains(e.getPoint()))
            {
                //System.out.println("Square is pressed");
                pressed = true;
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            pressed = false;
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if(pressed) {
                double w = rect.getWidth();
                double h = rect.getHeight();
                double x = e.getX() - (w / 2);
                double y = e.getY() - (h / 2);

                rect = new Rectangle2D.Double(x, y, w, h);

                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new ShapeMove().init();
    }
}

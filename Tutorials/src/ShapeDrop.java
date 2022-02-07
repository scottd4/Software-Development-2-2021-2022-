import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class ShapeDrop extends JFrame {

    private CanvasPanel canvas = new CanvasPanel();

    public ShapeDrop()
    {
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void init()
    {
        this.add(canvas);
        this.setVisible(true);
    }

    class CanvasPanel extends JPanel implements MouseListener
    {
        private Shape shape = null;

        public CanvasPanel()
        {
            this.addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.BLUE);
            if(shape != null)
                g2d.fill(shape);


        }


        @Override
        public void mouseClicked(MouseEvent e) {

            shape = new Rectangle2D.Double(e.getX(), e.getY(), 25,25);
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    }

    public static void main(String[] args) {
        new ShapeDrop().init();
    }
}

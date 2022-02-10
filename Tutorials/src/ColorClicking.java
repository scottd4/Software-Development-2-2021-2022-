import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class ColorClicking extends JFrame {

    private ColorCanvas canvas = new ColorCanvas();

    public ColorClicking ()
    {
        this.setSize(750,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init()
    {
        this.add(canvas);
        this.setVisible(true);
    }

    class ColorCanvas extends JPanel implements MouseListener
    {
        private ArrayList<Shape> shapes = new ArrayList<>();
        private ArrayList<Integer> shapeColors = new ArrayList<>();

        private Color [] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.black, Color.MAGENTA};

        public ColorCanvas()
        {
            this.addMouseListener(this);
            this.setBackground(Color.GRAY);
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            for (int i = 0; i < shapes.size();i++)
            {
                g2d.setColor(colors[shapeColors.get(i)%colors.length]);

                g2d.fill(shapes.get(i));
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).contains(e.getPoint()))
                {
                    int color = shapeColors.get(i);
                    color++;
                    shapeColors.set(i, color);
                    repaint();
                    return;
                }
            }

            shapes.add(new Rectangle2D.Double(e.getX(), e.getY(), 50,50));
            shapeColors.add(0);
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
        new ColorClicking().init();
    }
}

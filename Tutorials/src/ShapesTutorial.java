import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ShapesTutorial extends JFrame implements ActionListener {

    private CanvasPanel canvas = new CanvasPanel();

    public ShapesTutorial()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
    }

    public void init()
    {
        this.add(canvas);
       this.setVisible(true);
    }

    class CanvasPanel extends JPanel implements MouseListener, MouseMotionListener
    {
        Shape s = null;
        public CanvasPanel()
        {
            s = getRandomShape();
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
        }

        private Shape getRandomShape()
        {
            int random = (int)(Math.random()*3);
            System.out.println(random);
            if(random == 0) {
                return new Rectangle2D.Double(10, 10, 50, 50);
            }
            else if (random == 1)
            {
                return new Rectangle2D.Double(10, 10, 100, 50);
            }
            else
                return new Ellipse2D.Double(10, 10, 50, 50);
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.RED);

            g2d.fill(s);
        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {

        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
            s = getRandomShape();
            repaint();
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

        @Override
        public void mouseDragged(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseMoved(MouseEvent mouseEvent) {

        }
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
    public static void main(String[] args) {
        new ShapesTutorial().init();
    }


}

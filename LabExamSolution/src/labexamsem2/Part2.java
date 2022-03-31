package labexamsem2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
/*
Modified shape drop to work with lab exam for group 3
- Allow shape to drop
- left click to grow, right click to shrink
- Toggle mode with spacebar to go to color mode
- clicking now changes color of shape

 */
class ShapeDrop extends JFrame {

    private CanvasPanel canvas = new CanvasPanel();

    private boolean toggle = false;

    private JLabel label = new JLabel("Size Mode");

    private Container contentPane = this.getContentPane();

    private Color [] color = {Color.BLUE, Color.RED, Color.GREEN, Color.GRAY, Color.black,Color.orange};

    private int colorTracker = 0;

    public ShapeDrop()
    {
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    }
    public void init()
    {
        this.add(label, BorderLayout.NORTH);
        this.add(canvas, BorderLayout.CENTER);
        this.setVisible(true);
    }

    class CanvasPanel extends JPanel implements MouseListener, KeyListener
    {
        private Shape shape = null;

        public CanvasPanel()
        {
            this.addMouseListener(this);
            this.addKeyListener(this);
            this.setFocusable(true);
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(color[Math.abs(colorTracker)]);
            if(shape != null)
                g2d.fill(shape);


        }


        @Override
        public void mouseClicked(MouseEvent e) {
            if(shape == null || !shape.contains(e.getPoint())) {
                shape = new Rectangle2D.Double(e.getX(), e.getY(), 25, 25);
            }
            else if(shape.contains(e.getPoint()))
            {
                int w = shape.getBounds().width;
                int h = shape.getBounds().height;
                int x = shape.getBounds().x;
                int y = shape.getBounds().y;

                if(!toggle) {


                    if (e.getButton() == MouseEvent.BUTTON1) {
                        h = h + 10;
                        w = w + 10;
                    }

                    if (e.getButton() == MouseEvent.BUTTON3) {
                        h = h - 10;
                        w = w - 10;
                    }


                    shape = new Rectangle2D.Double(x, y, w, h);
                }
                else
                {
                    if(e.getButton() == MouseEvent.BUTTON1)
                    {
                        colorTracker++;
                        colorTracker = colorTracker % color.length;
                    }
                    if(e.getButton() == MouseEvent.BUTTON3)
                    {
                        colorTracker--;
                        colorTracker = colorTracker % color.length;
                    }
                }
            }

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

        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == 32)
            {
                toggle = toggle ? false : true;
                label.setText(toggle ? "Color Mode" : "Size Mode");
            }
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    }
}

public class Part2 {

    public static void main(String[] args) {
        new ShapeDrop().init();
    }

}

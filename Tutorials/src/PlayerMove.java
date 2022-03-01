import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PlayerMove extends JFrame implements KeyListener{


    private CanvasPanel drawingArea = new CanvasPanel();

    //private Container contentPane = this.getContentPane();

    public PlayerMove()
    {
        setSize(750, 750);
        setTitle("Mover");
        addKeyListener(this);

    }

    public void init()
    {
        add(drawingArea);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key Pressed");
        //drawingArea.moveLeft();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == 68 ){
            drawingArea.moveRight();
        }
        else if(e.getKeyCode() == 65 )
        {
            drawingArea.moveLeft();
        }
        else if (e.getKeyCode() == 83)
        {
            //down
            drawingArea.moveDown();
        }
        else if(e.getKeyCode() == 87)
        {
            // up
            drawingArea.moveUp();

        }

        System.out.println(e.getKeyCode());
    }

    class CanvasPanel extends JPanel{

        private int xPos, yPos, xStep, yStep;


        public CanvasPanel()
        {
            xPos = 30;
            yPos = 20;
            xStep = 50;
            yStep = 25;

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

            g2d.fillRect(xPos,yPos,50,50);

        }

        public void moveUp()
        {
            yPos = yPos - yStep;
            repaint();
        }

        public void moveDown()
        {
            yPos = yPos + yStep;
            repaint();
        }

        public void moveLeft()
        {
            xPos =  xPos - xStep;

            repaint();
        }

        public void moveRight()
        {
            xPos =  xPos + xStep;

            repaint();
        }


    }

    public static void main(String[] args) {
        new PlayerMove().init();
    }

}


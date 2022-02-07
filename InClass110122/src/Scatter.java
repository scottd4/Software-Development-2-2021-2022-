import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Scatter extends JFrame {

    public Scatter() {
        setTitle("Points");
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {

        CanvasPanel canvasPanel = new CanvasPanel();
        add(canvasPanel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Timer timer = canvasPanel.getTimer();
                timer.stop();
            }
        });

        setVisible(true);
    }

    class CanvasPanel extends JPanel implements ActionListener
    {
        private final int DELAY = 150;
        private Timer timer;

        private Color[] colors = {Color.BLACK, Color.BLUE, Color.cyan, Color.magenta, Color.RED};
        private int tracker = 0;


        public CanvasPanel()
        {
            init();
        }

        public void init()
        {
            timer = new Timer(DELAY, this);
            timer.start();
        }
        public Timer getTimer()
        {
            return  timer;
        }

        public void paintSomething(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            g2d.setPaint(colors[tracker % colors.length]);

            int w = getWidth();
            int h = getHeight();

            Random r = new Random();

            for(int i = 0; i < 2000; i++)
            {
                int x = Math.abs(r.nextInt()) % w;
                int y = Math.abs(r.nextInt()) % h;

                g2d.drawOval(x - 5,y - 5,10,10);
            }

            tracker++;
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            paintSomething(g);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    public static void main(String[] args) {
        new Scatter().init();
    }

}

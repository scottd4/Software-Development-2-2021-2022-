import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Scatter extends JFrame {

    public Scatter()
    {

        CanvasPanel canvasPanel =  new CanvasPanel();

        this.add(canvasPanel);
        this.setTitle("Scatter");
        this.setSize(750, 750);

        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent windowEvent) {

                        canvasPanel.getTimer().stop();
                        // here
                        super.windowClosing(windowEvent);
                    }
                }
        );

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init()
    {
        this.setVisible(true);
    }

    class CanvasPanel extends JPanel implements ActionListener
    {
        private final int DELAY = 150;
        private Timer timer;

        private Color[] colors = {Color.BLACK, Color.CYAN, Color.green};
        private int tracker = 0;

        public CanvasPanel()
        {
            timer = new Timer(DELAY, this);
            timer.start();
        }

        public Timer getTimer()
        {
            return timer;
        }

        public void paintSomething(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            g2d.setPaint(colors[tracker%colors.length]);

            int w = this.getWidth();
            int h = this.getHeight();

            Random r = new Random();

            for(int i = 0; i < 2000; i++)
            {
                int x = Math.abs(r.nextInt()) % w;
                int y = Math.abs(r.nextInt()) % h;

                g2d.drawOval(x - 5, y - 5, 10, 10);
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
        public void actionPerformed(ActionEvent actionEvent) {
            repaint();
        }
    }

    public static void main(String[] args) {
        new Scatter().init();
    }

}

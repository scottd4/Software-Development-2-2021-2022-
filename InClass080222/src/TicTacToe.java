import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToe extends JFrame {

    private PlayArea playArea = new PlayArea();

    enum Player{
        ONE,TWO
    }

    public TicTacToe()
    {
        setSize(750,750);
        setTitle("Tic Tac Toe Game");
    }

    public void init()
    {
        add(playArea);
        this.setVisible(true);
    }

    class PlayArea extends JPanel implements MouseListener {

        private char [][] values = new char[3][3];

        private int w, h;

        private Player player;

        public PlayArea()
        {

            player = Player.ONE;
            addMouseListener(this);
            setBackground(Color.gray);
        }

        public void drawGrid(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            int offset = 2;

            g2d.setStroke(new BasicStroke(offset * 2));

            //Vertical Lines
            for(int i = 1; i < values.length; i++)
            {
                g2d.drawLine(((w/values.length)*i)+offset, 0,((w/values.length)*i)+offset,  h);
            }

            //Horizontal Lines
            for(int i = 1; i < values.length; i++)
            {
                g2d.drawLine(0, ((h/values[0].length)*i)+offset,w,  ((h/values[0].length)*i)+offset);
            }
        }

        public void drawValues(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int offsetAcross = w/values[0].length;
            int offsetDown = h/values.length;

            Font f = new Font("TimesRoman", Font.BOLD, offsetAcross);

            FontMetrics metrics = g2d.getFontMetrics(f);

            g2d.setFont(f);

            for(int i = 0; i < values.length; i++)
            {
                for (int j = 0; j < values[0].length; j++)
                {
                    if(values[i][j] == 'X')
                    {
                        g2d.setColor(Color.RED);
                    }
                    else
                    {
                        g2d.setColor(Color.BLUE);
                    }

                    int x =  (j *offsetAcross) +((offsetAcross - metrics.stringWidth(""+values[i][j]))/2);
                    int y =  (i*offsetDown)+  ((offsetDown - metrics.getHeight()) / 2) + metrics.getAscent();

                    //g2d.drawString(""+values[i][j], (j *offsetAcross) ,(i*offsetDown) + offsetDown );

                    g2d.drawString(""+values[i][j], x,y);
                }
            }

        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            w = this.getWidth();
            h = this.getHeight();

            drawGrid(g);

            drawValues(g);
        }

        public void clickedGrid(MouseEvent e)
        {
            Point p = e.getPoint();

            int horizontalIndex = values[0].length -1;
            int verticalIndex= values.length - 1;

            for(int i = 0; i < values[0].length - 1; i++ )
            {
                if(p.getX() >= (w/ values[0].length)*i && p.getX() < ((w/ values[0].length)*(i+1)))
                {
                    horizontalIndex = i;
                    break;
                }
            }

            for(int i = 0; i < values.length -1; i++)
            {
                if (p.getY() >=  (h/values.length)*i && p.getY() < (h/values.length)*(i+1))
                {
                    verticalIndex = i;
                    break;
                }
            }

            if(player == Player.ONE)
            {
                values[verticalIndex][horizontalIndex] = 'X';
                player = Player.TWO;
            }
            else
            {
                values[verticalIndex][horizontalIndex] = 'O';
                player = Player.ONE;
            }

            /*for (char [] row : values)
            {
                for (char c : row)
                {
                    System.out.print(c + " ");
                }
                System.out.println();
            }*/

            repaint();

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            clickedGrid(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}

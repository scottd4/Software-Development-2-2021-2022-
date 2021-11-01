import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame {

    public LayoutDemo()
    {
        this.setSize(400,400);
        this.setTitle("Layout Demo");
        //override this
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init(int i)
    {
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");
        JButton b7 = new JButton("b7");
        JButton b8 = new JButton("b8");
        JButton b9 = new JButton("b9");
        JButton b10 = new JButton("b10");



        if (i == 0)
        {
            this.setLayout(new BorderLayout());

            this.add(b1, BorderLayout.NORTH);
            this.add(b2, BorderLayout.SOUTH);
            this.add(b3, BorderLayout.EAST);
            this.add(b4, BorderLayout.WEST);
            this.add(b5, BorderLayout.CENTER);


        }

        if(i == 1)
        {
            this.setLayout(new GridLayout(3,3));

            this.add(b1);
            this.add(new JPanel());
            this.add(b3);
            this.add(b4);
            this.add(b5);
            this.add(b6);
            this.add(b7);
            this.add(b8);
            this.add(b9);



        }

        if(i == 2)
        {
            this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.LINE_AXIS));

            this.add(b1);
            this.add(b2);
            this.add(b3);
            this.add(b4);
            this.add(b5);
            this.add(b6);
            this.add(b7);
            this.add(b8);
            this.add(b9);
        }

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutDemo().init(2);
    }
}

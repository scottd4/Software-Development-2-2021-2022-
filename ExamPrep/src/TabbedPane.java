import javax.swing.*;
import java.awt.*;

public class TabbedPane extends JFrame {

    private JTabbedPane tabbed = new JTabbedPane();

    private JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel();

    public TabbedPane()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setTitle("Tabbed");
    }

    public void init()
    {
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.GREEN);

        tabbed.add("Black", p1);
        tabbed.add("Blue", p2);
        tabbed.add("Green", p3);

        this.add(tabbed);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPane().init();
    }
}

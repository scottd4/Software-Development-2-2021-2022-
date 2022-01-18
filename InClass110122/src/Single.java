import javax.swing.*;
import java.awt.*;

public class Single extends JFrame {

    private static Single INSTANCE = null;

    private Single()
    {
        this.setTitle("single");

        this.setLayout(new FlowLayout());

        this.setSize(600, 600);

        this.setVisible(true);
    }

    public static Single getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new Single();
        }

        return INSTANCE;
    }
}

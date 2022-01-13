import javax.swing.*;

public class Single extends JFrame {

    private static Single INSTANCE = null;

    private Single()
    {
        add(new JLabel("Single"));
        setSize(400, 400);
        setVisible(true);
    }

    public static Single getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new Single();
        }

        return INSTANCE;
    }


}

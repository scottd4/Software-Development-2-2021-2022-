import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {

    private JButton button1 = new JButton("Singleton"), button2 = new JButton("Not Singleton");


    public MainMenu()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);

        setLayout(new FlowLayout());

        add(button1);
        add(button2);

        setSize(400,400);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1)
        {
            Single s = Single.getInstance();

        }
        else if (e.getSource() == button2)
        {
            new NotSingle();
        }
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}

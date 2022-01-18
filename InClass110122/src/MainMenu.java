import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {

    private JButton button1 =  new JButton("Single"), button2 =  new JButton("Not Single");

    public MainMenu()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);

        this.add(button1);
        this.add(button2);

       this.setLayout(new FlowLayout());

       this.setSize(400, 400);

       this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == button1)
        {
            //singleton action
            Single.getInstance();
        }
        else
        {
            //non single action
            new NonSingle();
        }
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}

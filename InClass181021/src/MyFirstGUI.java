import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstGUI extends JFrame implements ActionListener {

    private JLabel label = new JLabel("Hello world");
    private JButton button = new JButton("push me");


    public MyFirstGUI()
    {
        this.setTitle("My First GUI");
        this.setSize(400,400);
        this.setLayout(new FlowLayout());
    }

    public void init()
    {


        button.addActionListener(this);

        this.add(label);
        this.add(button);




        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFirstGUI().init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button)
        {
            label.setText("button pushed");
        }
    }
}

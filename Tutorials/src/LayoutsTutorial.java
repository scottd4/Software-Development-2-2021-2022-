import javax.swing.*;
import java.awt.*;

public class LayoutsTutorial extends JFrame {


    public LayoutsTutorial()
    {
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void init()
    {
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(0,15,10,15);

        gbc.gridx = 0;
        gbc.gridy = 0;

        this.add(new JButton("Button 1"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        //gbc.ipadx = 100;

        //gbc.fill = GridBagConstraints.HORIZONTAL;

        this.add(new JButton("Button 3"), gbc);


        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;


        this.add(new JButton("Button 2"), gbc);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutsTutorial().init();
    }
}

import sun.misc.JavaLangAccess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame implements ActionListener, CurrencyInterface {


    private JLabel euroLabel = new JLabel("euro:");
    private JLabel gbpLabel = new JLabel("gbp:");
    private JLabel usdLabel = new JLabel("usd:");
    private JLabel yuanLabel = new JLabel("yuan:");

    private JTextField euroArea = new JTextField();
    private JTextField gbpArea = new JTextField();
    private JTextField usdArea = new JTextField();
    private JTextField yuanArea = new JTextField();

    private double usd = 0.0;
    private Container contentPane = this.getContentPane();


    public CurrencyConverter()
    {
        this.setSize(400,250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void init()
    {
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(0, 5,0,5);

        c.gridx = 0;
        c.gridy = 0;

        contentPane.add(euroLabel, c);

        c.gridx = 1;
        contentPane.add(gbpLabel, c);

        c.gridx = 2;
        contentPane.add(usdLabel, c);

        c.gridx = 3;
        contentPane.add(yuanLabel, c);
        // -------------

        c.gridx = 0;
        c.gridy = 1;

        c.fill = GridBagConstraints.HORIZONTAL;

        contentPane.add(euroArea, c);

        c.gridx = 1;
        contentPane.add(gbpArea, c);

        c.gridx = 2;
        contentPane.add(usdArea, c);

        c.gridx = 3;
        contentPane.add(yuanArea, c);


        euroArea.addActionListener(this);
        gbpArea.addActionListener(this);
        usdArea.addActionListener(this);
        yuanArea.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == euroArea)
        {
            double value = Double.parseDouble(euroArea.getText());
            euroToUsd(value);
        }
        if(e.getSource() == usdArea)
        {
            double value = Double.parseDouble(usdArea.getText());
            setUSD(value);
        }

        euroArea.setText(""+euroFromUsd());
        gbpArea.setText(""+gbpFromUsd());
        usdArea.setText(""+getUSD());
        yuanArea.setText(""+yuanFromUsd());

    }

    public static void main(String[] args) {
        new CurrencyConverter().init();
    }

    @Override
    public double getUSD() {
        return usd;
    }

    @Override
    public void setUSD(double d) {
        usd = d;
    }

    @Override
    public void euroToUsd(double d) {
        usd = d/1.14;
    }

    @Override
    public double euroFromUsd() {
        return usd * 1.14;
    }

    @Override
    public void gbpToUsd(double d) {

    }

    @Override
    public double gbpFromUsd() {
        return 0;
    }

    @Override
    public void yuanToUsd(double d) {

    }

    @Override
    public double yuanFromUsd() {
        return 0;
    }
}

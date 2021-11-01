import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TempConvert extends JFrame implements ActionListener, WindowListener {


    private Container contentPane = this.getContentPane();

    private JLabel cLabel = new JLabel("C:"), fLabel = new JLabel("F:");

    private JTextField cArea = new JTextField(10), fArea = new JTextField(10);

    private double cValue, fValue;

    public TempConvert()
    {
        this.setSize(400,100);
        this.setResizable(false);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        this.addWindowListener(this);

        this.setTitle("Temp Convert");
    }

    public void init()
    {

        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.insets = new Insets(0,1,0,1);

        gbc.gridx = 1;
        gbc.gridy = 1;

        contentPane.add(cLabel, gbc);

        gbc.gridx = 2;

        contentPane.add(fLabel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 1;
        gbc.gridy = 2;

        contentPane.add(cArea, gbc);

        gbc.gridx = 2;

        contentPane.add(fArea, gbc);

        cArea.addActionListener(this);

        fArea.addActionListener(this);

        this.setVisible(true);
    }

    public double convertTemp(double d, char c)
    {
        if (c == 'C')
        {
            return Math.round(((d*1.8)+32)*100)/100;
        }
        else
        {
            return Math.round(((d-32)/1.8)*100)/100;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cArea)
        {
            cValue = Double.parseDouble(cArea.getText());
            fValue = convertTemp(cValue, 'C');
        }
        else{
            fValue = Double.parseDouble(fArea.getText());
            cValue = convertTemp(fValue, 'F');
        }

        cArea.setText(""+cValue);
        fArea.setText(""+fValue);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window starts");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // we can do something here


        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new TempConvert().init();
    }
}

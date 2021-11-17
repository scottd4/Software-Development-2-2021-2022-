import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiView extends JFrame implements ActionListener {

    private JButton house = new JButton("house");
    private JButton apart = new JButton("apart");
    private JButton office = new JButton("office");

    private JPanel buttonPanel =  new JPanel();
    private JPanel housePanel =  new JPanel();
    private JPanel apartPanel =  new JPanel();
    private JPanel officePanel =  new JPanel();

    private JLabel houseLabel = new JLabel("house");
    private JLabel apartLabel = new JLabel("apart");
    private JLabel officeLabel = new JLabel("office");

    public MultiView()
    {
        this.setSize(400,400);
        this.setTitle("Building View");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    }

    public void init()
    {
        house.addActionListener(this);
        apart.addActionListener(this);
        office.addActionListener(this);

        buttonPanel.add(house);
        buttonPanel.add(apart);
        buttonPanel.add(office);

        this.add(buttonPanel);

        housePanel.add(houseLabel);
        apartPanel.add(apartLabel);
        officePanel.add(officeLabel);

        this.add(housePanel);
        this.add(officePanel);
        this.add(apartPanel);

        apartPanel.setVisible(false);
        officePanel.setVisible(false);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == house)
        {
            housePanel.setVisible(true);
            officePanel.setVisible(false);
            apartPanel.setVisible(false);
        }
        else if(e.getSource() == office)
        {
            housePanel.setVisible(false);
            officePanel.setVisible(true);
            apartPanel.setVisible(false);
        }
        else
        {
            housePanel.setVisible(false);
            officePanel.setVisible(false);
            apartPanel.setVisible(true);
        }

    }

    public static void main(String[] args) {
        new MultiView().init();
    }


}

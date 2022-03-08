import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSoupGUI extends JFrame implements ActionListener {

    private Container contentPane = this.getContentPane();

    private JButton convertButton = new JButton("Convert");

    private String [] selection = {"EUR", "GBP", "USD", "CNY", "JPY"};

    private JComboBox<String> cb1 = new JComboBox<>(selection);
    private JComboBox<String> cb2 = new JComboBox<>(selection);

    private JTextField f1 = new JTextField();
    private JTextField f2 = new JTextField();

    public JSoupGUI()
    {
        this.setSize(250, 250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Cur Convert");

    }

    public void init()
    {
        cb2.setSelectedIndex(2);
        f2.setEditable(false);

        convertButton.addActionListener(this);

        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(0,5,0,5);

        c.gridx = 0;
        c.gridy = 0;

        contentPane.add(cb1, c);

        c.gridx = 1;

        contentPane.add(cb2, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;

        contentPane.add(f1, c);

        c.gridx = 1;

        contentPane.add(f2, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;

        contentPane.add(convertButton, c);


        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(f1.getText());
            String from = (String)cb1.getSelectedItem();
            String to = (String)cb2.getSelectedItem();

            convert(amount, from, to);
        }
        catch (Exception ex)
        {
            System.out.println("expecting double try again");
        }

    }

    public void convert(double amount, String fromValue, String toValue)
    {
        try {

            Document doc = Jsoup.connect(String.format("https://www.xe.com/currencyconverter/convert/?Amount=%f&From=%s&To=%s", amount, fromValue, toValue)).get();

            Elements elements = doc.select("p");
            for (Element element : elements) {
                //System.out.println(element);
                String classes = element.className();
                if(classes.contains("result__BigRate"))
                {
                    //System.out.println(element.text());
                    f2.setText(element.text().substring(0,element.text().indexOf(".")+3).replaceAll(",", ""));
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new JSoupGUI().init();
    }
}

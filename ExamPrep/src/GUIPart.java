import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUIPart extends JFrame implements ActionListener, ChangeListener {

    private JTabbedPane tabbedPane = new JTabbedPane();

    private JTable table = new JTable();

    private JScrollPane scrollPane;

    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();

    private JComboBox<String> choices;

    private JTextPane textArea = new JTextPane();

    private JButton addButton = new JButton("Add");
    private JButton removeButton = new JButton("Remove");

    private ReadCSV csv;

    public GUIPart()
    {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("GUI Part");
        this.setSize(750,750);
        this.setLayout(new BorderLayout());

    }

    public void init()
    {

        File selectedFile = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        int result = fileChooser.showOpenDialog(this.getContentPane());

        if (result == JFileChooser.APPROVE_OPTION)
        {
            selectedFile = fileChooser.getSelectedFile();

        }

        csv = new ReadCSV(selectedFile);

        DefaultComboBoxModel<String> options = new DefaultComboBoxModel<>();
        choices = new JComboBox<>(options);


        for (LocalEleStat stat: csv.getStats()) {

            String area = stat.getLocalElectoralArea();

            if(options.getIndexOf(area) == -1)
            {
                options.addElement(area);
            }
        }

        choices.addActionListener(this);

        //___________________________________________
        // Panel 1

        p1.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(0,5,0,5);

        c.gridx = 0;
        c.gridy = 0;

        p1.add(choices, c);

        c.gridy = 1;
        p1.add(textArea, c);

        String area = (String)choices.getSelectedItem();
        setArea(area);
        //___________________________________________
        // Panel 2

        p2.setLayout(new GridBagLayout());

        c = new GridBagConstraints();

        updateTable();

        table.setAutoCreateRowSorter(true);

        scrollPane = new JScrollPane(table);

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;

        p2.add(scrollPane, c);

        c.fill = GridBagConstraints.NONE;
        c.gridy = 1;
        p2.add(removeButton,c);

        removeButton.addActionListener(this);

        //___________________________________________
        // Panel 3

        addButton.addActionListener(this);
        p3.add(addButton);


        tabbedPane.add("Select Area",p1);
        tabbedPane.add("View All",p2);
        tabbedPane.add("Add New",p3);

        tabbedPane.addChangeListener(this);

        this.add(tabbedPane, BorderLayout.CENTER);

        this.setVisible(true);


    }

    private void updateTable()
    {
        String [] cols = csv.getHeadings();

        DefaultTableModel model = new DefaultTableModel(cols, 0);
        for(LocalEleStat stat : csv.getStats())
        {
            model.addRow(new Object[]{
                    stat.getNo(),
                    stat.getSurname(),
                    stat.getFirstName(),
                    stat.getAddress(),
                    stat.getParty(),
                    stat.getLocalElectoralArea()
            });
        }

        table.setModel(model);
    }

    public void setArea(String area)
    {
        textArea.setText(" ");
        StringBuilder display = new StringBuilder("<html><table>");
        for(LocalEleStat stat: csv.getStats())
        {
            if(stat.getLocalElectoralArea().equals(area))
            {
                display.append(stat.toString());

            }

        }
        display.append("</table></html>");

        textArea.setContentType("text/html");
        textArea.setText(display.toString());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == choices){
            String area = (String)choices.getSelectedItem();
            setArea(area);
        }
        if (e.getSource() == addButton)
        {
            csv.addStat(new LocalEleStat("1,Rock,Noel,\"69 Pinewood Crescent, Glasnevin North, Dublin 9\",Fine Gael,Artane/Whitehall,,,,,"));
        }
        if (e.getSource() == removeButton)
        {
            String value = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
            csv.removeStat(value);
            updateTable();
        }

    }
    @Override
    public void stateChanged(ChangeEvent changeEvent) {

        JTabbedPane temp = (JTabbedPane)changeEvent.getSource();

        if(temp.getSelectedIndex() == 0)
        {
            String area = (String)choices.getSelectedItem();
            setArea(area);
        }
        else if (temp.getSelectedIndex() == 1)
        {
            updateTable();
        }

    }
    public static void main(String[] args) {
        new GUIPart().init();
    }



}

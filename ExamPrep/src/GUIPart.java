import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUIPart extends JFrame {

    private JTabbedPane tabbedPane = new JTabbedPane();

    private JTable table;

    private JScrollPane scrollPane;

    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();

    public GUIPart()
    {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("GUI Part");
        this.setSize(750,750);

    }

    public void init()
    {
        ReadCSV csv = new ReadCSV();

        String [] cols = csv.getHeadings();

        DefaultTableModel model = new DefaultTableModel(cols, 0);

        for(LocalEleStat stat : csv.getStats())
        {
            model.addRow(new Object[]{
                stat.getSurname(),
                stat.getFirstName(),
                stat.getAddress(),
                stat.getParty(),
                stat.getLocalElectoralArea()
            });
        }

        table = new JTable(model);

        table.setAutoCreateRowSorter(true);

        scrollPane = new JScrollPane(table);

        p2.add(scrollPane);

        tabbedPane.add("First Tab",p1);
        tabbedPane.add("Second Tab",p2);

        this.add(tabbedPane);

        this.setVisible(true);


    }

    public static void main(String[] args) {
        new GUIPart().init();
    }
}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class Table extends JFrame {
    private JTable table;

    private JScrollPane pane;

    public Table()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setTitle("Tables");
    }
    public void init()
    {
        String [] cols = new String[]{"name", "age", "location"};

        Object [][] data ={
                {"Sam", "22", "Dublin"},
                {"john", "50", "Galway"},
                {"Jane", "30", "Athlone"},
        };



        table = new JTable(data, cols);

        pane = new JScrollPane(table);

        table.setAutoCreateRowSorter(true);

        this.add(pane);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Table().init();
    }


}

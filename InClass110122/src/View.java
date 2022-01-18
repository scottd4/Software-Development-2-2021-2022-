import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JButton saveButton = new JButton("Save");
    private JButton resetButton = new JButton("Reset");

    private JLabel studentLabel = new JLabel("Student:");
    private JLabel numberLabel = new JLabel("Student No:");

    private JTextArea studentArea =  new JTextArea();
    private JTextArea numberArea =  new JTextArea();

    private Container contentPane = this.getContentPane();

    public View()
    {
        this.setSize(400,400);
        this.setTitle("MVC Demo");
        this.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

    }

    public void init()
    {
        contentPane.add(studentLabel);
        contentPane.add(studentArea);

        contentPane.add(numberLabel);
        contentPane.add(numberArea);

        contentPane.add(saveButton);
        contentPane.add(resetButton);

        this.setVisible(true);
    }

    public void addResetListener(ActionListener l)
    {
        resetButton.addActionListener(l);
    }

    public void addSaveListener(ActionListener l)
    {
        saveButton.addActionListener(l);
    }

    public String getStudent()
    {
        return studentArea.getText();
    }

    public String getNumber()
    {
        return numberArea.getText();
    }

    public void setStudent(String s)
    {
        studentArea.setText(s);
    }

    public void setNumber(String s)
    {
        numberArea.setText(s);
    }

    public static void main(String[] args) {
        new View().init();
    }
}

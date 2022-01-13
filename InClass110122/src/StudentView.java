import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {

    private JButton saveButton = new JButton("Save");
    private JButton resetButton = new JButton("Reset");

    private JLabel studentLabel = new JLabel("Student: ");
    private JLabel numberLabel = new JLabel("Student Number: ");

    private JTextArea studentTextArea = new JTextArea();
    private JTextArea numberTextArea = new JTextArea();

    private Container contentPane = this.getContentPane();

    public StudentView()
    {
        this.setSize(400, 400);
        this.setTitle("MVC Demo");
        this.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
    }

    public void init()
    {
        contentPane.add(studentLabel);
        contentPane.add(studentTextArea);

        contentPane.add(numberLabel);
        contentPane.add(numberTextArea);

        contentPane.add(saveButton);
        contentPane.add(resetButton);

        this.setVisible(true);
    }

    public void addSaveActionListener(ActionListener l)
    {
        saveButton.addActionListener(l);

    }

    public void addResetActionListener(ActionListener l)
    {
        resetButton.addActionListener(l);
    }

    public String getStudent()
    {
        return studentTextArea.getText();
    }

    public String getNumber()
    {
        return numberTextArea.getText();
    }

    public void setStudent(String s)
    {
        studentTextArea.setText(s);
    }
    public void setNumber(String s)
    {
        numberTextArea.setText(s);
    }
}

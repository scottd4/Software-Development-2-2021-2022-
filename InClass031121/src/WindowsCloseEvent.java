import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintWriter;

public class WindowsCloseEvent extends JFrame implements WindowListener {

    public WindowsCloseEvent()
    {
        this.setSize(400,400);
        this.setTitle("Grab Close Event");
        // stopping JFrame handeling close o[eration
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        // adding a listener to the window to check for events
        this.addWindowListener(this);
    }

    public void init()
    {
        this.setVisible(true);
    }


    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("the App has started");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            PrintWriter pw = new PrintWriter("fileOnClose.txt");


            pw.println("we do this before closing the window");

            pw.close();

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Minimised");
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
        new WindowsCloseEvent().init();
    }
}

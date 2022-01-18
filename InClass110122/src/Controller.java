import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private Model studentModel = new Model();
    private View studentView = new View();

    public Controller()
    {
        studentView.init();

        new SaveController();
        new ResetController();
    }

    class SaveController implements ActionListener
    {
        public SaveController()
        {
            studentView.addSaveListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            studentModel.setsName(studentView.getStudent());
            studentModel.setsNumber(studentView.getNumber());
        }
    }
    class ResetController implements ActionListener
    {
        public ResetController()
        {
            studentView.addSaveListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            studentView.setStudent(studentModel.getsName());
            studentView.setNumber(studentModel.getsNumber());
        }
    }

    public static void main(String[] args) {
        new Controller();
    }
}

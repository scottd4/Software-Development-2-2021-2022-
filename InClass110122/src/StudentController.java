import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {

    private StudentModel sModel = new StudentModel();
    private StudentView sView = new StudentView();

    public StudentController()
    {
        sView.init();

        new SaveController();
        new ResetContoller();
    }

    class SaveController implements ActionListener {

        public SaveController()
        {
            sView.addSaveActionListener(this);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            sModel.setName(sView.getStudent());
            sModel.setNumber(sView.getNumber());
        }
    }

    class ResetContoller implements ActionListener{

        public ResetContoller()
        {
            sView.addResetActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            sView.setStudent(sModel.getName());
            sView.setNumber(sModel.getNumber());
        }
    }

    public static void main(String[] args) {
        new StudentController();
    }

}

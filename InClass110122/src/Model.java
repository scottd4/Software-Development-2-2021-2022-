public class Model {

    private String sName, sNumber;

    public Model()
    {

    }
    public Model(String sName, String sNumber) {
        this.sName = sName;
        this.sNumber = sNumber;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "Model{" +
                "sName='" + sName + '\'' +
                ", sNumber='" + sNumber + '\'' +
                '}';
    }
}

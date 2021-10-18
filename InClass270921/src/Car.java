public class Car extends Vehicle{

    private String bodyStyle;

    public Car(String make, String model, String bodyStyle)
    {
        super(make, model);

        this.bodyStyle = bodyStyle;

    }

    @Override
    public String toString()
    {
        return super.toString() + " BodyStyle " + bodyStyle;
    }
}
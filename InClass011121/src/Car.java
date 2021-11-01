public class Car implements Wheel, Door{

    private int wheels;

    public Car()
    {
        wheels = DEFAULT_NUM_WHEELS;
    }


    @Override
    public int getDoor() {
        return 0;
    }

    @Override
    public void setDoor(int i) {

    }

    @Override
    public int getWheel() {
        return 0;
    }

    @Override
    public void setWheel(int i) {

    }
}

public class Truck extends Vehicle{

    private int loadCapacity;

    public Truck(String make, String model, int numWheel, int loadCapacity)
    {
        super(make, model, numWheel);

        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString()
    {
        return super.toString() + " load capacity " + loadCapacity;
    }
}

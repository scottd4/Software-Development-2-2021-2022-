public class Vehicle {

    private int numWheels;
    private String make, model;

    //default
    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
        this.numWheels = 4;
    }

    public Vehicle(String make, String model, int numWheels)
    {
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String toString()
    {
        return "Make = " + make + " Model = "
                + model + " num Wheels " + numWheels;
    }


}

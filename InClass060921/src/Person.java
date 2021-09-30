public class Person {


    public static int counter = 0;

    private String fName, lName;
    private Address address;


    public Person(String fName, String lName, Address address)
    {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        counter++;
    }
    public Address getAddress()
    {
        return address;
    }

    public String toString()
    {
        return lName + ", " + fName + "\n" + address;
    }


}

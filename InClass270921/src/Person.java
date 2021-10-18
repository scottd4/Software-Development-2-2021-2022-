public class Person {

    public static int count = 0;

    private String fName, lName;
    private Address address;

    public Person(String fName, String lName, Address address)
    {



        this.fName = validateString(fName);
        this.lName = lName;
        this.address = address;
        count++;
    }

    private String validateString(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("cannot be null");
        }

        return s;
    }

    public int getCount()
    {
        return count;
    }

    public String getStreet()
    {
        return address.line1;
    }

    public String toString()
    {
        return "First Name: " + fName + "\nLastName: " + lName+
                "\naddress: " +address;
    }
}

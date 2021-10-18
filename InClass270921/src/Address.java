public class Address {

    public String line1, zip;

    public Address(String line1, String zip)
    {
        this.line1 = line1;
        this.zip = zip;
    }

    public String toString()
    {
        return "Line 1: " + line1 + "\nLine2: " + zip;
    }
}

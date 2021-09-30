public class Address {

    public String line1, line2, county, country, zip;

    public Address(String line1,String line2,String county,String country,String zip)
    {
        this.line1 = line1;
        this.line2 = line2;
        this.county = county;
        this.country = country;
        this.zip = zip;
    }

    public String toString()
    {
        return (line1+"\n\t"+line2+"\n\t\t"+county+"\n\t\t\t"+country+"\n\t\t\t\t"+zip);
    }

}

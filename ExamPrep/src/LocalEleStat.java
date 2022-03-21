import java.util.Arrays;
import java.util.Scanner;

public class LocalEleStat {

    private String surname,firstName,party,localElectoralArea;
    private Address address;

    public LocalEleStat(String s)
    {
        try {
            Scanner sc = new Scanner(s);

            sc.useDelimiter("\"");

            String[] part1 = sc.next().split(",");
            address = new Address(sc.next());
            String[] part3 = sc.next().split(",");

            surname = part1[1];
            firstName = part1[2];

            party = part3[1];
            localElectoralArea = part3[2];
        }
        catch (Exception e)
        {
            //ignore exceptions
            throw new IllegalArgumentException("doesnt fit");
        }
    }

    private String pad(String s, int padding)
    {
        String temp = "";
        for(int i = 0; i < padding; i++)
        {
            temp = temp + " ";
        }

        return (s+temp).substring(0, padding);

    }

    @Override
    public String toString() {


        return String.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>", (surname+"," +firstName), party, localElectoralArea);
        //return surname + ", \t" + firstName + "\t(" + party +") \t\t\t" + localElectoralArea;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getParty() {
        return party;
    }

    public String getLocalElectoralArea() {
        return localElectoralArea;
    }

    public Address getAddress() {
        return address;
    }

    class Address
    {
        String [] lines;

        public Address(String s)
        {
            lines = s.split(",");
        }


        @Override
        public String toString() {
            return  Arrays.toString(lines);

        }
    }
}

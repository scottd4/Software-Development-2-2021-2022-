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

    @Override
    public String toString() {
        return "LocalEleStat{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", party='" + party + '\'' +
                ", localElectoralArea='" + localElectoralArea + '\'' +
                ", address=" + address +
                '}';
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

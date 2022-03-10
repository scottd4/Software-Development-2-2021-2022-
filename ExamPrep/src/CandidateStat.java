import java.sql.SQLOutput;
import java.util.Scanner;

public class CandidateStat {

    private String surname,firstName,party,localElectoralArea;
    private Address address;

    public CandidateStat(String s)
    {
        try {
            Scanner sc = new Scanner(s);
            sc.useDelimiter("\"");

            String [] part1 = sc.next().split(",");
            address = new Address(sc.next());
            String [] part3 = sc.next().split(",");

            surname = part1[1];
            firstName = part1[2];
            party = part3[1];
            localElectoralArea = part3[2];

        }
        catch (Exception e)
        {
            // ignore those that have nothing in them
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Surname=" + surname +
                "\nFirst_Name=" + firstName +
                "\nParty=" + party +
                "\nLocal_Electoral_Area=" + localElectoralArea +
                "\nAddress=\n" + address+
                "\n-----------------------------\n";
    }

    class Address{

        public String [] address;

        public Address(String s)
        {
            address = s.split(",");

        }

        @Override
        public String toString() {

            String printAddress = "";

            for (String line : address)
            {
                printAddress = printAddress + line +"\n";
            }

            return printAddress;

        }
    }
}

package labexamsem1;

import java.util.Scanner;

public class ParkStat implements Comparable<ParkStat> {

    private String name,address,website,type,muga;

    public static int sortOrder = 0;

    public ParkStat(String s)
    {
        Scanner sc = new Scanner(s);
        sc.useDelimiter(",");

        sc.next();//dont care about id

        if(s.contains("\""))
        {
            name = extractDetails(sc.next(), sc);
            address = extractDetails(sc.next(), sc);

            website = sc.next();
            type = sc.next();
            muga = sc.next();

        }
        else
        {
            name = sc.next();
            address = sc.next();
            website = sc.next();
            type = sc.next();
            muga = sc.next();
        }
    }

    public String extractDetails(String s, Scanner sc)
    {
        if(s.contains("\""))
        {
            sc.useDelimiter("\"");

            s = s.replace("\"", "")+ sc.next();

            sc.useDelimiter(",");
            sc.next();// skips the "
        }

        return s;
    }

    public String toString()
    {
        return name + ", " + address + ", " +website + ", " +type + ", " + muga;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public int compareTo(ParkStat o) {
        if (sortOrder == 1)
        {
            return this.type.compareTo(o.type);
        }
        return this.name.compareTo(o.name);
    }
}

import java.util.Scanner;

public class FireStationStat {

    private String name, station;
    private int year, fires, special, falseAlarm;

    public FireStationStat(String s)
    {
        Scanner sc = new Scanner(s);
        sc.useDelimiter(",");

        this.year = sc.nextInt(); // skip year
        this.name = sc.next();
        this.station = sc.next();
        this.fires = sc.nextInt();

    }


    public String toString()
    {
        return year + "\n" + name + " - " + station + "\n\n";
    }
}

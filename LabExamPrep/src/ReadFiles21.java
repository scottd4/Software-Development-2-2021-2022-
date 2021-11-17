import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFiles21 {

    private static ArrayList<FireStationStat> stat = new ArrayList<>();

    public static void readFile(String filename)
    {
        try
        {
            Scanner sc = new Scanner(new File(filename));

            if (sc.hasNextLine())
                sc.nextLine();//skips heading

            while (sc.hasNextLine())
            {
                stat.add(new FireStationStat(sc.nextLine()));
            }

            for(FireStationStat s : stat)
            {
                System.out.println(s);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("fire.txt");
    }
}

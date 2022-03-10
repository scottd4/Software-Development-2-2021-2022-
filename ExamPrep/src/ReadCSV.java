import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

    public static void main(String[] args) {

        ArrayList<CandidateStat> stats = new ArrayList<>();

        try {

            Scanner sc = new Scanner(new File("input.csv"));

            sc.nextLine();// ignore heading 1
            sc.nextLine();// ignore heading 2

            while (sc.hasNextLine())
            {
                try {
                    stats.add(new CandidateStat(sc.nextLine()));
                }
                catch (IllegalArgumentException ex)
                {
                    // dont add ones that have no contents
                }
            }

            for (CandidateStat stat : stats)
            {
                System.out.println(stat);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {
    public static void main(String[] args) {
        ArrayList<LocalEleStat> stats = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File("input.csv"));

            sc.nextLine();//skip first heading
            sc.nextLine();//skip second heading

            while (sc.hasNextLine())
            {
                try {
                    stats.add(new LocalEleStat(sc.nextLine()));
                }
                catch (IllegalArgumentException ex)
                {
                    // do nothing
                }
            }

            for(LocalEleStat stat : stats)
            {
                System.out.println(stat);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();;
        }

    }
}

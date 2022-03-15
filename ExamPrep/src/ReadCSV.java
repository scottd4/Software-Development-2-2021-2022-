import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

    private ArrayList<LocalEleStat> stats = new ArrayList<>();
    private String [] headings;
    public ReadCSV()
    {
         try{
            Scanner sc = new Scanner(new File("input.csv"));

            sc.nextLine();//skip first heading
            headings = sc.nextLine().split(",");//add second row to headings

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

        }
        catch (Exception e)
        {
            e.printStackTrace();;
        }
    }

    public ArrayList<LocalEleStat> getStats()
    {
        return stats;
    }
    public String [] getHeadings()
    {
        return headings;
    }

    public static void main(String[] args) {
        System.out.println(new ReadCSV().getStats());
    }
}

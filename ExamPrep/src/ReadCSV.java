import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

    private ArrayList<LocalEleStat> stats = new ArrayList<>();
    private String [] headings;

    public ReadCSV(File f)
    {
         try{

            Scanner sc = new Scanner(f);

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

    public void addStat(LocalEleStat s)
    {
        stats.add(s);
    }


}

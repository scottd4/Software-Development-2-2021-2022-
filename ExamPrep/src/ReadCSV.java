import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDateTime;
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

    public void removeStat(String s)
    {
        int i = -1;
        for(LocalEleStat stat : stats)
        {
            if(stat.getNo().equals(s))
            {
                i = stats.indexOf(stat);
                break;
            }
        }

        if(i != -1)
            stats.remove(i);

    }

    public void writeFile()
    {
        try {

            System.out.println("here");
            File f = new File("output"+ (int)((Math.random()*1000)) + ".csv");

            System.out.println(f.toString());
            f.createNewFile();
            PrintWriter pw = new PrintWriter(f);

            for(LocalEleStat stat : stats)
            {
                pw.println(stat.toCSV());
            }

            pw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}

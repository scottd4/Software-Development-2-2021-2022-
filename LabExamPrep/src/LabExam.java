import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabExam {

    private static ArrayList<FireStationStat> stats = new ArrayList<>();

    public static void readFile(String filename)
    {
        try {
            Scanner sc = new Scanner(new File(filename));

            if (sc.hasNextLine())
            {
                sc.nextLine();// skip the headings
                //sc.next();// skip the headings
            }

            while(sc.hasNextLine())
            {

               stats.add(new FireStationStat(sc.nextLine()));
            }


            for(FireStationStat s : stats)
            {
                System.out.println(s);
            }



        }
        catch(FileNotFoundException e)
        {
            System.out.println("the File is not found .....");
        }
        catch(Exception e)
        {
            System.out.println("an unknown exception happened ...");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        readFile("fire.txt");
    }
}

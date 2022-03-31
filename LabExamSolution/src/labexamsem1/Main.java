package labexamsem1;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readFile(String filename)
    {
        ArrayList<ParkStat> parks =  new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File(filename));

            if(sc.hasNextLine())
            {
                sc.nextLine(); //skip the headings
            }

            while (sc.hasNextLine())
            {
                parks.add(new ParkStat(sc.nextLine()));
            }

            //sort
            parks.sort(null);

            for (ParkStat p : parks)
            {
                System.out.println(p);
            }

            ParkStat.sortOrder = 1;

            parks.sort(null);

            System.out.println("\n\nSort order changed\n");

            printParkDetails(parks);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void printParkDetails(ArrayList<ParkStat> parks)
    {
        String type = null;
        int count = 0;

        for (ParkStat p : parks)
        {
            if (type == null)
            {
                type = p.getType();
                count++;
            }
            else if(type.equals(p.getType()))
            {
                count++;
            }
            else
            {
                System.out.println("Type: " + type + " count " + count );
                type = p.getType();
                count = 1;

            }
        }
        System.out.println("Type: " + type + " count " + count );


    }

    public static void main(String[] args) {
        readFile("labexam.txt");
    }
}

import java.io.File;
import java.util.Scanner;

public class FithWord {

    public static void main(String[] args) {
        File f = new File("text.txt");

        try {

            Scanner sc = new Scanner(f);
            String words = "";

            int counter = 0;
            while(sc.hasNext())
            {
                if (counter % 5 == 0)
                {
                    System.out.println(sc.next());
                }
                else
                    sc.next();
                counter ++;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

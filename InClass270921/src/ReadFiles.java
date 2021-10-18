import java.io.File;
import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner
                    (new File("test.txt"));


            String temp  = "dublin!";
            temp = temp.replace("!", "");

            System.out.println(temp);


            sc.useDelimiter(",");

            while(sc.hasNext())
            {
                System.out.println(sc.next());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

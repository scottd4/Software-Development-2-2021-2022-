import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTabbed {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("tabbed.txt"));
        sc.useDelimiter("\t");

        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }


    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args)
            throws FileNotFoundException {
        File f = new File("test.txt");

        Scanner sc = new Scanner(f);

        String s = "hello";



        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }

}

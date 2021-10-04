import java.io.File;
import java.util.Scanner;

public class FifthAnotherWay {

    public static void main(String[] args) {
        File f = new File("text.txt");

        try {

            Scanner sc = new Scanner(f);

            String words ="";

            while(sc.hasNextLine())
                words = words + sc.nextLine();

            String [] split = words.split(" ");

            for(int i = 0; i < split.length; i = i + 5)
            {
                System.out.println(split[i]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

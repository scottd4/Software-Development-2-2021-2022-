import java.io.File;
import java.util.Scanner;

public class FileReaderDemo {

    public static void main(String[] args) {
        File f = new File("text.txt");

        try {

            Scanner sc = new Scanner(f);
            String words = "";

            while (sc.hasNext()) {
                words = words + " " + sc.next();
            }

            // word cleaning
            words = words.replace(",","");
            words = words.replace("?","");
            words = words.replace("!","");
            words = words.replace("'","");
            words = words.replace(".","");

            System.out.println(words);


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

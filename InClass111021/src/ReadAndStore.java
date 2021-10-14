import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndStore {

    public static void main(String[] args) {
        int numPrint = 5;
        int numFiles = 5;


        File [] fa = new File[numFiles];
        PrintWriter [] pw = new PrintWriter[numFiles];
        try {
            for (int i = 0; i < numFiles; i++) {
                fa[i] = new File("file" + i + ".txt");
                pw[i] = new PrintWriter(fa[i]);
            }

            Scanner sc = new Scanner(new File("text.txt"));
            int counter = 0;

            while (sc.hasNext())
            {
                String word = sc.next();

                if (counter%numPrint == 0)
                {
                    System.out.println(word);
                }

                pw[counter%numFiles].println(word);

                counter++;
            }

            for(int i = 0; i < numFiles; i++)
            {
                pw[i].close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

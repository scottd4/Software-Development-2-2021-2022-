import java.io.File;
import java.util.Scanner;

public class FileSplitter {

    public static void processWords(String input, int numFiles)
    {
        String [] words = input.split(" ");

        File [] files = new File[numFiles];
        String [] fileContent = new String[numFiles];

        for(int i = 0; i < files.length; i++)
        {
            files[i] = new File("file" + i+ ".txt");
            fileContent[i] = "";
        }

        for(int i = 0; i < words.length; i++)
        {
            int mod = i % numFiles;

            fileContent[mod] = fileContent[mod] +" " + words[i];
        }

        for(String content : fileContent)
        {
            System.out.println(content);
            System.out.println("_______________________");
        }
    }

    public static void main(String[] args) {
        File f = new File("text.txt");

        try {
            Scanner sc = new Scanner(f);

            String words ="";

            while(sc.hasNextLine())
                words = words + sc.nextLine();

            processWords(words, 50);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

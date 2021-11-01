import java.io.File;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("For Loop");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }

        String [] sa = {"one", "two", "three"};
        System.out.println("For each Loop");

        for (String s : sa)
        {
            System.out.println(s);

        }

        System.out.println("While loop");

        int x = 10;
        while (x >= 0)
        {
            System.out.println(x);
            x--;
        }

        System.out.println("do While Loop");

        x= 20;

        do {
            System.out.println(x);
            x++;
        }while(x < 10);



        System.out.println("switch statement");

        int y = 25;

        switch (y) {
            case 10:
                System.out.println("value " + y);
                break;
            case 20:
                System.out.println("value " + y*y );
                break;
            default:
                System.out.println("value " + y*y*y );
                break;
        }

        try {
            Scanner sc = new Scanner(new File("Files/text.txt"));

            while (sc.hasNext())
            {
                System.out.println(sc.next());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}

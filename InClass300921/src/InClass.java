import java.util.Random;

public class InClass {

    public static String jumble(String s)
    {
        String returnString = s;

        do {
            //shuffle letters
        } while (!s.equals(returnString));

        return returnString;

    }

    public static void main(String[] args) {
        Random r = new Random();

        //r.setSeed(20);

        System.out.println(Math.abs((r.nextInt() % 9)) +1);
        System.out.println(Math.abs(r.nextInt() % 10));


    }
}

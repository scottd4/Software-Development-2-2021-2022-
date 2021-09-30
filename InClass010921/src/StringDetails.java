import java.util.Locale;
import java.util.Scanner;

public class StringDetails {

    public static void getVowels(String s)
    {
        int numVowels = 0;
        s =  s.toLowerCase();
        for(char c : s.toCharArray())
        {
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' )
            {
                numVowels++;
            }
        }

        System.out.println("num vowels is " + numVowels);
    }

    public static void getStringDetails(String s)
    {
        System.out.println("The word entered is " +s);

        System.out.println("the length is " + s.length());

        getVowels(s);

        System.out.println("the first letter is "
                + s.charAt(0));
        System.out.println("the last letter is "
                + s.charAt(s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNext())
        {
            getStringDetails(sc.next());
        }
    }
}

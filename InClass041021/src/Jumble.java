public class Jumble {

    public static String swap(String s, int i, int j)
    {
        char [] ca = s.toCharArray();

        char temp = ca[i];
        ca[i] = ca[j];
        ca[j] = temp;

        return new String(ca);

    }

    public static void Jumble(String s)
    {
        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(s.length()-1);

        String toRandomise = s.substring(1, s.length() -1);

        // youre operation here on toRandomise
        for(int i = 0; i < toRandomise.length()/ 2; i++)
        {
            toRandomise = swap(toRandomise, i, (toRandomise.length()-1)-i);
        }

        String rebuilt = firstLetter + toRandomise + lastLetter;

        System.out.println(rebuilt);
    }

    public static void main(String[] args) {
        ///Jumble("computer");

        String s= "hello' here is a string with special chars 123344!!!!???,,,,...";



        System.out.println(s);

    }
}

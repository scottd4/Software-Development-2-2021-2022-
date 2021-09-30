public class Jumble {
    public static void jumbleLetters(String word)
    {
        char [] c = word.toCharArray();
        for (int i = 1; i < c.length - 1; i++)
        {
            int random = (int)((Math.random()*(c.length-2))+1);
            System.out.println(random);
            swap(c, i, random);
        }

        for(char ch: c)
        {
            System.out.print(ch);
        }
    }

    public static void swap(char [] c, int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
     }

    public static void main(String[] args) {
        jumbleLetters("computer");
    }
}


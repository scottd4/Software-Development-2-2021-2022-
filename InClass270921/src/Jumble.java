public class Jumble {


    public static void swap(char [] c , int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void jumble(String s)
    {
        char [] c = s.toCharArray();

        for(int i = 1; i < c.length - 1; i++)
        {
           //System.out.println(c[i]);

            int random = (int)(Math.random()* (c.length -2))+ 1;

            if(random != i)
            {
                swap(c, i, random);
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        String word = "antidisestablishmentarianism";
        jumble(word);
    }

}

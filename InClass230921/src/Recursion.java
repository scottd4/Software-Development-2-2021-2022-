public class Recursion {

    public static double powers(int x, int y)
    {
        if(y == 0)
            return 1;
        else if (y < 0)
        {
            if (y == -1)
            {
                return (double) (1.0/x);
            }
            else
            {
                return (double)((1.0/x) * powers(x, y+1));
            }
        }
        else if (y == 1)
            return x;
        else
            return x * powers(x, y-1);
    }

    public static String reverse(String s)
    {
        if (s.length() <= 1)
            return s;
        else
            return "" + s.charAt(s.length()-1) +
                    reverse(s.substring(0, s.length()-1));
    }
    private boolean full = false;
    public String getBooleanValue()
    {
        return full ? "full" : "empty";
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello world"));

        System.out.println(powers(4,2));

        boolean full = false;

        String variable = full ? "full" : "empty";

        System.out.println(variable);
    }

}

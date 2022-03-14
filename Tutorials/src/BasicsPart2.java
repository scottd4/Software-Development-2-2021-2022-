public class BasicsPart2 {

    public BasicsPart2()
    {

    }

    public BasicsPart2(String s)
    {

    }

    public static int add(int i, int j)
    {
       return (int)add((double) i, (double)j);
    }
    public static double add(double i, double j)
    {
        return i+j;
    }

    public static void main(String[] args) {

        System.out.println(add(1.0,2));
    }
}

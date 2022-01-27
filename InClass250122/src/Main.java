public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.setDimes(20,20);
        System.out.println(r.getPerimiter());

        Areas d = new Rectangle(40,50);

        System.out.println(d);

        Shape s = new Rectangle(10,50);

        System.out.println(s.getPerimiter());

        // d can access getArea
        System.out.println(d.getArea());

        // but cannot access getPerimiter()
        //System.out.println(d.getPerimiter());

    }
}

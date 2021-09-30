public class Box {

    private final String boxName;
    private final int w;
    private final int h;
    private final int d;
    private boolean full = false;

    public Box()
    {
        boxName = "Cardboard";
        w = 1;
        h = 2;
        d = 3;
    }
    public Box(String boxName, int w, int h, int d, boolean full)
    {
        this.boxName = boxName;
        this.full = full;
        this.w = w;
        this.d = d;
        this.h = h;
    }

    public int getArea()
    {
        return w*h*d;
    }

    public String toString()
    {
        return "Box name = " + boxName + " box area is " + this.getArea() +
                " box status " + full;
    }

    public static void main(String[] args) {
        Box b = new Box("plastic", 10,10,10, false);

        System.out.println(b);
    }
}

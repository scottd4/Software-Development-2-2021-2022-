public class Rectangle implements Shape {

    private int length, width;

    public Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setDimes(int l, int w) {

        width = w;
        length = l;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public String toString()
    {
        return "im a rectangle width = " + width + " length = " +length;
    }

    @Override
    public double getPerimiter() {
        return 10;
    }
}

public class Box {

    private boolean full = false;
    private final String boxName;

    public Box()
    {
        boxName = "cardboard";
    }

    public void setFull(boolean full)
    {
        this.full= full;
    }

    public String getFull()
    {
        return full ? "Full" : "Empty";
    }

    public String toString()
    {
        return "Box type : " + this.boxName +
                "\nBox Status: "
                + this.getFull();
    }

    public static void main(String[] args) {

        Box b = new Box();
        b.setFull(true);
        System.out.println(b);

    }



}

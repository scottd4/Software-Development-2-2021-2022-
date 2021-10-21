public class Validation {

    private String name, address;
    private int age;

    public Validation(String name, String address, int age)
    {
        this.name = (String)validate(name);
    }

    public Object validate(Object o)
    {
        if(o.getClass() == Integer.class) {
            if ((int) o < 0)
                throw new IllegalArgumentException("cannot be less than 0");
        }
        if (o.getClass() == String.class)
        {
            String s = (String)o;
            if(s.length() == 0)
                throw new IllegalArgumentException("String cannot be null");
        }
        return o;
    }

    public static void main(String[] args) {
        Validation v = new Validation("dave", "dublin",20);
    }
}

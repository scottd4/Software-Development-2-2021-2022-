public class HashTable {

    private Bucket [] buckets;


    public HashTable(int size)
    {
        buckets = new Bucket[size];
    }

    public void add(String s)
    {
        System.out.println(s.hashCode());
        int i = s.hashCode() % buckets.length;

        if (buckets[i] == null) {

            buckets[i] = new Bucket(s);
        }
        else
        {
            Bucket iter = buckets[i];
            while(iter.next != null)
            {
                iter = iter.next;
            }

            iter.next = new Bucket(s);
        }
    }

    public String get(String s)
    {
        int i = s.hashCode() % buckets.length;

        return buckets[i].value;
    }

    public void print()
    {
        for(Bucket b : buckets)
        {
            if(b == null)
            {
                System.out.println("*");
            }
            else
            {
                Bucket iter = b;

                while(iter.next != null)
                {
                    System.out.print(iter.value+",");
                    iter = iter.next;
                }

                System.out.println(iter.value);
            }
        }
    }


    class Bucket
    {
        public String value;
        public Bucket next;

        public Bucket(String value)
        {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashTable t = new HashTable(3);

        t.add("hello");

        t.add("cat");

        t.add("fish");


        t.print();

        System.out.println("Expecting cat, got " + t.get("cat"));
    }
}

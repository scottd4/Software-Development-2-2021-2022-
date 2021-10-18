public class Person implements Comparable<Person>{

    private String fname, lname;
    private int age;

    public static int sortingMethod = 1;

    public Person(String fname, String lname, int age)
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String toString()
    {
        return "first name " + fname + ", " + lname + " --" + age;
    }

    public void setSortingMethod(int i)
    {
        sortingMethod = i;
    }

    @Override
    public int compareTo(Person o) {

        if (sortingMethod == 1)
        {
            if (this.fname.compareTo(o.fname) < 0)
            {
                return 1;
            }
        }
        else if (sortingMethod == 2)
        {
            if (this.lname.compareTo(o.lname) < 0)
            {
                return 1;
            }
        }
        else
        {
            if (this.age < o.age)
            {
                return 1;
            }
        }

        return 0;
    }

    public static void swap(Person [] a, int i, int j)
    {
        Person temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sortPeople(Person [] input)
    {
        for(int i = 0; i < input.length - 1; i++)
        {
            int leastIndex = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j].compareTo(input[leastIndex]) == 1)
                {
                    leastIndex = j;
                }

            }
            if (leastIndex != i) {
                swap(input, i, leastIndex);
            }
        }

        for(Person i : input)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Person p = new Person("bill", "jones", 42);
        Person q = new Person("jane", "ward", 22);
        Person r = new Person("adam", "smyth", 18);
        Person s = new Person("laura", "reilly", 62);

        Person [] pa = {p,q,r,s};

        p.setSortingMethod(2);

        sortPeople(pa);




    }
}

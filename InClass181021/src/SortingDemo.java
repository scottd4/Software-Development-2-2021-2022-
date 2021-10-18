public class SortingDemo {

    public static void sort(int [] input)
    {
        for(int i = 0; i < input.length - 1; i++)
        {
            int leastIndex = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j] < input[leastIndex])
                {
                    leastIndex = j;
                }

            }
            if (leastIndex != i) {
                swap(input, i, leastIndex);
            }
        }

        for(int i : input)
        {
            System.out.println(i);
        }
    }

    public static void sort(String [] input)
    {
        for(int i = 0; i < input.length - 1; i++)
        {
            int leastIndex = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j].compareTo(input[leastIndex]) > 0)
                {
                    leastIndex = j;
                }

            }
            if (leastIndex != i) {
                swap(input, i, leastIndex);
            }
        }

        for(String i : input)
        {
            System.out.println(i);
        }
    }
    public static void swap(String [] a, int i, int j)
    {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swap(int [] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String [] sa = {"athlone", "is", "great"};

        int [] ia = {7,12,1,6,5,4,0};

        sort(ia);

        sort(sa);
    }
}

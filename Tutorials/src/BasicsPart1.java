public class BasicsPart1 {

    public static void main(String[] args) {


        // Primitives
        // bolean b = true;
        Boolean b = new Boolean(true);

        // Strring s = "hello World";
        String s = new String("Hello World");

        // int i  = 10;
        Integer i = new Integer(10);

        i++;

        // Loops

        //while loop

        int count = 0;

        while(count < 10)
        {
            System.out.println("While" + count);
            count++;
        }

        count = 0;
        // do while

        do {
            System.out.println("do while " + count);
            count++;
        }while (count < 10);


        // for loops

        int [] a = new int[10];

        for (i = 0; i < a.length; i++)
        {
           a[i] = i;

        }

        // foreach

        for(int element : a)
        {
            System.out.println("foreach " + element);
        }

        //Continue Break

        for (i = 0; i < 10; i++)
        {
            for (int j = 0; j<10; j++)
            {
                //System.out.print("*");

                if (j == i )
                {
                    break;
                }
            }
            System.out.println();
        }

        for (i = 0; i < 10; i++)
        {
            if (i == 6)
                continue;

            for (int j = 0; j<10; j++)
            {
                // skip all cases of 4 in j (04,14,24,....)
                if (j == 4)
                {
                    continue;
                }
                System.out.print(i +""+  j + ", ") ;
            }
            System.out.println();
        }



        // Exceptions

        try{
            System.out.println(a[11]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array too small");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            //cleanup memory here
        }

    }
}

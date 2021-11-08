import java.util.concurrent.ExecutionException;

public class Tutorial {

    private String fname, lname;


    public Tutorial(String fname, String lname)  {
        try {
            this.fname = validate(fname);
            this.lname = validate(lname);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private String validate(String s) throws IllegalAccessException {
        if (s.length() == 0)
            throw new IllegalAccessException("String is null");

        return s;
    }


    public static void main(String[] args) throws IllegalAccessException {


        Tutorial t = new Tutorial("", "Scott");

        // for loop

        System.out.println("For Loop");

        int [] ia = {1,2,3,4,5,6,7};

        for (int i = 1; i < ia.length; i = i + 2)
        {
            System.out.println(ia[i]);
        }

        //foreach loop

        System.out.println("Foreach Loop");

        for (int i : ia)
        {
            System.out.println(i);
        }


        // while

        System.out.println("while");

        int counter = 10;

        while(counter > 0)
        {
            System.out.println(counter);


            counter--;
        }

        System.out.println("do while");

        counter = 1;
        do{
            System.out.println(counter);
            counter++;
        }while(counter <= 10);


        System.out.println("Before Switch" + counter);

        switch (counter)
        {
            case 21:
                System.out.println("its twenty");
                break;
            case 11:
                System.out.println("its ten");
                break;
            default:
                System.out.println("this default");

        }




    }
}

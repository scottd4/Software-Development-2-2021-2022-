import java.util.Scanner;

public class LightSwitch {

    static boolean working = true;
    static boolean status = false;

    public static void checkInput(String input)
    {
        if(status && input.equals("-"))
        {
            status = false;
            System.out.println("the light is off");
        }
        else if (!status && input.equals("+"))
        {
            status = true;
            System.out.println("the light is on");

            int random  = (int) (Math.random() * 20);
            //System.out.println(random);
            if (random > 10)
            {
                working =  false;
            }
        }
    }

    public static void main(String[] args) {
        int i = 0;

        System.out.println("please enter a valid input of + or -");

        while (working)
        {
           Scanner sc = new Scanner(System.in);
            if (sc.hasNext())
            {
                String input = sc.next();
                if(input.equals("+") || input.equals("-"))
                {
                    checkInput(input);
                }
                else
                {
                    System.out.println("please enter a valid input");
                }

            }

        }

        System.out.println("the bulb has blown");
    }
}

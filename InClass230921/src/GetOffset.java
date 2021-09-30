public class GetOffset {
    public static int findIndex(char [] ca, char c)
    {
        for(int i = 0; i < ca.length; i++)
        {
            if(ca[i] == c)
            {
                return i;
            }
        }

        return -1;
    }

    public String toString()
    {
        return "nothing";
    }
    public static int [] getOffset(char [] first, char [] second)
    {
        int [] returnValue = {-1,-1};


        for(int i = 0; i < first.length; i++)
        {
            int index = findIndex(second, first[i]);

            if (index != -1)
            {
                returnValue[0] = i;
                returnValue[1] = index;
                return returnValue;
            }
        }

        return returnValue;
    }

    public static void main(String[] args) {
        String s ="hello";
        String w = "world";

        int [] returned =
                getOffset(s.toCharArray(), w.toCharArray());

        System.out.println(returned[0]+", "+ returned[1]);
    }
}

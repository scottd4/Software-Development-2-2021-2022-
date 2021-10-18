public class SearchArray {

    public static int [] findIndex(char [][] ca, char c)
    {
        int [] returnValue =  {-1,-1};

        for(int i = 0; i < ca.length; i++)
        {
            int index = findIndex(ca[i], c);
            if(index != -1)
            {
                returnValue[0] = i;
                returnValue[1] = index;
                return returnValue;
            }
        }


        return returnValue;
    }
    public static int findIndex(char [] ca, char c)
    {
        for(int i = 0; i < ca.length; i++)
        {
            if(ca[i] == c)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        //char [] ca = "hello".toCharArray();

        char [][] ca2d = new char [10][10];

        ca2d[2] = "hello".toCharArray();
        ca2d[3] = "world".toCharArray();

        ca2d[4][2] = 'h';



        int [] returnedValue = findIndex(ca2d, 'h');
        //System.out.println(returnedValue[0] + ", " + returnedValue[1]);
        System.out.println(findIndex("road".toCharArray(), 'o'));
    }
}

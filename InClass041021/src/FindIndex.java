public class FindIndex {


    public static int [] findIndex(char[][]ca, char c)
    {
        int [] returnvalue = {-1,-1};

        for (int i = 0; i < ca.length; i++)
        {
            for (int j = 0; j < ca[i].length; j++)
            {
                if(ca[i][j] == c) {
                    returnvalue[0] = i;
                    returnvalue[1] = j;

                    return returnvalue;
                }
            }
        }


        return returnvalue;
    }

    public static void main(String[] args) {

        char [][] ca = new char[10][10];

        ca[3] = "hello".toCharArray();

        int [] returned = findIndex(ca, 'e');

        System.out.println(returned[0] + ", " +  returned[1]);
    }
}

public class SearchArray {

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

    public static int[] findIndex(char [][] ca, char c)
    {
        int []  returnInt = {-1,-1};

        for (int i = 0; i < ca.length; i++)
        {
            int rT = findIndex(ca[i], c);

            if(rT != -1)
            {
                returnInt[0] = i;
                returnInt[1] = rT;
                return returnInt;
            }

        }


        return returnInt;
    }



    public static void main(String[] args) {

        char [][] cArr = new char[5][5];

        cArr[2] = "hello".toCharArray();

        int [] rT = findIndex(cArr, 'l');

        System.out.println(rT[0]+","+rT[1]);




    }

}

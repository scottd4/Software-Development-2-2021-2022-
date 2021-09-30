public class ArrayDemos {



    public static void main(String[] args) {
        String s = ("hello world");
        char [] charArray = "Goodbye".toCharArray();


        char [][] char2dArray =  new char [5][5];

        char2dArray [2] = "hello".toCharArray();
        char2dArray [3] = "world".toCharArray();



       for(int i = 0; i < char2dArray.length; i++)
       {
           for (int j = 0; j < char2dArray[0].length; j++)
           {
               System.out.print(char2dArray[i][j]);
           }

           System.out.println();
       }


    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ActualSorting {

    public static void main(String[] args) {
        int arr [] = {64, 34, 25, 12, 22, 11, 90};

        Arrays.sort(arr);



        for(int i : arr)
        {
            System.out.println(i);
        }

        ArrayList<Integer> arrList =  new ArrayList<Integer>();

        for(int i : arr)
        {
            arrList.add(i);
        }

        arrList.sort(null);

        for(int i : arrList)
        {
            System.out.println(i);
        }

        Collections.sort(arrList);


    }
}

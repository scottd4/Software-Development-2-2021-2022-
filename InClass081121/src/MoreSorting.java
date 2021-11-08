public class MoreSorting {


    private static int count = 0;

    public static void bubbleSort(int [] arr)
    {
        for (int i =0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length -i -1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
    }


    public static void merge(int [] arr, int start, int mid, int end)
    {
        int size1 = mid - start +1;
        int size2 = end -mid;

        int leftSide[] = new int[size1];
        int rightSide[] = new int[size2];

        for (int i = 0; i < size1; i++)
        {
            leftSide[i] = arr[start + i];
        }
        for (int j = 0; j < size2; j++)
        {
            rightSide[j] = arr[mid + 1 + j];
        }

        int i = 0, j =0;

        int k = start;

        while (i < size1 && j < size2)
        {
            if (leftSide[i] <= rightSide[j])
            {
                arr[k] = leftSide[i];
                i++;
            }
            else {
                arr[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while(i < size1)
        {
            arr[k] = leftSide[i];
            i++;
            k++;

        }

        while (j < size2)
        {
            arr[k] = rightSide[j];
            j++;
            k++;
        }




    }

    public static void mergeSort(int [] arr, int l, int r)
    {
        if(l < r)
        {
            int m = (l+r)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    public static int binarySearch(int arr [], int start, int end, int value)
    {
        count++;

        if(end >= start)
        {
            int mid = start + (end - start)/2;


            if (arr[mid] == value)
            {
                return mid;
            }

            if (arr[mid] > value)
            {
                return binarySearch(arr, start, mid -1, value);
            }

            return binarySearch(arr, mid + 1, end, value);

        }

        return -1;
    }
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];

        int i  = (low -1);

        for (int j = low; j< high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;

                swap(arr, i, j);
            }
        }

        swap (arr, i+ 1, high);

        return i+1;
    }

    public static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi -1);
            quickSort(arr, pi + 1, high);
        }

    }

    public static void swap(int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int [] arr)
    {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {64, 34, 25, 12, 22, 11, 90};
        //bubbleSort(arr);
        //mergeSort(arr, 1, arr.length -2);

        quickSort(arr, 0, arr.length -1);

        int index = binarySearch(arr, 0, arr.length-1,1 );
        printArray(arr);
        System.out.println(index);

        System.out.println("the count is " + count);
    }
}

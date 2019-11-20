import java.util.Random;
import java.util.stream.IntStream;

class insertionSort {

    void insSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    static void randomize( int arr[], int n) {
        // Creating a object for Random class
        Random r = new Random();

        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {

            // Pick a random index from 0 to i
            int j = r.nextInt(i);

            // Swap arr[i] with the element at random index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Driver method
    public static void main(String args[])
    {
        //int arr[] = { 12, 11, 13, 5, 6, 10, 2, 100 };
        int[] arr = IntStream.range(0, 10001).filter(x -> x % 5 == 0).toArray();
        int n = arr.length;
        randomize (arr, n);

        System.out.print("Given Array is\n");
        printArray(arr);

        insertionSort ob = new insertionSort();
        long startTime = System.currentTimeMillis();
        ob.insSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        printArray(arr);
    }
}

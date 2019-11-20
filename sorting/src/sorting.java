/* used GeeksforGeeks for the start of the Algos */

import java.util.Random;
import java.util.stream.IntStream;

public class sorting {
    // insertion sorting
    // need to make all the functions return an int
    // of how many times they ran
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

    // beginning of quick sorting
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    // need to make all the functions return an int
    // of how many times they ran
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    // begin shell sort
    // need to make all the functions return an int
    // of how many times they ran
    public int shellSort(int arr[]){
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];

                    // put temp (the original a[i]) in its correct
                    // location
                    arr[j] = temp;
                }
            }
        }
        return 0;
    }

    // extra utility ~ print arrays ~ //
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // extra utility ~ randomize your array after it is made ~ //
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


    public static void main(String args[]) {

        int[] arr = IntStream.range(0, 10001).filter(x -> x % 5 == 0).toArray();
        int n = arr.length;
        randomize (arr, n);

        // Insertion Sort
        System.out.print("\nGiven Array to Insertion Sort is:\n");
        printArray(arr);
        insertionSort ob1 = new insertionSort();
        long startTime = System.currentTimeMillis();
        ob1.insSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorted Array after Insertion Sort:");
        printArray(arr);
        System.out.println("That took ~" + (endTime - startTime) + "~ milliseconds");
        System.out.println("\n");

        // Quick Sort
        int[] arr2 = IntStream.range(0, 10001).filter(x -> x % 5 == 0).toArray();
        randomize (arr2, n);
        System.out.print("Given Array to Quick Sort is:\n");
        printArray(arr2);
        quickSort ob2 = new quickSort();
        long start = System.currentTimeMillis();
        ob2.quickSort(arr2, 0, n-1);
        long end = System.currentTimeMillis();
        System.out.println("Sorted Array after Quick Sort:");
        printArray(arr);
        System.out.println("That took ~" + (end - start) + "~ milliseconds");
        System.out.println("\n");

        // Shell Sort
        int[] arr3 = IntStream.range(0, 10001).filter(x -> x % 5 == 0).toArray();
        randomize (arr3, n);
        System.out.print("Given Array to Shell Sort is:\n");
        printArray(arr3);
        shellSort ob3 = new shellSort();
        long s = System.currentTimeMillis();
        ob3.shellSort(arr3);
        long e = System.currentTimeMillis();
        System.out.println("Sorted Array after Shell Sort:");
        printArray(arr);
        System.out.println("That took ~" + (e - s) + "~ milliseconds");
        System.out.println("\n");

    }
}



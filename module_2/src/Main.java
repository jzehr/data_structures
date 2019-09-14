// last item in array = arr[arr.length -1]

/*
    pass by copy!!

    when we pass an array to a method it
    is the memory address of that array,
    thus, we have the ability to change that
    array inside the method, so be careful
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    // keep in mind that double trick!
    // that will be nasty sometimes
    public static double sum_avg(int[] arr) {
        double sum = 0;

        for(int i = 0; i < arr.length; i ++){
            sum += arr[i];
        }
        double avg = sum/arr.length;
        return avg;

    }

    // set a default assumption that the function is false
    public static boolean has_even(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 ==0){
                System.out.println("found an even number");
                return true;
            }
        }

        return false;
    }

    public static boolean all_even(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.println("sorry, not all even: FALSE");
                return false;
            }
        }
        System.out.println("yes, it is all even: TRUE");
        return true;
    }

    public static boolean has_adjacent(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            if(arr[i] == arr[i+1]){
                System.out.println("yes, it has adj: TRUE");
                return true;
            }

        }
        System.out.println("nope, it does not have adj: FALSE");
        return false;
    }

    public static void swap_ends(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

    }

    public static void factor_to_zero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0){
                arr[i] = 0;
            }

        }

    }

    public static void string_printer(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word.length());

        }
    }

    public static int sum_of_five(int[][] two_d){
        //System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < two_d.length; i++) {
            for (int j = 0; j < two_d[i].length; j++) {
                if(two_d[i][j] % 5 == 0){
                    sum += two_d[i][j];
                }
                //System.out.println(two_d[i][j]);

            }

        }
        return sum;
    }

    public static void main(String[] args) {
//        int[] arr = {-2, 0, 2, 3, 1, 1, 2};
//        for (int i = 1; i < arr.length -1; i++) {
//         if(arr[i] == arr[i - 1] + arr[i + 1]){
//             System.out.println(arr[i]);
//         }
//        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);



        int [][] two_d = {{1,2,5},{0,5,0}};
        int answer = sum_of_five(two_d);
        System.out.println(answer);

        /*
        String[] words = {"hello", "how are you"};
        string_printer(words);


        //String[] words = {"hello", "how are you"};
        int[] arr = {1,2,5,4,5};
        //swap_ends(arr);
        factor_to_zero(arr);
        System.out.println(Arrays.toString(arr));


        int[] arr = {2,2,2,2,2};
        double total = sum_avg(arr);
        System.out.println(total);


        boolean answer = has_even(arr);
        boolean all = all_even(arr);
        boolean has = has_adjacent(arr);

        // could also do a {1,2,3,4,5}
        // can create array of anything
        int[] arr = new int[5];

        arr[0] = 5;
        arr[3] = 10;
        System.out.println(Arrays.toString(arr));


        String[] srr = new String[4];
        srr[0] = "a";
        srr[1] = "b";
        srr[2] = "c";
        srr[3] = "d";

        for(int i = 0; i < srr.length; i++){
            System.out.println(srr[i]);
        }
 */

    }

}

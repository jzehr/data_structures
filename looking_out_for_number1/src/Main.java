/*
The end goal of this assignment is to write a program
that determines the distribution of initial digits in
a set of data

want: program that reads in number (n) and a list of numbers (nums)
and outputs the nth of 10 values: freq with which each digit 0-9 appears as the nth digit
of one of the input numbers

assume: values are non-negative or just use the abs value function
 */

import java.io.*;
import java.nio.channels.FileLockInterruptionException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static int count_digits(int num) {
        num = Math.abs(num);

        int x;
        int divider = 10;
        int count = 1;

        x = num;
        while (x >= divider) {
            x = x / divider;
            count += 1;
        }
        return count;
    }

    public static int nth_digit(int n, int num) {
        String temp_num = Integer.toString(num);
        int digit = 0;
        for (int i = 0; i < temp_num.length(); i++) {
            if (i == n) {
                digit = Character.getNumericValue(temp_num.charAt(i));
            }

        }
        return digit;
    }

    public static int nth_digit_back(int n, int num) {
        String temp_num = Integer.toString(num);
        int ans = 0;
        int count = 0;
        for (int i = temp_num.length() - 1; i >= 0; i--) {
            count += 1;
            if (count - 1 == n) {
                ans = Character.getNumericValue(temp_num.charAt(i));
            }

        }
        return ans;
    }

    public static void update_tally(int n, int num, int[] tally) {
        //System.out.println("tally before: " + Arrays.toString(tally));
        int ans = 0;
        String temp_num = Integer.toString(num);
        for (int i = 0; i < temp_num.length(); i++) {
            if(i == n){
                ans = Character.getNumericValue(temp_num.charAt(i));
                tally[ans] += 1;
            }

        }

        //System.out.println("tally after: " + Arrays.toString(tally));
    }

    public static void digit_tally(int n, int[] nums) {
        int[] tally = new int[10];

        for (int i = 0; i < nums.length; i++) {
            //String temp_num = Integer.toString(nums[i]);
            update_tally(n, nums[i], tally);
            //update_tally(temp_num);
        }
        int[] temp = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("The indices of the results: " + "\t" +Arrays.toString(temp));
        System.out.println("tally AFTER full tally update: " + Arrays.toString(tally));

    }

    public static void r_m_n(String filename, int n) throws IOException {

        Path path = Paths.get(filename);
        long lineCount = Files.lines(path).count();
        //System.out.println(lineCount);

        int line_count = (int)lineCount;
        System.out.println("total entries: " + line_count);

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        /*
        i think this is where other files are getting "stuck"
        something is going on with how each line is being interpreted
        whether as a string or if it is already an int.
         */
        String line;


        int[] data = new int[line_count];
        int count = 0;
        while((line = reader.readLine()) != null) {
            int final_line = 0;
            //System.out.println(line);
            String new_line = line.replaceAll("[^0-9]", "");
            System.out.println(new_line);
            if(new_line.equals("")){
                continue;
            }
            final_line = Integer.parseInt(new_line);
            //System.out.println(final_line);
            data[count] = final_line;
            count ++;

        }

        //System.out.println(Arrays.toString(data));

        digit_tally(n, data);

    }

        public static void main (String[]args) throws IOException {
//        int num = 234;
//        int n = 0;
//        int[] tally = new int[10];

            Scanner keyboard = new Scanner(System.in);
            System.out.println("file path to your file: ");
            //String filename = "grape_data.txt";
            String filename = keyboard.nextLine();

            System.out.println("n digit input: ");
            int nth_digit = keyboard.nextInt();

//        int answer_count = count_digits(num);
//        int answer_dback = nth_digit_back(n, num);
//        int answer_d = nth_digit(n, num);


//        System.out.println("num is: " + num + " this is the count: " + answer_count);
//        System.out.println("n is: " + n + " num is: " + num +" digit from right: " + answer_dback);
//        System.out.println("n is: " + n + " num is: " + num + " digit from left: " + answer_d);

            //update_tally(nth_digit, num,tally);

            r_m_n(filename, nth_digit);


        }
    }
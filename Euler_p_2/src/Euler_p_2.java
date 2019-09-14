/*
Jordan Zehr
9/1/2019
Data Structure
Euler 2
 */


public class Euler_p_2 {
    public static void main(String[] args) {
        System.out.println("Starting to calculate!");
        int sum = 0;
        int x = 1;
        int y = 2;

        // keep x under 4 million
        while( x <= 4000000){
            // Check to see if the term is even
            // then add it to sum if it is
            if (x % 2 == 0){
                sum += x;
            }
            // calculate next fib number
            int z = x + y;

            // set the new terms to add
            x = y;
            y = z;

        }

        System.out.println("your answer to Euler Problem 2 is: " + sum);

    }
}

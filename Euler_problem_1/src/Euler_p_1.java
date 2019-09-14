/*
Jordan Zehr
9/1/2019
Data Structure
Euler 1
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting to calculate!");

        // initialize sum
        int sum = 0;

        // calculate up to (but not including 1k)
        for(int i = 0; i < 1000; i++){
            // mult of 3
            if(i % 3 == 0){
                // add to sum
                sum += i;
            // mult of 5 and add
            } else if(i % 5 ==0){
                sum += i;
            }

        }

        System.out.println("your answer to Euler Problem 1 is: " + sum);
    }

}

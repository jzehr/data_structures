// to run ctrl + shift + r

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

/*
        // hello world
        System.out.println("Hello people");
        System.out.println("hello jordan");
*/

/*
        // example 1 car class
        Car mycar = new Car(10.7,
                "asdf#@",
                Color.BLUE, true);

        Car jcar = new Car(100,
                "this nut", Color.PINK, false);

        System.out.println("mycar plate = " + mycar.license_plate);
        System.out.println("jcar plate = " + jcar.license_plate);

        System.out.println("mycar color before = " + mycar.paint_color.toString());
        mycar.change_paint_color(Color.BLACK);
        System.out.println("mycar color after = " + mycar.paint_color.toString());
*/

/*
        // example 2 strings
        String user_input = "entertainment";
        String upper = user_input.toUpperCase();
        System.out.println(upper);

        char f_char = user_input.charAt(0);
        System.out.println(f_char);

        // this is an EXACT match
        System.out.println("contains: " + user_input.contains("enter"));
*/

/*
            // example 3 input from user
        Scanner sc = new Scanner(System.in);
        int user_num = sc.nextInt();
        System.out.println(user_num);

        String user_input = sc.next();
        String upper = user_input.toUpperCase();
        System.out.println(upper);

        char f_char = user_input.charAt(0);
        System.out.println(f_char);

        // this is an EXACT match
        System.out.println("contains: " + user_input.contains("enter"));
*/

/*
            // example 4 array
        int[] numbers = new int[5];
        numbers[0] = 31;
        numbers[1] = 32;
        numbers[2] = 33;
        numbers[3] = 34;
        numbers[4] = 35;

        int[] num2 = {300,3,13,4,5};

        String[] candy = {"twix", "other", "me too"};
        System.out.println("candy at index 0: " + candy[0]);

        candy[2] = "butters";
        System.out.println("candy at index 2: " + candy[2]);

        System.out.println("length: " + candy.length);

        // gets item at indexed location in array
        System.out.println(Array.get(candy, 2));

        // this will sort our old list of numbers
        Arrays.sort(num2);
        // we will now print it out
        System.out.println(Arrays.toString(num2));
*/

/*
            // example 5 arguments vs parameter
            // call by value -> original args of function are never modified

        Car mycar = new Car(10.7,
                "asdf#@",
                Color.BLUE, true);

        Car jcar = new Car(100,
                "this nut", Color.PINK, false);

        double my_car_speed = 50;
        my_car_speed = mycar.speed_up(my_car_speed);
        System.out.println(my_car_speed);
*/

/*
        // example 6 write your own class with at least 3 methods and 3 actions
        farm myfarm = new farm(3,
                "Milky Whey",
                Color.YELLOW, true);

        System.out.println("current number of tractors on the farm: " + myfarm.tractor_num);

        int tractor_increase;
        tractor_increase = myfarm.more_tractors(myfarm.tractor_num);
        System.out.println("after the increase! --> " + tractor_increase);


        myfarm.name_change(myfarm.farm_name);
        System.out.println("this is the shouting name!! " + myfarm.farm_name);
*/
/*
        // example 7 logic flow
        System.out.println("Enter an age:" );
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 0 && age <= 5){
            System.out.println("baby");
        } else if (age >= 6 && age <= 11){
            System.out.println("kid");
        } else if (age >= 12 && age <= 17) {
            System.out.println("teen");
        } else if (age >=18){
            System.out.println("adult");
        } else{
            System.out.println("invalid");
        }

        System.out.println("thanks for using!");
*/
/*
        // example 8 loops
        // while
        // do while
        // for loop

        // debugging with an IDE
        // set breakpoints in the IDE
*/

///*
        // actually do this! this will be cool
        // example 9 dice rolls



//*/

/*
        // example 10 encapsulation (data hiding)
    this would be when you have a sensitive value, set as "private"
    but you need to use it in your public functions. this style allows the user to
    work with the private information without ever seeing it directly, but the private variable can
    still interact with the public functions
    ** cannot directly access it from the Main() function **

*/
/*
        // example 11 inheritance
    use the word "extends"
    and "super" which will call a constructor for the class it is inheriting from

*/
/*
        // example 12 interfaces implements

*/
/*
        // example 13 lambda (have to use interface)
        Answerable phone = () ->  "hello";

*/
    }
}

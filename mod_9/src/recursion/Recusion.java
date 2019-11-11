package recursion;

public class Recusion {
    public static long factorial(int n){
        if(n <= 0){
            return 1;
        }
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static long facto(int n){
       if(n == 0 || n == 1){
           return 1;
       }else{
           return n * facto(n-1);
       }
    }

    public static int lenStr(String s){
        if(s.equals("")){
            return 0;
        }else{
            return 1 + lenStr(s.substring(1));
        }
    }

    public static void printChars(String s){
        if(s.equals("")){
            System.out.println("");
        }else{
            System.out.println(s.charAt(0));
            printChars(s.substring(1));
        }
    }

    public static int summation(int n){
        if(n == 0){
            return 0;
        }else{
            return n + summation(n -1);
        }
    }

    public static void main(String[] args) {
        System.out.println("factorial --> " + facto(6));
        System.out.println("len of string --> " + lenStr("hey"));
        printChars("hey");
        System.out.println("sum --> " + summation(4));
    }
}


/*
1. constant time relationship O(1)
2. linear time O(n)
3. Quadratic O(n^2)
*/

public class BigOClass {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //System.out.println(start);
        for (int i = 0; i < 100000; i++) {
            System.out.print("");
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

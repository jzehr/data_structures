public class Searching {

    // binary search
    /*
    base case:
     1. not in sub array
     2. is middle
    */

    public static <E extends Comparable<E>> int binsearch(E[] arr, E target){
        return binsearch(arr, target, 0, arr.length -1);
    }

    private static <E extends Comparable<E>> int binsearch(E[] arr, E target, int start, int end){
        if (end < start){
            return -1;
        }
        int middle = (start + end)/2;

        if (arr[middle].compareTo(target) == 0){
            return middle;
        }else if(target.compareTo(arr[middle]) < 0){
            return binsearch( arr, target, start, middle - 1);
        }else{
            return binsearch( arr, target,middle + 1, end);
        }
    }

    public static int linsearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        //System.out.println("td");
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*i;
        }
        System.out.println(binsearch(arr, 200));
    }
}

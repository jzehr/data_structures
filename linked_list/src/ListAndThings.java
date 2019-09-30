import java.util.List;

public class ListAndThings {
    /*
    lists:
        array lists
        linked lists
    Stack
    Queue
    Trees
        binary search tree
        binary heap
    Sets
    Maps
    Graphs
     */
    public static integer getMax(List<integer> list){
    //public static <Integer> int getMax(List<integer> list){
        integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
                return max;
            }

        }

        return max;
    }

//    public static String reverse(String word) {
//        String reversed = "";
//        for (int i = 0; i < word.length() ; i++) {
//            reversed += word.charAt(word.length() -1 - i);
//        }
//        return reversed;
//    }

    public static void main(String[] args) {
//        List list = new ArrayList();
//
//        list.add("thing");

        String temp = "cat";
        System.out.println(reverse(temp));
        //System.out.println(list);

        // array.length
        // string.length()
        //  collection --> size.()
        /*
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        System.out.println("\n end");
        */


    }
}

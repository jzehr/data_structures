import java.util.*;

public class Main {

    // uniqueness
    public static <E> boolean unique(List<E> list){
        //~ this was my way, I am going to keep it this way ~
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(j + 1 < list.size() && i != j){
                    if(list.get(i).equals(list.get(j))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
        // this is the fastest way
    /*  Set<E> set = new HashSet<>();
        for(E item : list){
            boolean couldAdd = set.add(item);
            if(couldAdd == false){
                return false;

            }
        }
        return true;
    }
     */

    // all multiples
    public static List<Integer> allMultiples(List<Integer> list, int inNum){
        List<Integer> newList = new ArrayList<>();
        for (Integer listInt : list) {
            if (listInt % inNum == 0) {
                newList.add(listInt);
            }
        }
        return newList;
    }

    // all strings of size
    public static List<String> allStringsOfSize(List<String> list, int inNum){
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if(temp.length() == inNum) {
                newList.add(temp);
                }

            }

        return newList;
    }

    // string to list of words
    public static List<String> stringToListOfWords(String word){
        List<String> newList = new ArrayList<>();
        String[] list = word.split("\\s");
        for (String s : list) {
            newList.add(s.replaceAll("[^a-zA-Z]", ""));
        }
        return newList;
    }

    // remove all instances
    public static <E> void removeAllInstances(List<E> list, E item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) {
                list.remove(i);
                removeAllInstances(list, item);
            }
        }
    }

    // timing
    public static <E> int howBig(ArrayList <E> list){
        return list.size();
    }

    public static <E> boolean in(ArrayList <E> list, E item){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 10000; j++) {
                System.out.print("");
            }
            if(list.get(i).equals(item)){
                return true;

            }

        }
        return false;
    }

    public static int sum(ArrayList<Integer> list){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static <E> boolean allUnique(ArrayList <E> list){

        for (int i = 0; i < list.size(); i++) {
            E firstItem = list.get(i); // O(1)
            for (int j = 0; j < list.size(); j++) { // n
                if(i == j){
                    continue;
                }

                E secondItem = list.get(j); // O(1)
                if(firstItem.equals(secondItem)){ // O(1)
                    return false;

                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // quadratic
        ArrayList<Integer> list_1 = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            list_1.add(i);
        }


        long start_1 = System.currentTimeMillis();
        System.out.println(allUnique(list_1));
        long end_1 = System.currentTimeMillis();
        System.out.println(end_1-start_1);


        /*
        //unique
        ArrayList<Integer> Unique1 = new ArrayList<>(Arrays.asList(0, 3, 5, 7, 7, 9));
        boolean out1 = unique(Unique1);

        ArrayList<String> Unique2 = new ArrayList<>(Arrays.asList("duck", "duck", "goose"));
        boolean out2 = unique(Unique2);

        System.out.println(Unique1 + " " + out1);
        System.out.println(Unique2 + " " + out2);

        //allMultiples
        ArrayList<Integer> Multiples = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30));
        ArrayList<Integer> answer = new ArrayList<>(allMultiples(Multiples, 15));
        System.out.println(answer);

        //allStringsOfSize
        ArrayList<String> SizeOf = new ArrayList<>(Arrays.asList("cat", "hat", "eggs", "ham"));
        ArrayList<String> SizeAnswer = new ArrayList<>(allStringsOfSize(SizeOf, 3));
        System.out.println(SizeAnswer);


        //stringToListOfWords
        String input = "How is the weather? Not too bad, Greg!";
        ArrayList<String> StringAnswer = new ArrayList<>(stringToListOfWords(input));
        System.out.println(StringAnswer);

        //removeAllInstances
        ArrayList<Integer> RemoveList = new ArrayList<>(Arrays.asList(1,23,4,5,3,3,3,4,8,9,3,10));
        removeAllInstances(RemoveList, 3);
        System.out.println(RemoveList);


        //size constant
        System.out.println(howBig(RemoveList));

        //size linear 1
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        //in(list, -13);
        long end = System.currentTimeMillis();

        System.out.println(end-start);

        //size linear 2
        ArrayList<Integer> list_1 = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            list_1.add(i);
        }


        long start_1 = System.currentTimeMillis();
        System.out.println(sum(list_1));
        long end_1 = System.currentTimeMillis();
        System.out.println(end_1-start_1);
        */

    }
}

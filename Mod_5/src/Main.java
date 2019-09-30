import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // uniqueness
    public static <E> boolean unique(List<E> list){
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

    public static void main(String[] args) {
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
    }
}

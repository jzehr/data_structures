package index;

import java.util.List;

public class IndexNode  {
    private int size;
    private index.IndexNode root;

    public IndexNode(){
        this.root = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean contains(index.IndexNode root, String word){
        return contains(this.root, word);
    }

    // The word for this entry
    String word;
    // The number of occurrences for this word

    int occurences;
    // A list of line numbers for this word.
    List<Integer> list;



    IndexNode left;
    IndexNode right;


    // Constructors
    // Constructor should take in a word and a line number
    // it should initialize the list and set occurrences to 1




    // Complete This
    // return the word, the number of occurrences, and the lines it appears on.
    // string must be one line

    public String toString(){
        StringBuilder sb = new StringBuilder();
        //preOrderTrav(root, 1, sb);
        return sb.toString();
    }

    private String toString(index.IndexNode root, String word){
        if(root == null){
            return "";
        }
        String output = "";
        output += toString(root.left);
        output += root.word + " ";
        output += toString(root.right);
        return output;
        return "";
    }



}

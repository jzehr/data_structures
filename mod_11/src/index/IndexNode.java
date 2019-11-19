package index;
import java.util.ArrayList;
import java.util.List;

public class IndexNode  {
    String word;
    int occurences;
    List<Integer> list;

    IndexNode left;
    IndexNode right;

    private IndexNode root;

    public IndexNode() {
        this.left = null;
        this.right=null;
        occurences=0;
    }

    public IndexNode(String word, int lineNumber) {
        this.word = word;
        list = new ArrayList<>();
        this.list.add(lineNumber);
        this.occurences++;
    }

    public String toString(){
        String listWord = this.word;
        listWord += "  " + this.occurences + "  " + list.toString();
        return listWord;
    }


}

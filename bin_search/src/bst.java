public class bst<E extends Comparable<E>>{
    private int size;
    private Node<E> root;

    public bst(){
        this.root = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean contains(E item){
        return contains(this.root, item);
    }

    private boolean contains(Node<E> root, E item){
        if(root == null){
            return false;
        }
        int comparison = item.compareTo(root.item);
        if(comparison == 0){
            return true;
        }else if(comparison < 0){
            return contains(root.left, item);
        }else{
            return contains(root.right, item);
        }
    }

    public void add(E item){
        this.root = add(this.root, item);
    }

    private Node<E> add(Node<E> root, E item){
        if(root == null){
            return new Node<>(item);
        }
        int comparison = item.compareTo(root.item);
        if(comparison == 0){
            return root;
        }
        if(comparison < 0){
            root.left = add(root.left, item);
            return root;
        }else{
            root.right = add(root.right, item);
            return root;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        preOrderTrav(root, 1, sb);
        return sb.toString();
    }

    private String toString(Node<E> root){
        if(root == null){
            return "";
        }
        String output = "";
        output += toString(root.left);
        output += root.item + " ";
        output += toString(root.right);
        return output;
        /*
        StringBuilder builder = new StringBuilder();
        builder.append(toString(root.left));
        builder.append(" ");
        builder.append(root.item);
        builder.append(" ");
        builder.append(toString(root.right));
        */



    }

    private static class Node<E>{
        private E item;
        private Node<E> left;
        private Node<E> right;
        public Node(E item){
            this.item = item;
        }

        public String toString(){
            return item.toString();
        }
    }

    private void preOrderTrav(Node<E> root, int depth, StringBuilder sb){
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        if(root == null){
            sb.append("null\n");
        }else{
            sb.append(root.toString());
            sb.append("\n");
            preOrderTrav(root.left, depth + 1, sb);
            preOrderTrav(root.right, depth + 1, sb);
        }
    }

    public static void main(String[] args) {
        bst<Integer> b = new bst<>();
        b.add(15);
        b.add(50);
        b.add(20);
        b.add(10);
        b.add(13);
        b.add(12);
        b.add(7);
        b.add(6);
        System.out.println(b);
    }

}

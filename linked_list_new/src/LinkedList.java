public class LinkedList<E> {

    // memory location on the right gets stored in the location on the left //
    private static class Node<E>{
        private E data;
        // next node in the list
        // next memory location
        private Node<E> next;

        public Node(E data){
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node<String> n1 = new Node<>("bread");
        Node<String> n2 = new Node<>("milk");
        Node<String> n3 = new Node<>("eggs");

        n1.next = n2;
        n2.next = n3;

        Node<String> current = n1;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}

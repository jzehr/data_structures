public class LinkedList<E> {
    private Node<E> head;

    private int size(Node<E> head){
        if(head == null)
            return 0;
        else{
            return 1 + size(head.next);
        }
    }

    public int size(){
        return size(head);
    }
}

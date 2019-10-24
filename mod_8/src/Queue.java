public class Queue<E> {
    private Node<E> front;
    private Node<E> back;

    public boolean isEmpty(){
        return front == null;
    }

    public E peek(){
        return front.item;
    }

    // removes from front
    public E poll(){
        E toReturn = front.item;
        if(front == back){
            front = null;
            back = null;
        } else {
            front = front.next;
        }
        return toReturn;
    }

    // adds to back
    public boolean offer(E item){
        Node<E> temp = new Node<>(item);
        if(this.isEmpty()){
            front = temp;
            back = temp;
        } else {
            back.next = temp;
            back = temp;
        }
        return true;
    }

    // person behind me is the next person in line
    private static class Node<E>{
        E item;
        Node<E> next;
        public Node(E item){
            this.item = item;
        }

    }

    // first in first out
    // we put in 0, 1, 2, ... and then pulled out 0, 1, 2, ...
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        for (int i = 0; i < 10; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}

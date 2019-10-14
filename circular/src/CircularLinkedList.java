import java.util.Iterator;
import java.util.Scanner;

public class CircularLinkedList<E> implements Iterable<E> {

	// Your variables
	Node<E> head;
	Node<E> tail;
	int size;  // BE SURE TO KEEP TRACK OF THE SIZE

	// implement this constructor
	public CircularLinkedList() {
		this.size = 0;
		head = null;
	}

	// I highly recommend using this helper method
	// Return Node<E> found at the specified index
	// be sure to handle out of bounds cases
	private Node<E> getNode(int index ) {
		Node<E> current = head;  //from video LinkedList - getNode
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}


	// attach a node to the end of the list
	public boolean add(E item) {
		this.add(size,item);
		return true;
	}


	// ADDING
	public void add(int index, E item){
		// out of bounds
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("~ INSERT non-helpful message ~");
		}

		Node<E> adding = new Node(item);

		// adding to empty list
		if(size == 0){
			this.head = adding;
			this.tail = adding;
		}
		// adding to [0]
		else if(index == 0){
			adding.next = head;
			head = adding;
			tail.next = head;
		}
		// adding to [-1]
		else if(index == size){
			tail.next = adding;
			tail = adding;
			tail.next = head;
		}
		// adding to [n]
		else{
			Node<E> before = getNode(index-1);
			adding.next = before.next;
			before.next = adding;
		}
		size++;
	}


	// REMOVING
	public E remove(int index) {
		// index out of bounds
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("~ INSERT non-helpful message ~");
		}

		E toReturn = null;

		// one item
		if(size == 1){
			toReturn = head.item;
			this.head = null;
			this.tail = null;
		}
		// remove item [0]
		else if(index == 0){
			toReturn = head.item;
			head = head.next;
			tail.next = head;
		}
		// remove item [-1]
		else if(index == size-1){
			Node<E> before = getNode(index -1);
			toReturn = tail.item;
			before.next = head;
			tail = before;
		}
		// remove [n]
		else{
			Node<E> before = getNode(index -1);
			toReturn = before.next.item;
			before.next = before.next.next;
		}
		size--;
		return toReturn;
	}

	// Turns your list into a string
	// Useful for debugging
	public String toString(){
		Node<E> current =  head;
		StringBuilder result = new StringBuilder();
		if(size == 0){
			return "";
		}
		if(size == 1) {
			return head.item.toString();

		}
		else{
			do{
				result.append(current.item);
				result.append(" ==> ");
				current = current.next;
			} while(current != head);
		}
		return result.toString();
	}


	public Iterator<E> iterator() {
		return new ListIterator<E>();
	}

	// provided code for different assignment
	// you should not have to change this
	// change at your own risk!
	// this class is not static because it needs the class it's inside of to survive!
	private class ListIterator<E> implements Iterator<E>{

		Node<E> nextItem;
		Node<E> prev;
		int index;

		@SuppressWarnings("unchecked")
		//Creates a new iterator that starts at the head of the list
		public ListIterator(){
			nextItem = (Node<E>) head;
			index = 0;
		}

		// returns true if there is a next node
		// this is always should return true if the list has something in it
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return size != 0;
		}

		// advances the iterator to the next item
		// handles wrapping around back to the head automatically for you
		public E next() {
			// TODO Auto-generated method stub
			prev =  nextItem;
			nextItem = nextItem.next;
			index =  (index + 1) % size;
			return prev.item;

		}

		// removed the last node was visted by the .next() call 
		// for example if we had just created a iterator
		// the following calls would remove the item at index 1 (the second person in the ring)
		// next() next() remove()
		public void remove() {
			int target;
			if(nextItem == head) {
				target = size - 1;
			} else{
				target = index - 1;
				index--;
			}
			CircularLinkedList.this.remove(target); //calls the above class
		}

	}

	// It's easiest if you keep it a singly linked list
	// SO DON'T CHANGE IT UNLESS YOU WANT TO MAKE IT HARDER
	private static class Node<E>{
		E item;
		Node<E> next;

		public Node(E item) {
			this.item = item;
		}

	}

	public static void main(String[] args){

		Scanner scanIn = new Scanner(System.in);

		System.out.println("Enter an integer of how many individuals would you like to purge: ");
		int purge = scanIn.nextInt();

		System.out.println("Enter an integer pattern in which to perform the purging: ");
		int pattern = scanIn.nextInt();

		CircularLinkedList cll = new CircularLinkedList();
		for (int i = 1; i <= purge; i++) {
			cll.add(i);
		}


		System.out.println("Here are our people...");
		System.out.println(cll);
		System.out.println("\n");
		System.out.println("The purging will now begin");


		Iterator it = cll.iterator();
		while (it.hasNext()){
			for (int i = 0; i < pattern; i++) {
				it.next();
			}
			it.remove();
			System.out.println(cll);
		}

		System.out.println("Purging has been complete");
		System.out.println("The remaining individual above will have to live with these consequences... ");
		System.out.println("Our actions will only be judged in the eyes of the Lord...");
	}
}
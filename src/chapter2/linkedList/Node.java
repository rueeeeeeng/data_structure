package chapter2.linkedList;

public class Node<E> {
	private E item; //항목 저장
	private Node<E> next; //Node 레퍼런스를 저장
	
	public Node(E newItem, Node<E> node) {
		super();
		this.item = newItem;
		this.next = node;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E newItem) {
		this.item = newItem;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> newNext) {
		this.next = newNext;
	}
	
	public boolean isEmpty() {
	    return this.next==null;
	}
}

package chapter2.linkedList;

//이중연결리스트의 노드를 위한 클래스
public class DNode<E> {
	private E item;
	private DNode previous;
	private DNode next;

	// item - previous - next
	public DNode(E newItem, DNode p, DNode q) { // 노드 생성자
		this.item = newItem;
		this.previous = p;
		this.next = q;
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public DNode getPrevious() {
		return previous;
	}

	public void setPrevious(DNode previous) {
		this.previous = previous;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

}

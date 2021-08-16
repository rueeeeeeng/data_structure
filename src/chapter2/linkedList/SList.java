package chapter2.linkedList;

import java.util.NoSuchElementException;

//단순연결리스트(Singly Linked List)
public class SList<E> {
	protected Node head; //연결리스트의 첫 노드 가리킴
	private int size;
	public SList() {//생성자
		head = null;
		size = 0;
	}
	//탐색, 삽입, 삭제 연산을 위한 메소드 선언
	
	/**
	 * 탐색 메소드. 인자로 주어지는 target을 찾을 때까지 연결리스트의 노드들을 첫 노드부터 탐색
	 * @param target
	 * @return 탐색 실패시 -1 리턴
	 */
	public int search(E target) { //target을 탐색
		Node p = head;
		for (int i = 0; i < size; i++) {
			if(target == p.getItem()) return i;
			p = p.getNext();
		}
		return -1; //탐색을 실패한 경우 -1리턴
		
	}
	
	public void insertFront(E newItem) {//연결리스트 맨 앞에 새 노드 삽입
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p) { //노드 p 바로 다음에 새 노드 삽입
		p.setNext(new Node(newItem,p.getNext()));
		size++;
	}
	
	public void deleteFront() { //리스트의 첫 노드 삭제
		if(head.isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p) { //p가 가리키는 노드의 다음 노드를 삭제
		if(p==null) throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

	public void printList() {
    Node temp = head;
    while(temp != null) {
        System.out.print(temp.getItem()+"\t");
        temp = temp.getNext();
    }
    System.out.println();
}

}

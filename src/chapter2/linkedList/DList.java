package chapter2.linkedList;

import java.util.NoSuchElementException;

public class DList<E> {
	protected DNode head, tail;
	protected int size;

	public DList() {
		// item, previous, next
		head = new DNode(null, null, null); // 연결리스트의 첫 노드를 가리키는 레퍼런스 저장
		tail = new DNode(null, head, null); // 연결리스트의 마지막 노드를 가리키는 레퍼런스 저장, tail의 이전노드를 head로 만듦

		head.setNext(tail);
		size = 0; // 연결리스트의 노드 수
	}

	// 삽입, 삭제 연산을 위한 메소드 선언
	public void insertBefore(DNode p, E newItem) { // p가 가리키는 노드 앞에 삽입
		DNode t = p.getPrevious();
		DNode newNode = new DNode<E>(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}

	public void insertAfter(DNode p, E newItem) {//p가 가리키는 노드 뒤에 삽입
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
	
	public void delete(DNode x) { //x가 가리키는 노드 삭제
		if(x==null) throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
}

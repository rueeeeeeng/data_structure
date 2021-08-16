package chapter2.linkedList;

import java.util.NoSuchElementException;

public class CList<E> {
	private Node last; // 리스트의 마지막 노드(항목)을 가리킨다.
	private int size; // 리스트의 항목(노드) 수

	public CList() { // 리스트 생성자
		last = null; // 마지막 노드를 가리킴
		size = 0;
	}

	// 삽입, 삭제 연산을 위한 메소드 선언

	public void insert(E newItem) { // last가 가리키는 노드의 다음에 새 노드 삽입
		Node newNode = new Node(newItem, null);
		if (last == null) {
			newNode.setNext(newNode);
			last = newNode;
		} else {
			newNode.setNext(last.getNext()); // newNode의 다음 노드가 last가 가리키는 노드의 다음 노드가 되도록
			last.setNext(newNode); // last가 가리키는 노드의 다음 노드가 newNode가 되도록
		}
		size++;
	}

	public Node delete() {
		if (last.isEmpty())
			throw new NoSuchElementException();
		Node x = last.getNext();
		if (x == last)
			last = null;
		else {
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x;
	}
}

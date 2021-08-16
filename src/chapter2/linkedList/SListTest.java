package chapter2.linkedList;

public class SListTest {
	public static void main(String[] args) {
		SList fruits = new SList();
		Node p = new Node(fruits, null);
		
		fruits.insertFront("cherry"); // "pear" head 앞쪽에 추가
		fruits.printList();

		fruits.insertFront("pear"); // "pear" head 앞쪽에 추가
		fruits.printList();

		fruits.insertAfter("grape",p.getNext());
		fruits.printList();


	}
}

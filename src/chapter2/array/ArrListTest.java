package chapter2.array;

public class ArrListTest {
	public static void main(String[] args) {
		ArrList<String> strArr = new ArrList<>();
		strArr.insertLast("A");
		strArr.insertLast("B");
		strArr.insertLast("C");
		strArr.insert("X", 1);
		
		ArrList<Integer> intArr = new ArrList<>();
		System.out.println(strArr);
	}
}

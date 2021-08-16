package chapter2.array;

public class ArrListTest {
	public static void main(String[] args) {
		ArrList<String> strArr = new ArrList<>();
		strArr.insertLast("apple");
		printArr(strArr);
		strArr.insertLast("orange");
		printArr(strArr);
		strArr.insertLast("cherry");
		printArr(strArr);
		strArr.insert("pear", 3);
		printArr(strArr);
		strArr.insert("grape", 1);
		printArr(strArr);
		strArr.insert("lemon", 4);
		printArr(strArr);
		strArr.insertLast("kiwi");
		printArr(strArr);
		strArr.delete(4);
		printArr(strArr);
		strArr.delete(0);
		printArr(strArr);
		strArr.delete(0);
		printArr(strArr);
		strArr.delete(3);
		printArr(strArr);
		strArr.delete(0);
		printArr(strArr);
		printIndex(strArr, 1);
	}
	
	public static void printArr(ArrList arr) {
		for (int i = 0; i < arr.getArr().length; i++) {
			System.out.print(arr.peek(i) + "\t");
		}
		System.out.println("");
	}
	
	public static void printIndex(ArrList arr, int index) {
		if(arr.peek(index-1)==null)
			System.out.println(index+"번째 인덱스 값은 존재하지 않습니다.");
		else
			System.out.println(index+"번째 항목은 "+arr.peek(index-1)+"이다.");
	}
}
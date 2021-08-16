package chapter2.array;

import java.util.NoSuchElementException;

public class ArrList<E> { // 요소 타입
	private E arr[]; // 타입을 얼마든지 바꿀 수 있도록 제네릭 E로 설정, 배열(리스트) 선언
	private int size; // 배열(리스트) 크기
	// 생성자 초기화

	public ArrList() {
		super();
		this.arr = (E[]) new Object[1]; // 배열 E타입으로 캐스팅 해줘야함
		this.size = size;
	}

	/**
	 * index에 해당하는 원소값 반환
	 * 
	 * @param index
	 * @return
	 */
	public E peek(int index) {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		return arr[index];
	}

	/*
	 * 배열의 마지막 위치에 새로운 값 추가
	 * 
	 * @param item 추가할 아이템
	 */
	public void insertLast(E item) {
		if (size == arr.length) {
			resize(arr.length * 2);
		}
		arr[size++] = item;
	}

	private void resize(int size) {
		Object[] temp = new Object[size]; // 2배 크기의 배열
		for (int i = 0; i < this.size; i++) {
			temp[i] = arr[i];
		}
		arr = (E[]) temp;
	}

	/*
	 * 배열 인덱스 위치에 새로운 항목 추가하기<br> 옮기기 전에 미리 내용을 뒷쪽으로 내용을 옮겨야 함
	 * 
	 * @param item 추가할 항목
	 * 
	 * @param index 추가할 위치
	 */
	public void insert(E item, int index) {
		if (size == arr.length) {
			resize(arr.length * 2);
		}
		for (int i = size - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = item;
		size++;
	}

	public void insertFirst(E item) {
		if (size == arr.length) {
			resize(arr.length * 2);
		}
		for (int i = 0; i < size; i++) {
			arr[i + 1] = arr[i];
		}
		arr[0] = item;
		size++;
	}

	/*
	 * 배열 삭제 순서 1.앞으로 이동 2.크기 줄이기
	 */
	public void delete(int index) {
		if (size == 0)
			throw new NoSuchElementException();
		for (int i = index; i < size; i++) {
			arr[index] = arr[index + 1];
		}
		size--;
	}
}
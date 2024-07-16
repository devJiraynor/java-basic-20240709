package chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Package2 {

	public static void main(String[] args) {
		
		// Collection Framework : Java에서 데이터 구조에 대한 표준화된 기법을 제공
		
		// List : 데이터를 저장할 때 중복을 허용하고 순서가 존재하는 데이터 구조
		// Collection Framework에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정, 참조형 데이터 타입만 지정 가능
		List<Integer> list;
		
		// ArrayList 구현 클래스 : 인덱스를 이용한 검색이 빠름
		list = new ArrayList<>();
		// LinkedList 구현 클래스 : 추가, 삭제가 빠름
		list = new LinkedList<>();
		
		// add() : List에 요소 추가
		// 추가할 요소는 제너릭으로 지정한 데이터 타입의 요소이어야 함
		list.add(99);
		// list.add("99");
		System.out.println(list);
		
		list.add(100);
		System.out.println(list);
		
		// get() : List의 특정 인덱스 값을 가져옴
		// List의 인덱스 범위를 초과하지 않도록 주의
		// 기본형 데이터 타입 변수로 반환값을 받을 땐 null이 올 수 있음을 주의
		int number = list.get(0);
		System.out.println(number);
		
		// set() : List의 특정 인덱스 요소를 변경
		// List 인덱스 범위를 벗어나는 인덱스를 지정할 수 없음
		list.set(1, -100);
		System.out.println(list);
		
		// remove() : List의 특정 인덱스 요소를 제거
		list.remove(0);
		System.out.println(list);
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("apple");
		System.out.println(stringList);
		
		stringList.remove("apple");
		System.out.println(stringList);
		
		// size() : List의 크기를 반환
		System.out.println(list.size());
		
		// Set : 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않는 데이터 구조 (집합)
		Set<String> set;
		
		// HashSet 구현 클래스 : 검색이 빠름
		set = new HashSet<>();
		// TreeSet 구현 클래스 : 요소를 정렬해서 추가
		set = new TreeSet<>();
		
		// add() : Set에 요소를 추가함 만약 동일한 요소가 존재한다면 추가하지 않음
		set.add("apple");
		System.out.println(set);
		set.add("banana");
		System.out.println(set);
		set.add("apple");
		System.out.println(set);
		
	}

}










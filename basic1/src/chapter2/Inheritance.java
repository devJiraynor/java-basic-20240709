package chapter2;

import java.util.Arrays;

// 상속 : 객체지향 프로그래밍 특성 중 하나
// 원래 존재하던 클래스를 '확장'하여 재사용할 수 있도록 하는 것
// 코드 중복을 제거하고 확장성을 높일 수 있음
// extends 키워드를 사용하여 확장

// class SubClass extends SuperClass { ... }
class Developer {
	String name;
	int age;
	String[] skills;
	
	Developer(String name, int age, String[] skills) {
		this.name = name;
		this.age = age;
		this.skills = skills;
	}
	
	void sayHello() {
		System.out.println(name + "가 인사를 합니다.");
	}
	void develop() {
		System.out.println(name + "가 " + Arrays.toString(skills) + "로 개발을 합니다.");
	}
}

class SalesMan {
	String name;
	int age;
	int sales;
	
	SalesMan(String name, int age, int sales) {
		this.name = name;
		this.age = age;
		this.sales = sales;
	}
	
	void sayHello() {
		System.out.println(name + "가 인사를 합니다.");
	}
	void sale() {
		System.out.println(name + "가 " + sales + "만큼의 매출을 했습니다.");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
	}

}




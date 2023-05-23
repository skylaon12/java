package com.skylaon.c.cat;

public class Cat {

	////멤버변수들
	
	// 자바의 변수
	
	// 자바는 반드시 변수 종류(타입)을 적어야함. 안하면 에러.
	
	// 크게 참조형, 기본형 둘로 나눔
	
	// 1. 참조형 대표 예. String.
	
	String name;	// 문자열 변수는 클래스 String 형으로 지정해야함.
	
	// 우리가 만든 클래스도 참조형임
	
//	Dog duri; // 클래스를 미리 안 만들어두면 에러라서 주석쳤음.
	
	
	// 2. 기본(원시) 변수 타입들. 소문자로 씀. 
	
	int age;		// 소문자로 시작되는 형들로 숫자형 변수는 이렇게
	long id;		// 숫자형 변수인데 int 보다 많이 큰 수를 담을 수 있음
	float inch = 3.5f;	// 숫자는 숫자인데 실수(쩜 몇 하는 수들) 변수. 자료 값에 f 붙임 주의.
	double pi = 3.141592d; // 숫자는 숫자인데 실수(쩜 몇 하는 수들) 변수. 더 큰 수 담을 수 있음. 자료 값에 d 붙임 주의. 
	boolean isMine = false;	// 자바도 불린형 있음. 똑같음. 단 종류가 명시되야 함. 
	
	////멤버함수들
	void info() {
		String s = "고양이 이름은 " + name + "이고 나이는 " + age + " 살 이예용";
		System.out.println(s);
	}
}
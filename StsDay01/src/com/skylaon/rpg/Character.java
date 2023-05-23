package com.skylaon.rpg;

public class Character {
	//변수모음을 자바에서는 멤버 변수. 필드. 라고 부름
	String name;
	int hp;
	int attack;
	
	//생성자 함수라고 함. 객체가 태어날 때 이 함수가 실행 됨.
	Character(String x, int y, int z){
		name = x;
		hp = y;
		attack = z;
		System.out.println(this.name+"이(가) 태어남");
	}
	
	//함수모음을 자바에서는 멤버 함수 라고 부름
	//선언법
	
	//void 뜻은 return 이 없는 함수라는 뜻.
	//리턴 없는 일반 함수 선언하려면 void 키워드를 붙여야 함.
	void info() {
		System.out.println("이름:"+this.name+"["+this.hp+"]"
				+" 공격력:"+this.attack);
	}
	
	
}

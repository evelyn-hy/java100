// 1) 클래스는 왜 나왔을까?
// 클래스 없이도 객체의 특징(속성) 들은 변수로 정의할 수 있을 것이고 동작은 함수로 정의할 수 있을 것이다.
// 그러나 프로그램의 규모가 커지고 여러사람의 협업을 하는 과정에서 좀 더 체계적이고 분업화된 시스템으로 개발하고 활장해나갈 필요성이 있다.
// 그런 일련의 과정에서 OOP 문법을 지원하고 있고 하나의 언어로 OOP 문법을 공부하면 다른 언어에서도 거의 동일하다.
// 즉 자바언어로 OOP를 배운사람은 Python php 들을 공부할 때 거의 거저먹기 수준이 된다,
// 다만, 프로그래밍 언어마다 OOP를 구현하는 방법은 제각각 틀리기 떄문에 이런 부분을 공부하는 시간은 필요하다.

//2) 클래스 만들기
// 객체의 특징 > 속성(attribute)
// 객체의 동작 > 메서드(method)


class FarmMachine {
	
	// [1] 속성(특징)
	int price;         //가격
	int year;          //연식
	String color;      //색상
	
	
	// [2] 동작/기능/행동(method) > 농기계 마다 동작이 다양할 것이므로 처음에는 공통적인 동작을ㄹ 생각해본다.
	
	void move() {                                                //반환되는 타입이(int,String 등등) 있다면 쓰고 없을 때는 void를 사용한다.
		System.out.println("Farm-machine is moving");              //현재는 move() 매소드를 호출만 하기 때문에 반환되는 값이 없어서 void 사용
	}
	void dig() {
		System.out.println("Farm-machine is digging");
	}
	void grind() {
		System.out.println("Farm-machine is grinding");
	}
	
}


public class PracOop2{
	public static void main (String[] args) {
		                                                        // new를 이용하여 객체를 만들고 > new.클래스명() > 변수를 설정하여 new가 반환하는 주소값을 받게한다.
    // [1] 객체 생성                                               // 즉 변수 fm은 객체의 주소값을 갖게된다. *객체는 참조형 타입이다*
	FarmMachine fm = new FarmMachine();                         //new 키워드는 객체를 메모리 공간 상에 생성하는 것으로 끝나는 것이 아니라
	System.out.println(fm);                                     //생성된 객체의 주소값을 (변수 fm에)반환해주는 역할까지 한다.
	  
	// [2] 생성된 객체에 속성 값 입력하기
	
	fm.price = 1000000;                                           
	fm.year = 2020;
	fm.color = "red";
	
	// [3]속성 값 출력
	String fm_price = String.format("%,d",fm.price);                //1000단위마다 콤마를 프린트 할 때 사용된다.(***)
	System.out.println(fm_price);                                              
	
	System.out.println(String.format("%,d",fm.price));             //이렇게 한 번에 쓸 수도 있다.
	
	System.out.println(fm.price);
	System.out.println(fm.year);
	System.out.println(fm.color);
	
	//[4] 동작 수행하기
	fm.move();
	fm.dig();
	fm.grind();
	
		
		
		
		
	}
}
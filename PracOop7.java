



class People{
	
	//[1]속성 (Attribute)
	int age;
	String name;
	
	//[2] 생성자(Constructor)                                   //객체가 생성될때 자동으로 호출된다.
	People(){}                                               //받는 인자값이 없는 생성자
	People(int age, String name){                            //받는 인자값이 있는 생성자   > 인자값은 받을수도 안받을수도 있다.반환되는 값이 없다.
		                                                     //생성자가 여러개 일떄 주문서에 따라 생성자가 호출된다.
		                                                      //이 개념이 오버로딩이 가능하다는 것이다. 여러개 생성자를 만들어 놓는것이 가능하다는 뜻이다
		this.age=age;                       
		this.name= name;                                      //여기서 this는 생성된 객체 자기 자신을 의미한다. this=p1,p2,p3
		
	}  

	//[3] 메서드 (Method)

	void PrintPerson() {
		System.out.println("나이 : " + age + " 이름 : " + name );
	}



}


public class PracOop7 {
	public static void main(String[] args) {
		
		
	//[1] 객체 생성
		
		People p1 = new People(20,"이순신");                             //new가 Person(20,"이순신")의 의 주소를 p1에 반환한다.
		
		p1.PrintPerson();                                              // 나이와 이름을 모두 출력할 수 있다. p1이 PrintPerson() 을 호출
		//System.out.println(p1);  //주소값
		//System.out.println(p1.age); //나이
		                   //  .name //이
		People p2 = new People (30,"홍길동");
		p2.PrintPerson();
		
		People p3 =  new People (40,"을지문덕");
		p3.PrintPerson();
		
		
			
	
		}
		
	}

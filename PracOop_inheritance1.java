

class Human{                                   //Person이 부모클래스, Hero,Villain 이 자식클래스 
    
	//Field(속성)                                //Hero,Villain 도 사람이기 때문에 공통의 속성이나 동작을 가지고 있으므로 공통되는 것은 부모 클래스로부터 상속받고
    int gender;                                 //Hero는Hero에 필요한 새로운 값을 추가하고 Villain은 Villain이 필요한 새로운 값을 추가해서 사용하면 된다.

    int power;
    
    //Constructor
    Human(){
    	this.gender=1; //1:남자 2:여자
    	this.power=100; //기본파워
    	
    };
    
    //Method
   void walk() {
	   System.out.println("걸어가고 있어요~");
	   
   }
}                                            
class Hero extends Human{                               //부모 클래스로 부터 상송받을 것이라는 extends Human을 써줘야한다.
	
	//Field
	String name;
	int age;
	
	//Constructor
	Hero(String name, int age){
	    //super();            실제로 써줘도되지만 생략되어있을때도있다. 뜻은 부모클래스의 *생성자*룰 호출해주세요.    super=부모클래스
		this.name=name;
		this.age=age;
		
	}
	
	//Method
	
	void walk() {                                                     //만약 walk 메소드를 주석처리해도 부모 클래스에서 상속받은 walk 가 출력된다.
		System.out.println("2배로 빨리 걸어가고 있어요~"); }               //부모로 부터 물려받은 것을 재정의해서 쓰는 것을 *오버라이드*라고 한다. 상속받은 것을
		                                                          //그냥 그대로 사용하고자 하면 아무것도 쓰지 않으면 된다.
    void eat() {
    	System.out.println("밥먹고 있어요~"); }
    
    void displayPerson() {
    	System.out.println("이름 : "+ name + " 나이 : " +age +" 성별 : " + gender + " 파워 : " + power);
    }	
   
	
                                                              
}                                     

class Villain{}


public class PracOop_inheritance1{
	public static void main(String[] args) {
		
		//[1] 객체 생성
		
		Human p1 =new Human();
		p1.walk();                //Human 클래스에 있는 메소드만 이용가능.
		//p1.eat();  > error
 
		//[2] 상속을 통한 슈퍼맨 객체 생성
	   
		Hero h1 = new Hero("슈퍼맨",20);                                //객체 h1을 생성하면 자식클래스 Hero에 생성자에 가서 name,age가 셋팅이 되는데 그보다 먼저 
	    System.out.println(h1.name);                                    //그 위에 부모 클래스에 가서 상속을 받고 내려와서 셋팅이 된다. 
	    System.out.println(h1.gender);     //부모클래스 필드(변수)        //Hero(String name, int age) 와 this.name=name; this.age=age; 사이에
	    System.out.println(h1.power);      //부모클래스 필드(변수)        //부모클래스 생성자를 호출하는 부분이 생략이 되어있기때문이다. 
	    System.out.println(h1.age);        
	    //h1.name();       //name이 메소드가 아니라서 에러
	    h1.walk();       //walk는 메소드 이기 때문에 가능하다.
	    h1.eat();
	    h1.displayPerson();
	    
	    // [3] 원더우먼 객체생성 
	   
	    Hero h2 = new Hero("원더우먼",21);
	    h2.displayPerson();                         //원더우먼은 여자인데 Hero 클래스에 설정되어있지 않아서 부모 클래스에 설정되어있는 값 1로 표시되어있음 
	    h2.gender = 2;
	    h2.power = 300;
	    h2.displayPerson();
	    
	
	}
}





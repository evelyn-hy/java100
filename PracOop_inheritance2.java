//getter,setter 가 포함된 클래스의 상속을 코드로 구현하시오.
// 부모클래스 Person1  자식클래스 Villain1, Hero1
// 비유적 설명으로는 전염병으로 private한 병원에 격리되어있는 친구에게 간호사를 통해서 물건을 전해주고 받는 친구 
// private 는 접근 불가능하기 때문에 중간에 대신 전해주고 받는 것이 필요한데 그것이 get과 set이다.


class Person1 {
	
	//Field

    private String name;
	private int age;
	private int height;
	private int weight;
	
	
	//Constructor
	Person1(){}
	Person1(String name, int age, int height, int weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
		
	
	

	//Method
	public String getName() {return name;}                       // 이것은 간호사가 감연된 친구에게 받은 물건을 친구에게 전해줄때. 즉 간호사로부터 물건을 받을 떄
	                                                           // 반환값이 String 이고("좀비"), 인자값이 따로 필요없이 밑에서 객체가 getName 을 호출하면 된다.
	
	public void setName(String name) { this.name=name;}        //public void setName(String name) { this.name=name;} = 물건을 전해주는 간호사
		                                                       //m1.setName("좀비") 좀비로 셋팅해놓은 값을 String name에 전달받고 setName 메서드가 호출됨
	                                                           // 그때 this (=객체 m1)의 멤버필드 name에다가 전달받은 "좀비"를 셋팅하고있는 것이다. 
	
	public int getAge() {return age;}                       //값을 가져오는 것(호출)
    public void setAge(int age) {this.age=age; }             //쉽게 말해서 값을 받아 셋팅만 해놓으면되고
   
	public void setHeight(int height) {this.height=height;}
	public int getHeight() {return height;}
	
	public int getWeight() {return weight;}
	public void setWeight (int weight) {this.weight=weight;}
	
    public void move () {System.out.println("좀비 이동중...");}
}
    
class Villain1 extends Person1{
	
	//Field
	private String unique_key;
	private int weapon;            //1~9 숫자로 무기 분류 > 1:총 2:방패 3:칼 등등...
    private double power;
  
	//constructor
	Villain1(){}
    Villain1(String name, int age,int height, int weight, String unique_key,int weapon, double power){     //상속받은 값도 써서 밑에서 부모클래스생성자 호출
    	super(name,age,height,weight);               //부모클래스의 *생성자*를 호출한다.
    	this.unique_key=unique_key;
    	this.weapon=weapon;
    	this.power=power;
    	
    }
	
    //Method
    public String getUnique_key () {return unique_key;}
	public void setUnique_key(String unique_key){this.unique_key=unique_key;}
	
	public int getWeapon() {return weapon;}
	public void setWeapon(int weapon) {this.weapon=weapon;}
	
	public double getPower() {return power;}
	public void setPower(double power) {this.power=power;}
	
    public void printPerson() {
    	System.out.println("악당 이름 :" + getName());
    	System.out.println("악당 나이 :" + getAge());
    	System.out.println("악당의 키 :" + getHeight());
    	System.out.println("악당 체중 :" + getWeight());
    	System.out.println("악당 넘버 :" + getUnique_key());
    	System.out.println("악당 무기 :" + getWeapon());
    	System.out.println("악당 파워 :" + getPower());
    	
	}
	
}
class Hero1 extends Person1{
	
	String name;
	int age;
	int height;
	int weight;
	int number;
	String weapon;
	int power;
	
	Hero1(){}
	
	
	}
	




public class PracOop_inheritance2 {
	public static void main(String[] args) {
		
	    //[1] 객체생성 
		Person1 m1 = new Person1();
	     m1.setName("좀바");               // m1.setName("좀바"); = 물건을 주러온 친구 (전달만 하는 것)
	     m1.getName();                          
	     m1.setAge(10);
	     m1.getAge();
	     m1.setHeight(150);
	     m1.getHeight();
	     m1.setWeight(20);
	     m1.getWeight();
	     
	     System.out.println(m1.getName());                    //화면에 출려하려면 변수에 넣던지 System.out.println()에 넣어야한다.
	     System.out.println(m1.getAge());  
	     System.out.println(m1.getHeight()); 
	     System.out.println(m1.getWeight()); 
	     
	     
	     //[2]객체생성
	     Villain1 v1 = new Villain1("도깨비",20,180,80,"15001231",1,99.5);
	     v1.printPerson();
	     System.out.println(v1.getName());      //getName 뒤에 () 까먹지말기!!
	     Hero1 m3 = new Hero1();
		
	     
	}
}
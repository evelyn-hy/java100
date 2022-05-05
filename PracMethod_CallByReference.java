//Call By Reference 

//메인메서드에서 100을 보냈을 때 값이 수정되게끔 call by reference 방식으로 코드를 수정하시오.
//a 값이 같은 결과가 나오도록 코드를수정하시오.


public class PracMethod_CallByReference{

	public static void sum(PracMethod_CallByReference a) {
		
		System.out.println("sum()메서드 안에서 a 값 출력 : "+a);  
		
	}
	public static void main(String[] args) {
		
		//[1] 변수 선언 및 메서드 호출
		
		// Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고 new 로 객체를 생성하여 해당주소값을 메서드로 보낸다.
		//Integer a = new Integer(); // >> 하지만 주소값이 아니라 정수값이 출력된다. 그래서 이 방식은 안된다X
	
		//int[] a= new int[5];     //배열도 참조형타입으로 주소값을 갖는다
		
		PracMethod_CallByReference a = new PracMethod_CallByReference();  
		sum(a);      //sum() 메서드 호출
	    

		//[2]출력
		System.out.println("main()메서드 안에서 a 값 출력 : "+ a);
	}
}
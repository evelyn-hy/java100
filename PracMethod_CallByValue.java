public class PracMethod_CallByValue{
	
	//[1] Call By Value : 값에 의한 호출 > 값에 의해서 (메서드를) 호출  쉽게말해서 값 자체를 보낸다는 뜻 (고래가아닌 작은 조개를 옮긴다.  고래는 크기때문에 주소값을 보내야함.)
	//메서드로 인자값을 넘길 때 해당값을 복사하여 넘기는 방식.  따라서 내부에서는 복사된 값으로 처리를 한다.
	
	public static void sum(int a) {
		
		a=a+400;
		System.out.println(a); //500
		
	}
	public static void main(String[] args) {
		
		//[1] 변수 선언 및 메서드 호출
		int a= 100;
		sum(a);         //sum() 메서드 호출
	
		
		//[2]출력
		System.out.println(a); //100
	}
}
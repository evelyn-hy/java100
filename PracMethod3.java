

//2) 반환값 X   받는 인자값 O
// 메서드가 받는 인자값이 있다는 것은 호출부에서 파라미터 값을 넘긴다는 뜻.


public class PracMethod3{
	public static void plusMethod(int a,int b) {         //받는 인자값은 반드시 자료형을 함꼐 써줘야한다.
		//단순 출력
		System.out.printf("인자로 넘겨받은 값은 %d와 %d 입니다.",a,b);
		// 연산 출력
	    int rst = a+b;
		System.out.println("a와 b를 더한 값은 =" + rst );
		
	}
	public static void main(String[] args) {
	
    int a = 100;
    int b = 200;               
    plusMethod(a,b);            //호출부
    
	}
	
}
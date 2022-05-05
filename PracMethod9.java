//2개의 정수의 값을 리턴하는 메서드

import java.util.Arrays;

public class PracMethod9 {

	public static int[] returnMethod() {
		int b = 21;
	    int c = 24;
	
	    return new int[] {b,c};
	}
	
	public static void main(String[] args) {
	
	
	//1) 배열 변수 선언 >메서드로부터 반환받을 값이 배열이기 때문이다.
		
		int [] a = returnMethod(); 
	
	//2)출력 
		
    System.out.println(a[0] +" "+a[1]);
	System.out.println(Arrays.toString(a)); // 값을 [] 안에 배열로 받을 수 있다.
 }
}
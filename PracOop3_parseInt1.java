//문자열을 숫자로 바꿔서 연산해보시오
//이때 인자값으로 진수를 지정해서 출력해보시오

// [!] 왜 변환이 필요한가?
// 1+2 숫자끼리의 연산은 3이지만. 문자열끼리의 연산은 12가 되기 때문에 숫자로 변환 후 연산을 수행해야한다.
// 문자열을 숫자로 변환시키는 방법 >  Integer.parseInt() 사용 (대문자 주의)
// parseIn() > Integer 클래스의 static으로 지정  > 따라서 객체 생성없이 바로 "클래스명.parseInt()" 로 직접 호출해서 사용.

public class PracOop3_parseInt1 {
	public static void main(String[] args) {
		
		
		//1) 숫자끼리의 연산
	
		int a=1;
		int b=2;
		int c = a+b;
		System.out.println(c);      //3
		
	    //2) 문자열끼리의 연산
		
		String str = "1";
		String str2 = "2";
		String str3 = str+ str2;
		System.out.println(str3); //12
		System.out.println(str3.getClass().getName()); //(java.lang.String) str3가 string이라는 것을 알 수 있음.
		
		//3) 문자열 > 숫자로 변환 후 연산
		
		int a2 = Integer.parseInt(str);        //1
		int b2 = Integer.parseInt(str2);       //2
		int c2 = Integer.parseInt(str3);       //12
		int d2 = Integer.parseInt(str+str2);   //12
		
		System.out.println(a2+b2);             //3
		
		
		
		
	}
}

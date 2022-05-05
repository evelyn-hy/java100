//문자열을 숫자로 변환시 진수를 지정해서 출력해보시오.
//이 문제는 Integer.parseInt() 의 두 번째 인자값으로 진수를 지정하여 출력하는 것에 대해서 묻는 문제이다.

// [!] 왜 변환이 필요한가?
// 1+2 숫자끼리의 연산은 3이지만. 문자열끼리의 연산은 12가 되기 때문에 숫자로 변환 후 연산을 수행해야한다.
// 문자열을 숫자로 변환시키는 방법 >  Integer.parseInt() 사용 (대문자 주의)
// parseIn() > Integer 클래스의 static으로 지정  > 따라서 객체 생성없이 바로 "클래스명.parseInt()" 로 직접 호출해서 사용.

// 두번째 인자값으로 진수를 지정 > 해당진수에 맞는 값이 됨 > Integer.parseInt("1000",2); 1000이 2진수라는 뜻

public class PracOop4_parseInt2 {
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
		
		//4) 진수 지정
		
		System.out.println(Integer.parseInt("2022")); //2022                ***츨력되는 값은 10진수로 출력된다.
		System.out.println(Integer.parseInt("2022",10)); //2022      2022 문자열을 10진수의 숫자로 만들어준다.즉 2022는 10진수이고 10진수로 값을 출력한다,
		System.out.println(Integer.parseInt("1",2)); //1              문자열 1을 2진법의 숫자로 만들어준다. 즉 1은 2진법이고 10진수로 그 값을 출력. 2의0승 = 1  
		System.out.println(Integer.parseInt("1001",2)); //9          1001 문자열을 2진수의 숫자로 만들어준다. 즉 1001은 2진수이고 10진수로 그 값을 출력한다. 
		                                                                       //2의 3승 + 0 + 0+ 2의 0승 = 9
		System.out.println(Integer.parseInt("1004",8));  //516        1004는 8진수이고 10진수의 값을 출력한다. 9진수 1004는 10진수로 516이다.
		System.out.println(Integer.parseInt("A",16));    //10         16진수는 0 1 2 3 4 5 6 7 8 9 A B C D E F 이고 10진수로 10이다.
		System.out.println(Integer.parseInt("FF",16));   //255        F=16, 15 * 16의 1승 + 15* 16의 0승
		
		
		
	}
	
}
		
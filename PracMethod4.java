
//3) 반환값 O   받는 인자값 X
// 반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴값이 있는 것이므로 호출시 리턴값을 받는 변수를 정의한다. 

public class PracMethod4 {
	public static int returnMethod() {
		int i = 100;
		i*=100;
		return i;
	
	}
	public static void main(String[] args) {
		
	int rst;
	rst = returnMethod();              //리턴값을 받을 변수를 정의(리턴값을 받기위해 리턴값에 맞는 바구니 준비)
	
	//출력
     System.out.println(rst);
	}
	
}
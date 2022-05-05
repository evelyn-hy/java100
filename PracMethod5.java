
//4) 반환값 O   받는 인자값 O
// 반환값이 있다는 것은 메서드 호출에 따른 리턴되는 값이 있다는 것이므로 호출시 리턴값을 받는 변수를 정의한다.

public class PracMethod5{
	public static String capitalMethod(String st) {
		String se = st.toUpperCase();
		return se; 
		
	}
	public static void main(String[] args) {
		
	   String str = capitalMethod("korea");            // 반환값이 있기 때문에 리턴값을 반는 변수를 정의하고 받는 인자값을 매서드이름 () 괄호 안에 적는다.  
	   System.out.println(str);
	}
	 
}
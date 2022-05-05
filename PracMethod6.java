
// static 선언이 안되어있는 메서드를 사용하는 방법. > 객체를 따로 생성해주면된다.

public class PracMethod6{
	public void helloWorld() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		
		//1) 메서드 호출 helloWorld(); 메인메서드는 static에서만 호출할 수 있기떄문에 에러
		//2) 객체 생성 후 메서드 호출
		PracMethod6 name = new PracMethod6();         //객체를 생성해주면 된다.
		name.helloWorld();
	}
}
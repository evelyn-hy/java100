public class PracMethod1 {
	
	public static void helloWorld() {                      //main 매서드가 있는 public static void main(String[] args) 이 static으로 되어있으면 이곳도 
		System.out.println("Hello World");                                                      //static으로 되어있어야한다. static은 static을 부름.
	}
	
	public static void main(String[] args) {         
	       PracMethod1.helloWorld();             // static으로 선언이 되어있으면 객체 생성없이 매서드를 호출해서 사용할 수 있다.  > 클래스명.매서드명();
	      
	}
	}



//정답코드

public class PracMethod8{
	
	public static String[] capitalMethod(String a, String b) {
		
		String st1 = a.toUpperCase();
		String st2 = b.toLowerCase();
		String[] st = {st1,st2};
			return st;
	}
	
	public static void main(String[] args) {
		
		String[] str = capitalMethod ("korea","USA");
		System.out.println(str[0]+"-"+str[1]);
		
		
	}
}
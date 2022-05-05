//1차원배열
public class Prac4 {
	public static void main(String[] args) {
		
		String [] str= new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
	 str[0]="가나";
	 str[1]="다라";
	 str[2]="마바";
	 System.out.println(str[2]);
	 
	 String [] nation = new String[] {"Korea","Italy","TheUS","Switzerland"};
	 System.out.println(nation[2]);
	 
	 String [] flower = {"rose","cherryBlossom","sunflower"};
	 System.out.println(flower[1]);
	 
	 for(int i=0;i<flower.length;i++)
		 System.out.println(flower[i]);
	 
	 for(String strr : nation)
		 System.out.println(strr); // 향상된 for 문으로 배열 요소 출력
	 
	 
		
	}
}
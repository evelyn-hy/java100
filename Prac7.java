import java.util.Scanner;

public class Prac7 {
	public static void main(String[] args) {

        //1) 사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		//2) 2차원 배열의 행과 열 선언 > 사용자 입력으로 처리
		System.out.print("행의 값을 입력하고 enter를 눌러주세요");
		int R = sc.nextInt();
		System.out.print("열의 값을 입력하고 enter를 눌러주세요");
		int C = sc.nextInt();
		
		//3) char 2차원 배열 선언 > 사용자로부터 R,C 입력받아 > gameMap[R][C] 생성.
		
		char[][] gameMap = new char[R][C];
		
	
		 //for문 사이에 String배열 선언해놓고 2번째 for문이 돌 때 값을 가져다가 사용.
         
		//4) 사용자 입력을 받아서 저장할 String 배열 선언 > 이때 크기를 R 로 해주도록 한다(***)
		//index에 R로 하는 이유는 어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기때문.
		
		String[] str = new String[R];   //***            //첫번째 for 문은 행  두 번째 for 문은 
	
		//5) 2차원 배열 요소  > 사용자가 입력하는 값으로 셋팅
	
	    for(int i=0;i<R;i++) {
	    	System.out.print((i+1)+"번쨰 행에 입력할 문자" + C +"개를 차례대로 입력하고 enter 치세요");
	        str[i]= sc.next();                             //***
	    	for(int j=0;j<C;j++)
	    		gameMap[i][j]=str[i].charAt(j);
	    
	     //6) 2차원 배열에 들어가는 값 출력하기
	    	System.out.println(str); // 주소값
	    	System.out.println(str[0]); //KOR
	    	System.out.println(str[1]); //USA            행 수만큼 출력하기 ex) 3행이면 System.out.println(str[0부터2까]) 출력 그래야 콘솔창에서 확인가능
	    	
	 
	    	
	    //
	    //	System.out.println("------------------------------------");
	    //	for (int i=0;i<R;i++) {
	    //		for(int j=0; j<C; j++)
	    //			System.out.print(gameMap[i][j]);
	    //		System.out.println();
	    //	}
	    //	System.out.println("-------------------------------------");
	    } 
	
	
	} 
}

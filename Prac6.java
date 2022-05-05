import java.util.Scanner;

public class Prac6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 값을 입력하고 enter 를 누르세요");
	    int R = sc.nextInt();
	    System.out.print("열의 값을 입력하고 enter 를 누르세요");
	    int C = sc.nextInt();
	    
	    char[][] gamePlay = new char[R][C];
	    
	    String[] src = new String[R];
	    
	    for(int i =0;i<R;i++) {
	    	System.out.print((i+1)+"번쨰 행의 넣을 값"+ C + "개를 입력해주십시오");
	    	src[i]= sc.next();
	    	for(int j =0;j<C;j++)
	    	
	    gamePlay[i][j]=src[i].charAt(j);
	    	
	    	System.out.println(src);
	    	System.out.println(src[0]);
	    	System.out.println(src[1]);
	    	System.out.println(src[2]);  
	   
	    }
		
		
		
		
	}
}
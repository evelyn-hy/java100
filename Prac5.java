//2차원배열
public class Prac5 {
	public static void main(String[] args) {
		String [][] asia_nation= {
				{"Korea","Japan","China"},
				{"Thailand","Vietnam","Philippines"}		
		};

		System.out.println(asia_nation[0]);
		System.out.println(asia_nation[1]);
		
		System.out.println(asia_nation[0].length);
		System.out.println(asia_nation[1].length);
		
		System.out.println(asia_nation.length);
		
		System.out.println(asia_nation[0][1]);
		System.out.println(asia_nation[1][2]);
		
		
		for(int i=0;i<asia_nation.length;i++) {
			for(int j=0; j<asia_nation[i].length;j++)
				System.out.print(asia_nation[i][j]);
			System.out.println();
		
		}
		
	
		
	
		String drinks [][] = {
				{"Americnao","CafeMocha","Latte","ColdBrew","Espresso"},
				{"EarlGrey","GreenTea","EnglishBreakfastTea","camomile","chai"}
		}; 
		
		System.out.println(drinks.length);
		System.out.println(drinks[0].length);
		System.out.println(drinks[1].length);
		System.out.println(drinks[0][4]);
		System.out.println(drinks[1][3]);
		System.out.println(drinks[0]);            //1번쨰 배열의 주소값
		System.out.println(drinks[1]);            //2번쨰 배열의 주소값
	    System.out.println(drinks);               //drinks 배열의 주소값
	    
		for(int h=0;h< drinks.length;h++) {          //첫번쨰 배열의/두번쨰 배열의
			for(int y=0;y<drinks[h].length;y++)        //몇 번을 돌릴것인가. 
				System.out.print(drinks[h][y]+" ");
		
			System.out.println();
		
		}
		
		
		
		//charAt() ***
		
	String[] str1= {"hey","wake","up"};
	
	System.out.println(str1[0].charAt(1));
		
	System.out.println(str1[1].charAt(3));
		
	for(int a=0;a<str1.length;a++)
		for(int c=0;c<str1[a].length();c++)                   //2차원배열과의 차이점은 str1[].length 뒤에 ()를 붙여야 한다.
			System.out.print(str1[a].charAt(c));              //ex) str1[0]의 (hye) length 는 string 값이므로 length() /str1 값이 문자열임으로 length() 
		System.out.println();
		

		String[] pra = {"jeon","hye","yeon"};
		
		
		for(int pa = 0; pa<pra.length;pa++)
			for(int ba= 0; ba<pra[pa].length();ba++)
				System.out.print(pra[pa].charAt(ba));
		System.out.println();
		
		
		
		
	//length vs length()
    //length - 배열의 길이를 재주는 것 length() -문자열의 길이를 재주는 것
		
	 
	 //length	
	 String [] abc = new String[3];
	 System.out.println(abc.length); //3
	 
	
	 //length()
	 String def = ("Welcome to Java");
	 System.out.println(def.length()); //15
	 
		
		
		
		
	}

}

		
		
		
		
		
		
	
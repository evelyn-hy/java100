//내가 만들어본 코드

import java.util.Arrays;

public class PracMethod7{
	public static String[] capitalMethod() {
		String str1 = "korea".toUpperCase();
		String str2 = "USA".toLowerCase();
		return new String [] {str1,str2};
	}
    public static void main(String[] args) {
   
    	
    	
    	String[] str= capitalMethod();
    	
    	System.out.println(str[0]+"-"+str[1]);
    	
    	System.out.println(Arrays.toString(str));
    }
}
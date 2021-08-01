package qu1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s =sc.nextLine();
		System.out.println(convertMiddle(s));
   	    sc.close();
		}
       static String convertMiddle(String g) {
    	   if(g.length()%2==0){
    		   char a= g.charAt(0);
    		   return Character.toUpperCase(a)+g.substring(1,g.length());
    	   }
    	   else {
    		   int z=g.length()/2;
    		   char b = g.charAt(z);
    		   char c= Character.toUpperCase(b);
    		   return g.substring(0,g.length()/2)+c+g.substring(z+1);
    	   }
       }
}

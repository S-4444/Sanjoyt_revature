package qu1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		String[] s1= s.split(" ");
		String fine="";
		for( String x: s1) {
			fine=fine+convertLast(x)+" ";
		}
		System.out.println(fine);
	}
     static String convertLast(String h) {
    	 char a=h.charAt(h.length()-1);
    	 char b = Character.toUpperCase(a);
    	 
    	 return h.substring(0,h.length()-1)+b;
    	 
     }
}

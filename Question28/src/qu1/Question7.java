package qu1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String a= sc.nextLine();
    String arr[]= a.split(" ");
    String fine="";
    for(String x:arr) {
    	fine=fine+ispalindrom(x)+" ";
    }
    System.out.println(fine);
	}
	public static String ispalindrom(String d) {
		if (isP(d)) {
			return d;
		}
		else {
			StringBuffer sh= new StringBuffer(d);
			sh.reverse();
			return sh.toString();
			
		}
	}
	
	
   public static boolean isP(String s) {
	   StringBuffer sb= new StringBuffer(s);
	    sb.reverse();
	    String s1=sb.toString();  
	    return s.equals(s1);
   }
}

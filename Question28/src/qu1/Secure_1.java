package qu1;

import java.util.Scanner;

public class Secure_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          String s=sc.nextLine();
          
          if (s.startsWith("https"))
        	  System.out.println( "Secured");
          else 
        	  System.out.println("Not Secured");
	}

}

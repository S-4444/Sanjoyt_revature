package qu1;

import java.util.Scanner;

public class Qu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  float c =0;
          Scanner sc= new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          c=(float)Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
          System.out.println("Hypotenuse c is "+c);
	}

}

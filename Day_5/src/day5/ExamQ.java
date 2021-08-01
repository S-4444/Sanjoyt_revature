package day5;

import java.util.Scanner;

public class ExamQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		 Scanner sc= new Scanner(System.in);
         String s=sc.nextLine();
    System.out.println(lovepalindrom(s));
     
	}
    public static Character lovepalindrom(String str){
    	 char k= 'Z';
         char b = str.charAt(str.length()-1);
         String  result=b+str;
    	StringBuilder q= new StringBuilder(result);
        q.reverse();
    	String a= q.toString();
    	if (result.equals(a)) {
    		return  (b);
    			
    		
    	}
    	else {
    	return k;
    	}
    }
}

package day5;

import java.util.Scanner;

public class ExamQ2 {
	
	
     public static void main(String args){
    	  Scanner e= new Scanner(System.in);
       	 String s= e.nextLine();
       	 System.out.println(maxLength(s));
 
     }
       public static String maxLength(String ss) {
    	 
      	 String[] arr= ss.split(" ");
      	 String ab="";
      	 int temp =0;
      	 for(int i=0; i<arr.length ;i++) {
      		    if(arr[i].length()<temp) {
      		    	temp=arr[i].length();
    		    	
    		    }
    	   }
    	   
    	  for (int j=0; j<arr[j].length() ; j++) {
    		    if(arr[j].length()==temp) {
    		        ab=ab+" "+arr[j];	
    		    }
    	  }
    	  return ab;
       }
     
      
}


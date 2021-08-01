package qu1;
//without using hashset ----> finding 2nd largest element in duplicate element array

import java.util.Arrays; 

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int [] arr= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
           Arrays.sort(arr);
           int [] a = new int[8];
           int j=0;
           
           for (int i=0; i<7;i++ ) {
        	   if (arr[i]!=arr[i+1] ) {
        		   a[j]= arr[i];
        		   j++;
        	   }
           a[j]=arr[7];
          
	}
           System.out.println("The 2nd largest value are " + a[a.length-2] );
    	
    }
}

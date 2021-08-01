package qu1;
//with Hashcode 

import java.util.HashSet;
public class HashsetarrayRv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {1,1,5,2,8,6,5,6,7,9,1,5,7,3,5,8,7,9,4,2};
   
   HashSet<Integer> hs = new HashSet<>();
   for(int i=0; i<arr.length; i++) {
	   hs.add(arr[i]);
	}
   for(int no:hs) {
	   System.out.println(" \n" +no);
	  
   }
   System.out.println("the second largest values is :" + hs[hs.length-2]);
}

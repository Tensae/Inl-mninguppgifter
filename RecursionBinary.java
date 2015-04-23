package searchSort;

import java.util.Arrays;

public class RecursionBinary {

	
	public static int recbinarySearch(int[] arr, int key, int low, int high) {
	         
	            	     if(high < low)
	            	         return -1;
	            	     else
	            	     {
	            	         int mid = low + (high - low)/2;

	            	         if(arr[mid] > key)
	            	             return recbinarySearch(arr, key, low, mid-1);
	            	         else if(arr[mid] < key)
	            	             return recbinarySearch(arr, key, mid+1, high);
	            	         else
	            	             return mid;
	            	     }
	          
	    }

	
		
			public static void main(String[] args) {
				
				int []list = {2,3,5,6,9,1};
				int h = list.length;
				int l = 0;
			
				Arrays.sort(list);
				for (int k = 0; k < 10; k++) {
					
					int index = recbinarySearch(list, k,  l, h);
				
					if (index!=-1)
						System.out.println (k + " is located at index " + index);
						
			
					else 
						System.out.println (k + " is not in array");
						
				
				}

		}

	

}

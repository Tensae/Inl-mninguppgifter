package searchSort;



public class SelectionLarge {
	
	

public static void selectionSort(double[] arr) {
		

	for (int i = arr.length-1; i >=0;  i--){
		double currentMin = arr [i];
		int currentMinIndex = i;
		
		for (int j = i -1; j >=0; j--) {
			if (currentMin < arr[j]) {
				currentMin = arr[j];
				currentMinIndex = j;
				
			}
		}
		
		if (currentMinIndex != i) {
			arr [currentMinIndex] = arr[i];
			arr [i] = currentMin;
		}
	}
	
}
			
		
	
		
		public static void main(String[] args) {
			double [] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
			SelectionLarge.selectionSort (list); {
				for (double i : list) {
					System.out.print (i + " ");
				}
			}
		

	}

}


package searchSort;



public class BoubbleSorting {
	
	public static void bubbleSort(double[] list) {

	      boolean swapped = true;

	      int j = 0;

	      double tmp;

	      while (swapped) {

	            swapped = false;

	            j++;

	            for (int i = 0; i < list.length - j; i++) {                                       

	                  if (list[i] > list[i + 1]) {                          

	                        tmp = list[i];

	                        list[i] = list[i + 1];

	                        list[i + 1] = tmp;

	                        swapped = true;

	                  }

	            }                

	      }

	}

	public static void main(String[] args) {
		
			double[] list = {1, 9, 4.5, 6.6, 5.9, -4.5};
			BoubbleSorting.bubbleSort (list); 
				for (double i : list) {
					System.out.print (i + " ");
				}
			}
		
	}



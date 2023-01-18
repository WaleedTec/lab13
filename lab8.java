package lab8;

public final class lab8 {
	// Method to find the maximum integer in an array
	  public int findMax(int[] array) {
	    int max = array[0];
	    for (int i = 1; i < array.length; i++) {
	      if (array[i] > max) {
	        max = array[i];
	      }
	    }
	    return max;
	  }

	  // Method to find the minimum integer in an array
	  public int findMin(int[] array) {
	    int min = array[0];
	    for (int i = 1; i < array.length; i++) {
	      if (array[i] < min) {
	        min = array[i];
	      }
	    }
	    return min;
	  }
	}
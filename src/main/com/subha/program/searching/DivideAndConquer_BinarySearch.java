package main.com.subha.program.searching;

public class DivideAndConquer_BinarySearch {

	public static void main(String[] args) {
		DivideAndConquer_BinarySearch ds = new DivideAndConquer_BinarySearch();
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
	        System.out.println("Key 14's position: "+ds.binarySearch(arr, 14));
	        int[] arr1 = {6,34,78,123,432,900};
	        System.out.println("Key 432's position: "+ds.binarySearch(arr1, 432));
	}

	private int binarySearch(int[] arr1, int i) {
		int start = 0;
		int end = arr1.length -1 ;
		
		while(start <= end) {
			int mid = (end + start )/2;
			if(i == arr1[mid])
				return mid ;
			if(i < arr1[mid])
				end = mid;
			if(i > arr1[mid])
				start = mid +1 ;
		}
		return -1;
		
	}

}

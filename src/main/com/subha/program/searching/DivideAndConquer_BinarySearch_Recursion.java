package main.com.subha.program.searching;

public class DivideAndConquer_BinarySearch_Recursion {

	public static void main(String[] args) {
		
		int[] arr1 = {2,45,234,567,876,900,976,999};
        int index = recursiveBinarySearch(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
        
	}

	private static int recursiveBinarySearch(int[] arr, int start, int end, int key) {
		if (start < end) {
			int mid = start + (end -start)/2 ;
			if(key == arr[mid])
				return mid;
			if(key > arr[mid])
				return recursiveBinarySearch(arr,mid+1 ,end,key);
			if (key < arr[mid])
				return recursiveBinarySearch(arr,start ,mid,key);
		}
		else
			return -(start +1);
		return -1 ;
	}

}

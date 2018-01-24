package main.com.subha.program.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArray {

	public static void main(String a[]){
		Integer[] arr1 = {4,7,3,9,2};
		Integer[] arr2 = {3,2,12,9,40,32,4};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
        System.out.println("/////////////////////");
        printCommonElement(arr1 ,arr2);
    }

	private static void printCommonElement(Integer[] arr1, Integer[] arr2) {
		List<Integer> lst1 = Arrays.asList(arr1);
		List<Integer> lst2 = Arrays.asList(arr2);
		
		List<Integer> finalLst = new ArrayList<>(lst1);
		finalLst.retainAll(lst2);
		for(Integer o : finalLst)
			System.out.println(o);
	}

}

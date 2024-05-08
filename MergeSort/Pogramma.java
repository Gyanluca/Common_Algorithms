package it.cefi;

public class Pogramma {

	public static void main(String[] args) {
		int[] testArray = {12, 11, 13, 4, 2, 1, 7 ,5 ,3, 29 ,3, 3};
		
		MergeSort.mergeSort(testArray);
		
		for(int i : testArray) {
			System.out.format("%3d", i);
		}

	}

}

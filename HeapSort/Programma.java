package it.cefi;

public class Programma {

	public static void main(String[] args) {
		int[] arrayTest = {12, 11, 13, 5, 6, 7, 2, 1, 192, 2};
		
		HeapSort.heapSort(arrayTest);
		
		for(int i : arrayTest) {
			System.out.format("%3d,", i);
		}
		

	}

}

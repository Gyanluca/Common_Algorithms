package it.cefi;

import java.lang.reflect.Array;

public class Programma {

	public static void main(String[] args) {
		int[] arrayTest = {10, 7, 2, 1, 23, 4, 2, 1, 1, 5};
		
		int n = Array.getLength(arrayTest);
		QuickSort.quickSort(arrayTest, 0, n - 1);
		
		for(int i : arrayTest) {
			System.out.format("%3d", i);
		}

	}

}

package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		int[] testArray = {1, 3, 6, 2, 19, 0, 4, 1, 11, 9, 5};
		
		BubbleSort.sort(testArray);
		
		for (int i : testArray)
			System.out.format("%3d", i);

	}

}

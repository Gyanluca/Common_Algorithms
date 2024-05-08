package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		int [] array = {2, 5, 6, 7, 9, 10, 100, 2938, 3444, 23998};
		int target = 9;
		
		int result = BinarySearch.binarySearch(array, target);
		
		if (result != -1) {
			System.out.println("L'elemento " + target + " si trova all'indice: " + result);
			} else {
				throw new IllegalArgumentException("L'elemento non è nell'array");
			}

	}

}

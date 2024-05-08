package it.cefi;

public class Programma {
	public static void main(String[] args) {
		
		int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target = 16;
		
		int result = LinearSearch.linearSearch(array, target);
		
		if (result != -1) {
			System.out.println("L'elemento " + target + " si trova all'indice: " + result);
		} else {
			throw new IllegalArgumentException("L'elemento non esiste nell'array");
		}
		
	}

}

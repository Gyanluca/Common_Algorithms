package it.cefi;

//la funzione ricerca l'elemento in un array, scorrendolo tutto

public class LinearSearch {
	
	public static int linearSearch(int[] array, int target) {
		
		//itera su tutti gli elementi dell'array
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		
		//Se il target non è presente nell'array, restituisci -1
		return -1;
	}

}

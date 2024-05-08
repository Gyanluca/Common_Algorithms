package it.cefi;

//Nota che l'algoritmo funziona solo su array ordinati in ordine crescente (o decrescente in caso)

public class BinarySearch {
	
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			//Se il target è uguale all'elemento centrale, restituisci l'indice
			if (array[mid] == target) {
				return mid;
			}
			
			//Se il target è maggiore dell'elemento centrale, cerca nella dx dell'array
			else if (array[mid] < target) {
				left = mid + 1;
			}
			
			//Se il target è minore dell'elemento centrale, cerca nella sx dell'array
			else {
				right = mid - 1;
			}
		}
		
		//Se l'elemento non è presente nell'array, restituisci -1
		return -1;
	}

}


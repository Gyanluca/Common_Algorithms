package it.cefi;

public class BubbleSort {
	
	//Riordina gli elementi di un array in ordine crescente, 
	//iterando e scambiando a due a due di posto gli elementi se necessario.
	
	public static void sort(int[] array) {
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (array[i] > array[i + 1]) {
					//sorting algo
					int t = array[i];
					array[i] = array[i + 1];
					array[i + 1] = t;
					
					swapped = true;
				}
			}
			n--;
		}
		while (swapped);
	}
}
			

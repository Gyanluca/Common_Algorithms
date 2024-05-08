package it.cefi;

//funzione principale per il sorting

public class HeapSort {
	public static void heapSort(int[] array) {
		int n = array.length;
		
		//costruisci un heap max
		for (int i = (n / 2) - 1; i >= 0; i--) {
			Heapify.heapify(array, n, i);
		}
		
		//estrai uno per uno gli elementi dall'heap
		for (int i = n - 1; i > 0; i--) {
			int t = array[0];
			array[0] = array[i];
			array[i] = t;
			
			//chiama heapify sull'heap ridotto
			Heapify.heapify(array, i, 0);
		}
	}

}

package it.cefi;

public class Heapify {
	public static void heapify(int[] array, int n, int rootIndex) {
		int largest = rootIndex; //inizializza il più grande come radice
		int leftChild = 2 * rootIndex + 1; //indice del figlio sinistro
		int rightChild = 2 * rootIndex + 2; //indice del figlio destro
		
		//se il figlio sinistro è più grande della radice
		if (leftChild < n && array[leftChild] > array[largest]) {
			largest = leftChild;
		}
		
		//se il figlio destro è più grande del più grande finora
		if (rightChild < n && array[rightChild] > array[largest]) {
			largest = rightChild;
		}
		
		//se il più grande non è la radice
		if (largest != rootIndex) {
			//scambia il valore della radice con il più grande
			int t = array[rootIndex];
			array[rootIndex] = array[largest];
			array[largest] = t;
			
			//si applica ricorsivamente heapify
			heapify(array, n, largest);
		}
	}

}

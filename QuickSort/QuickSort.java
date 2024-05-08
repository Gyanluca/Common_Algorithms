package it.cefi;

//funzione proncipale di ordinamento che chiama il metodo della classe Partition

public class QuickSort {
	public static void quickSort(int[] array, int low, int high) {
		//se l'indice basso è minore dell'indice alto, c'è almeo un elemento dell'array da ordinare
		if (low < high) {
			//trova il pivot corretto e posizionalo nella sua posizione finale
			int pivotIndex = Partition.partition(array, low, high);
			
			//ordina ricorsivamente gli elementi prima e dopo il pivot
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
			
		}
	}

}

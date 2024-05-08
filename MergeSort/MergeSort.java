package it.cefi;

//funzione principale di ordinamento, che usa la funzione Merge

public class MergeSort {
	
	public static void mergeSort(int[] array) {
		if (array == null) {
			return;
		}
		
		int n = array.length;
		if (n > 1) {
			int m = n / 2;
			int[] left = new int[m];
			int[] right = new int[n - m];
			
			//copia gli elementi sinistri dall'array originale
			for (int i = 0; i < m; i++) {
				left[i] = array[i];
			}
			
			//copia gli elementi destri dall'array originale
			for(int i = m; i < n; i++) {
				right[i - m] = array[i];
			}
			
			//richiama mergeSort in modo ricorsivo per gli array destro e sinistro
			mergeSort(left);
			mergeSort(right);
			
			//unisce i due array ordinati
			Merge.merge(array, left, right);
			
		}
	}

}

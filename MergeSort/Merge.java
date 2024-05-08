package it.cefi;

//serve a unire gli array una volta ordinati

public class Merge {
	public static void merge(int[] array, int[] left, int[] right) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		
		//riordina l'array originale considerando gli elementi da entrambi gli array sinistro e destro
		while(i < nL && j < nR) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		//copia eventuali elementi rimanenti dall'array sx, se presenti
		while(i < nL) {
			array[k] = left[i];
			i++;
			k++;
		}
		
		//copia eventuali elementi rimanenti dall'array dx, se presenti
		while(j < nR) {
			array[k] = right[j];
			j++;
			k++;
		}
	}

}

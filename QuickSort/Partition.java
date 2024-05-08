package it.cefi;

//la funzione trova il pivot corretto e lo posiziona nella sua posizione finale
//organizza gli elementi più piccoli a sinistra e quelli più grandi a destra del pivot

public class Partition {
	public static int partition(int[] array, int low, int high) {
		
		//scelgo il pivot, sia l'ultimo elemento dell'array
		int pivot = array[high];
		
		//indice del più piccolo elemento
		int i = low - 1;
		
		//scansiona l'array dalla parte bassa a quella alta
		for(int j = low; j < high; j++) {
			
			//se l'elemento corrente è <= al pivot, incrementa l'indice del più piccolo elemento e scambia gli elementi
			if (array[j] <= pivot) {
				i++;
				
				//swapping algo
				int t = array[i];
				array[i] = array[j];
				array[j] = t;
			}
		}
		
		//posiziona il pivot nella sua posizione corretta e restituisce l'indice del pivot
		int t = array[i + 1];
		array[i + 1] = array[high];
		array[high] = t;
		return i + 1;
		
		
	}

}

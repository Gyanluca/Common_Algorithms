package it.cefi;

//Dato un array arr[] di dimensione N-1, la funzione trova
//l'intero mancante tra i primi N interi.

public class FindNumber {
	public static int findNumber(int arr[], int N) {
		
		//inizializzo un array temporaneo
		int temp[] = new int[N + 1];
		
		//inizializzo tutti gli elementi dell'array a 0
		for(int i = 0; i <= N; i++) {
			temp[i] = 0;
		}
		
		//esamino l'array in input, ogni elemento i-esimo dell'array
		//corrisponderà all'elemento i-1 dell'array temporaneo col valore di 1.
		//Ciò serve a segnare che il numero i-esimo è presente nell'array.
		for(int i = 0; i < N; i++) {
			temp[arr[i] - 1] = 1;
		}
		
		//L'algoritmo cerca il primo elemento dell'array temp che rimane uguale a 0.
		//L'indice di questo elemento (a) è quindi incrementato di 1 per ottenere il numero mancante.
		int a = 0;
		for (int i = 0; i <= N; i++) {
			if (temp[i] == 0)
				a = i + 1;
		}
		return a;
	}   
}

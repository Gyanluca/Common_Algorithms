package it.cefi;

//Il programma fa la sommatoria tra i e q di 1/i

public class Sommatoria {
	
	public static double calcolo (int i, int q) {
		if (i >= q) {
			throw new IllegalArgumentException("Errore: deve essere i < q");
		}
		
		double somma = 0.0;
		
		for (int j = i; j <= q; j++) {
			 somma = somma + 1.0/j;
		}
		
		return somma;
		
	}
	
}
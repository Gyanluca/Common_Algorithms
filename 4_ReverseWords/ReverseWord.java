package it.cefi;

//L'algoritmo inverte le parole di una stringa data.

public class ReverseWord {
	public static String invertiStringa(String str) {
		
		//Divido la stringa in parole usando lo spazio come delimitatore,
		//creo un array di parole.
		String[] parole = str.split(" ");
		
		//Creo una stringa risultato che deve essere costruita.
		StringBuilder risultato = new StringBuilder();
		
		//Itero attraverso le parole dall'ultima alla prima e la aggiungo alla stringa: risultato.
		for (int i = parole.length -1; i >= 0; i--) {
			risultato.append(parole[i]).append(" ");
		}
		
		//Restituisco la stringa risultante con le parole invertite.
		//Con .trim() rimuovo lo spazio finale in eccesso.
		return risultato.toString().trim();
		
		
	}

}

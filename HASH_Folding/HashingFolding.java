package it.cefi;

//funzione che tramite il folding, genera la somma dei codici ASCII di una parola in input

public class HashingFolding {
	
	public static int hashingFolding(String key, int tableSize) {
		int hashValue = 0;
		
		//calcola la somma dei codici ASCII dei caratteri nel key
		for (int i = 0; i < key.length(); i++) {
			hashValue += key.charAt(i);
		}
		
		//si fa il folding
		while (hashValue >= tableSize) {
			hashValue = (hashValue % tableSize) + (hashValue / tableSize);
			
			//l'operazione di foldin è servita a creare una distribuzione uniforme degli elementi nella tabella
		}
		return hashValue;
	}

}

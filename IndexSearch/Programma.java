package it.cefi;

import java.util.HashMap;

public class Programma {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 4);
		map.put(2, 45);
		map.put(3, 10);
		map.put(4, 17);
		map.put(5, 429);
		
		int keyToSearch = 4;
		int result = IndexBasedSearch.indexBasedSearch(map, keyToSearch);
		
		if (result != -1) {
			System.out.println("Il valore associato alla chiave " + keyToSearch + " è: " + result);
		} else {
			throw new IllegalArgumentException("La chiave non è presente nella mappa");
		}
		
		//stampa l'intero contenuto della mappa
		String contenutoMappa = PrintMap.printMap(map);
		System.out.println("\n" + contenutoMappa);
		

	}

}

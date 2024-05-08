package it.cefi;

import java.util.HashMap;

//funzione per la ricerca per indice, usando una HashMap
//il vantaggio è che non è necessario un array ordinato.

public class IndexBasedSearch {
	public static int indexBasedSearch(HashMap<Integer, Integer> map, int key) {
		
		//verifica se il valore è presente nella mappa
		if (map.containsKey(key)) {
			//restituisci il valore associato alla chiave
			return map.get(key);
		} else {
			//restituisci -1 se la chiave non è presente nella mappa
			return -1;
		}
	}

}

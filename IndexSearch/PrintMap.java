package it.cefi;

import java.util.HashMap;
import java.util.Map;

//questa classe contiene il metodo che restituisce una stringa
//contenente il contenuto della mappa (che poi posso stampare nel main)

public class PrintMap {
	//metodo per a ottenere una stringa con l'intero contenuto della mappa
	public static String printMap(HashMap<Integer, Integer> map) {
		
		StringBuilder stringa = new StringBuilder();
		stringa.append("Contenuto della mappa: \n");
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			stringa.append("Chiave: ").append(entry.getKey()).append(", Valore: ").append(entry.getValue()).append("\n");	
		}
		return stringa.toString();
	}

}

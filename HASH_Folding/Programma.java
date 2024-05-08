package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		String key = "hello";
		int tableSize = 100;  //dimensione della tabella di hash
		int hash = HashingFolding.hashingFolding(key, tableSize);
		
		System.out.println("Hash per " + key + ": " + hash);
	}

}

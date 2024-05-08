package it.cefi;

//La congettura di Collatz o problema del 3x + 1 può essere riassunto come segue: 
//prendi un numero intero positivo n. Se n è pari, dividi n per 2. 
//Se n è dispari, moltiplica n per 3 e aggiungi 1. 
//Ripeti il processo indefinitamente. La congettura afferma che, 
//indipendentemente dal numero con cui inizi, alla fine raggiungerai sempre 1.
//Scrivere un programma che, ottenuto in input un numero intero, 
//mostra il numero di passaggi necessari per raggiungere 1.

public class CollatzConjecture {
	
	public static int collatzConjecture(int n) {
		
		while (n != 1) {
			if (n % 2 == 0) {
				System.out.println(n + " / 2 = ");
				n = n / 2;
			} else {
				System.out.println(n + " * 3 + 1 = ");
				n = 3 * n + 1;
			}
		}
		return n;
		
	}

}

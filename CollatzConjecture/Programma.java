package it.cefi;

import java.util.Scanner;

public class Programma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire un numero intero positivo su cui eseguire la Congettura di Collatz: ");
		int numero = scanner.nextInt();
		scanner.close();
		
		if (numero <= 0) {
			throw new IllegalArgumentException("Inserisci un numero intero e positivo");
		} else {
			System.out.println(CollatzConjecture.collatzConjecture(numero));
		}
	}

}

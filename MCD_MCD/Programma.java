package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		int n1 = 24;
		int n2 = 32;
		
		int num1 = 1, den1 = 4;
		int num2 = 1, den2 = 6;
		
		int ris1 = MCD.calcolaMCDNum(num1, num2);
		int ris2 = MCD.calcolaMCDDen(den1, den2);
		
		System.out.println("Il MCD tra i numeri: " + n1 + " e " + n2 + " è: " + MCD.calcolaMCD(n1, n2));
		
		System.out.println("Il MCD tra le frazioni: " + num1 + "/" + den1 + " e " + num2 + "/" + den2 + " è: " + ris1 + "/" + ris2 );
		
		System.out.println("Il MCM tra i numeri: " + n1 + " e " + n2 + " è: " + MCD.calcolaMCM(n1, n2));
		
		System.out.println("Il MCM tra le frazioni: " + num1 + "/" + den1 + " e " + num2 + "/" + den2 + " è: " + MCD.calcolaMCMFrazioni(num1, den1, num2, den2));

	}

}

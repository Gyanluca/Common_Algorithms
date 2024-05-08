package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		int n = 10; //calcolo fibonacci per n = 10
		
		for(int i = 0; i <= n; i++) {
			System.out.format("%3d", Fibonacci.fibonacci(i));
		}
	}

}

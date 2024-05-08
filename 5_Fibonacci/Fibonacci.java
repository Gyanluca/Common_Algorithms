package it.cefi;

//L'algoritmo calcola la sequenza di Fibonacci, cioè
//ogni numero n è calcolato come somma dei due numeri precedenti.

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}

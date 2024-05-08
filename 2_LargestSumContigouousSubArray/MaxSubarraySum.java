package it.cefi;

//L'algoritmo trova la somma massima di una sottosequenza contigua
//di un array di interi.
public class MaxSubarraySum {
	
	public static int maxSubarraySum(int array[]) {
		
		//max_so_far è la variabile che tiene traccia della somma massima trovata finora.
		//Integer.MIN_VALUE è una costante in Java che corrisponde a un numero piccolissimo negativo,
		//pongo cioè max_so_far così piccolo da essere sicuramente inferiore a qualunque membro dell'array.
		int max_so_far = Integer.MIN_VALUE;   
		
		//variabile che tiene traccia della somma corrente della sottosequenza contigua
		int max_ending_here = 0;
		
		for (int i = 0; i < array.length; i++) {
			//aggiungo l'elemento corrente dell'array a max_ending_here
			max_ending_here = max_ending_here + array[i];  
			
			//se questa condizione è verificata, ho trovato una sottosequenza 
			//con somma più grande di quella massima precedente.
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			
			//se max_ending_here è negativo, significa che l'aggiunta dell'elemento corrente
			//ha diminuito la somma. Perciò max_ending_here è posto a 0 in modo da non considerare
			//una sottosequenza contigua con somma negativa.
			if (max_ending_here < 0)
				max_ending_here = 0;
			}
		return max_so_far;
	}
}

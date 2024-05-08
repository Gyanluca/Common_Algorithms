package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int trappedWater = TrappingRainWater.trappingRainWater(array);
		
		System.out.println("QUantità d'acqua trattenuta: " + trappedWater);

	}

}

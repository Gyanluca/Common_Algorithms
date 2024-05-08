package it.cefi;

//l'algoritmo calcola la quantità "d'acqua" contenuta tra due
public class TrappingRainWater {
	
	public static int trappingRainWater(int[] altezza) {

		if (altezza == null || altezza.length == 0)
			return 0;
		
		int n = altezza.length;
		int[] sxMax = new int[n];
		int[] dxMax = new int[n];
		
		//calcola l'altezza massima a sinistra di ogni posizione
		sxMax[0] = altezza[0];
		
		for(int i = 1; i < n; i++) {
			sxMax[i] = Math.max(sxMax[i - 1], altezza[i]);
		}
		
		//calcola l'altezza massima a destra di ogni posizione
		dxMax[n - 1] = altezza[n - 1];
		
		for(int i = n - 2; i >= 0; i--) {
			dxMax[i] = Math.max(dxMax[i + 1], altezza[i]);
		}
		
		//calcola la quantità d'acqua trattenuta in ogni posizione
		int waterTrapped = 0;
		
		for(int i = 0; i < n; i++) {
			waterTrapped = waterTrapped + Math.min(sxMax[i], dxMax[i]) - altezza[i];
		}
		return waterTrapped;
	}
}

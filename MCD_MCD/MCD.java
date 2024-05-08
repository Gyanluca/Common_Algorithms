package it.cefi;

//L'algoritmo implementa il massimo comun divisore tra due numeri,
//e tra due frazioni.
//E' presente anche un metodo che implementa il minimo comune multiplo.
public class MCD {
	public static int calcolaMCD(int a, int b) {
		
		//finchè b non diventa 0, si calcola il resto della divisione a:b.
		//Durante ogni iterazione, viene calcolaro il resto di a : b, e b viene
		//sostituito con a, e a con b. Il procedimento continua finchè b = 0, momento
		//in cui a sarà il MCD dei due numeri iniziali.
		while (b != 0) {
			
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	//--------------------------------------------------------MCD per Frazioni
	public static int calcolaMCDDen(int den1, int den2) {
		int mcdDen = calcolaMCD(den1, den2);
		return mcdDen;
	}
		public static int calcolaMCDNum(int num1, int num2) {
			int mcdNum = calcolaMCD(num1, num2);
			return mcdNum;
	}
		
	//--------------------------------------------------------MCM, e MCM per Frazioni
		public static int calcolaMCM(int a, int b) {
			return (a * b) / calcolaMCD(a, b);
		}
		
		public static int calcolaMCMFrazioni(int num1, int den1, int num2, int den2) {
			
			//calcolo MCD dei numeratori
			int mcdDen = calcolaMCD(den1, den2);
			
			//calcolo MCM tra denominatori
			int mcmDen = (den1 * den2) / mcdDen;
			
			return mcmDen;
		}

}

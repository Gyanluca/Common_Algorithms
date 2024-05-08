package it.cefi;

public class PrintBinaryTree {
	
	//funzione per stampare l'albero binario, usando un attraversamento
	//in-order(sinistro, chiave, destro)
	
	public static void printBinaryTree(TreeNode root) {
		if (root != null) {
			printBinaryTree(root.getLeft()); //attraversa il sottoalbero sinistro
			System.out.println(root.getVal() + " "); //stampa il valore del nodo corrente
			printBinaryTree(root.getRight());
		}
	}
	

}

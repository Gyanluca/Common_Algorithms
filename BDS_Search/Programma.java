package it.cefi.programma;

import it.cefi.BinaryTree;
import it.cefi.BreadthFirstSearch;
import it.cefi.PrintBinaryTree;
import it.cefi.TreeNode;

public class Programma {

	public static void main(String[] args) {
		
		//costruisco un albero binario:
		
		//1) creo i nodi tra loro separati
		TreeNode node1 = new TreeNode(8);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(34);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(67);
		TreeNode node6 = new TreeNode(9);
		TreeNode node7 = new TreeNode(0);
		TreeNode node8 = new TreeNode(100);
		TreeNode node9 = new TreeNode(23);
		
		//2) unisco tra loro i nodi usando i setter
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node5.setLeft(node6);
		node5.setRight(node7);
		node3.setRight(node8);
		node8.setLeft(node9);
		
		BinaryTree tree = new BinaryTree(node1);
		
		int keyToSearch = 2;
		boolean found = BreadthFirstSearch.breadthFirstSearch(tree, keyToSearch);
		
		if (found) {
			System.out.println("La chiave " + keyToSearch + " è stata trovata nel'albero.");
		} else {
			throw new IllegalArgumentException("La chiave non esiste nell'albero.");
		}
		
		System.out.println("Albero binario: ");
		PrintBinaryTree.printBinaryTree(tree.getRoot());
		

	}

}

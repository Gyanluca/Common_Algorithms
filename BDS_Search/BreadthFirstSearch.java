package it.cefi;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	//funzione che opera la ricerca in ampiezza (BFS)
	public static boolean breadthFirstSearch(BinaryTree tree, int key) {
		if (tree.getRoot() == null) {
			return false;
		}
		
		Queue <TreeNode> queue = new LinkedList<>();
		queue.offer(tree.getRoot());
		
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			
			//controllo se il nodo corrente contiene la chiave
			if (current.getVal() == key) {
				return true;
			}
			
			//aggiungo i nodi figli nella coda
			if (current.getLeft() != null) {
				queue.offer(current.getLeft());
			}
			
			if (current.getRight() != null) {
				queue.offer(current.getRight());
			}
		}
		
		return false; //la chiave non è stata trovata
	}

}

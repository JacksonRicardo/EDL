/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author jacks
 */


public class GenericTree {
	private Node raiz;
	
	public Node root() {
		return raiz;
	}
	
	boolean isInternal(Node n) { 
		return (n.getFilhos().size() > 0);
	}
	
	boolean isExternal(Node n) {
		return ! isInternal(n);
	}

	public GenericTree(Node raiz) {
		this.raiz = raiz;
	}
	
	public String toString() {
		return this.display(this.raiz) + "";
	}
	
	private String display(Node node) {
		String retorno = "";
		if ((node.getFilhos().size() > 0) || this.root().equals(node) ) {
			for (int i = 0; i < node.getFilhos().size()-1; i++) {
				 retorno += " ";
			}
			retorno += node.getValor() + "\n";
			for (int i = 0; i < node.getFilhos().size(); i++) {
				retorno += node.getFilhos().get(i) + " ";
			}
			retorno += "\n";
			for (int i = 0; i < node.children.size(); i++) {
				retorno += this.display(node.children.get(i));
			}
		}
	return retorno;
	}
}

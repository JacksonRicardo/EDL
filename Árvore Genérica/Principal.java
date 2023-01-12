/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

/**
 *
 * @author jacks
 */
public class Principal {

	public static void main(String[] args) {
		Node raiz = new Node(1);
		Node no2 = new Node(2);
		Node no3 = new Node(3);
		Node no4 = new Node(4);
		Node no5 = new Node(5);
		Node no6 = new Node(6);
		Node no7 = new Node(7);
		GenericTree arvoreTeste = new GenericTree(raiz); 
		
		raiz.addFilho(no2);
		raiz.addFilho(no3);
		raiz.addFilho(no4);
		raiz.addFilho(no7);
		no2.addFilho(no5);
		no2.addFilho(no6);
		
		System.out.println(no3.grau());
		System.out.println(arvoreTeste.isInternal(no6));
		System.out.println(arvoreTeste);
	}

}

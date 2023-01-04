/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.usapilhaencadeada;

/**
 * @author jackson ricardo 
 */
public class UsaPilhaEncadeada {

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();

        System.out.println("Vazia? " + pilha.isEmpty());
        pilha.push("a");
        pilha.push("b");
        pilha.push("c");
        pilha.push("d");
        pilha.push("e");
        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("--------PILHA INTEIRA--------");
        pilha.imprimir();
        System.out.println("Item retirado: " + pilha.pop());
        System.out.println("------PILHA MODIFICADA-------");
        pilha.imprimir();
        System.out.println("Tamanho da pilha " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.pop());
        System.out.println("Vazia? " + pilha.isEmpty());
    }
}

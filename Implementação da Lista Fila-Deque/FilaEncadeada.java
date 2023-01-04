/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila3;

/**
 *
 * @author jackon
 */
public class FilaEncadeada {

    private int tamanho = 0;
    private Node inicio;
    private Node ultimo;

    public Node getInicio() {

        return inicio;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public Object inicio() throws EFilaEncadeadaVazia {
        if (estaVazia()) {
            throw new EFilaEncadeadaVazia("Fila Vazia.");
        } else {
            return inicio.getO();
        }

    }

    public void enfileirar(Object o) {
        Node novo = new Node(o, null);
        if (tamanho == 0) {
            inicio = novo;
            tamanho++;
        } else if (tamanho == 1) {
            ultimo = novo;
            inicio.setProximo(ultimo);
            tamanho++;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
            tamanho++;
        }
    }

    public Object desenfileirar() throws EFilaEncadeadaVazia {
        if (estaVazia()) {
            throw new EFilaEncadeadaVazia("Fila vazia.");
        } else {
            Object temp = inicio.getO();
            inicio = inicio.getProximo();
            tamanho--;
            return temp;
        }
    }

    public void mostrarFila() {
        Node aux = getInicio();
        System.out.println("Fila:");
        while (aux != null) {
            System.out.print(aux.getO() + " ");

            aux = aux.getProximo();
        }
        System.out.println("\n");
    }
}


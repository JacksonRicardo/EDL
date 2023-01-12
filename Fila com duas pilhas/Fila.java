/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
/**
 *
 * @author jacks
 */
import java.util.*;

public class Fila {

    private Stack<Object> Pilha1;
    private Stack<Object> Pilha2;

    public Fila() {
        Pilha1 = new Stack<Object>();
        Pilha2 = new Stack<Object>();
    }

    public Stack<Object> getFila() {
        return Pilha1;
    }

    public int tamanho() {
        return Pilha1.size();
    }

    public boolean estaVazia() {
        return Pilha1.size() == 0;
    }

    public Object inicio() throws EFilaVazia {
        return Pilha1.firstElement();
    }

    public void enfileirar(Object o) {
        Pilha1.add(o);
    }

    public Object desenfileirar() throws EFilaVazia {
        if (estaVazia()) {
            throw new EFilaVazia("Fila vazia.");
        }
        Pilha2.clear();
        Object aux = Pilha1.firstElement();
        while (Pilha1.size() != 0) {
            Pilha2.add(Pilha1.pop());
        }

        Pilha2.pop();
        while (Pilha2.size() != 0) {
            Pilha1.add(Pilha2.pop());
        }
        return aux;
    }

    public void mostrarFila() {
        System.out.println(Pilha1);
    }
}

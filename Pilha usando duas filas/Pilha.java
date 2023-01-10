/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadupla;
import java.util.*;
/**
 * @author jacks
 */
public class Pilha {

    private Queue<Object> fila1;
    private Queue<Object> fila2;

    public Pilha() {
        fila1 = new LinkedList<Object>();
        fila2 = new LinkedList<Object>();
    }

    public int tamanho() {
        return fila1.size();
    }

    public boolean estaVazia() {
        return fila1.size() == 0;
    }

    public Object top() throws EPilhaVazia {
        if (estaVazia()) {
            throw new EPilhaVazia("Pilha Vazia.");
        } else {
            while (fila1.size() > 1) {
                fila2.add(fila1.poll());
            }
            Object aux = fila1.poll();
            while (fila2.size() > 0) {
                fila1.add(fila2.poll());
            }
            fila1.add(aux);
            return aux;
        }
    }

    public void push(Object o) {
        fila1.add(o);
    }

    public Object pop() throws EPilhaVazia {
        if (estaVazia()) {
            throw new EPilhaVazia("Pilha Vazia.");
        } else {
            while (fila1.size() > 1) {
                fila2.add(fila1.poll());
            }
            Object aux = fila1.poll();
            while (fila2.size() > 0) {
                fila1.add(fila2.poll());
            }
            return aux;
        }
    }

    public void mostrarPilha() {
        System.out.println(fila1);
    }
}

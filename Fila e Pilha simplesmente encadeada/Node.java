/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila3;

/**
 *
 * @author jackson
 */
public class Node {

    private Object o;
    private Node proximo;

    public Node() {
    }

    public Node(Object o, Node proximo) {
        this.o = o;
        this.proximo = proximo;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}


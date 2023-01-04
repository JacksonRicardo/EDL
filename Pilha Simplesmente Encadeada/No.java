/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usapilhaencadeada;

//um valor vai sempre conter um vlor relacionado ao anterior
public class No {
    private Object valor;
    private No anterior;
   
    public No(Object valor, No anterior){
        this.valor = valor;
        this.anterior = anterior;
    }
    public Object getValor(){
        return valor;
    }
    public void setValor(Object valor){
        this.valor = valor;
    }
    public No getAnterior(){
        return anterior;
    }
    public void setAnterior(No anterior){
        this.anterior = anterior;
    }
}

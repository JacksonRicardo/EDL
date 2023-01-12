/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usapilhaencadeada;

/**
 * @author jackson ricardo
 */
public class PilhaEncadeada {
    private No topo;
    private int qtd;
    
    //Verifica se a quantidade é igual a zero e retorna
    public boolean isEmpty(){
        return this.qtd == 0;
    }
    /*
    - Método para empilhar: recebe um valor digitado pea usuário, a partir desse
    - valor cria uma instância de Nó passando o valor recebido e o atributo topo
    - para ser salvo no anterior. Topo recebe um valor,que é uma instância de 
    - Nó e a quantidade de valores da Pilha é incrementada.
    */
    public void push(Object valor){
    No novoValor = new No(valor, topo);
    this.topo = novoValor;
    this.qtd++;
    }
    /**
     * Método para desempilhar: o primeiro passo é verificar se a pilha está vazia,
     - caso não esteja é iniciado a lógica. É criado uma variável auxiliar para 
     - receber o valor do topo. Depois o topo vai receber o valor anterior. A
     - quantidade é decrementada e, por fim,  valor que estava no topo é retornado.
    */
    public Object pop(){
        if (!this.isEmpty()){
            Object aux = topo.getValor();
            this.topo = topo.getAnterior();
            this.qtd--;
            return aux;
        }else{
            System.out.println("Pilha Vazia!");
            return null;
        }
    }
    //Retorna o valor do topo
    public Object top(){
        return this.topo.getValor();
    }
    //Retorna a quantidade de valores existentes na pilha
    public int size(){
        return this.qtd;
    }
    //Imprime os valores da pilha
    public void imprimir(){
        No aux = topo;
        
        while (aux !=null){
            System.out.println(aux.getValor()+ " ");
            aux = aux.getAnterior();
        }
    }
    public No getTopo(){
        return topo;
    }
    public void setTopo(No topo){
        this.topo = topo;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
}

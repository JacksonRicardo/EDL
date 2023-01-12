/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fila3;

import java.util.Scanner;

/**
 *
 * @author jackson
 */
public class Fila3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op = 1;
            FilaEncadeada fila = new FilaEncadeada();
            while (op != 0) {
                System.out.print("Comandos:\n[1] Enfileirar\n[2] Desenfileirar\n[3]Início\n[4] Tamanho\n[0] Sair\n -> ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        fila.enfileirar(sc.next());
                        fila.mostrarFila();
                        break;
                    case 2:
                        try {
                            System.out.println("Saiu :" + fila.desenfileirar());
                            fila.mostrarFila();
                        } catch (EFilaEncadeadaVazia e) {
                            System.out.println("\nPilha vazia!\n");
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("\n" + fila.inicio() + "\n");
                        } catch (EFilaEncadeadaVazia e) {
                            System.out.println("\nPilha vazia!\n");
                        }
                        break;
                        
                    case 4:
                        System.out.println("\n" + fila.tamanho() + "\n");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}

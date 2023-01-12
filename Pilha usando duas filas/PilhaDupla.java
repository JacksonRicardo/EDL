/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhadupla;
import java.util.Scanner;
/**
 * @author jacks
 */
public class PilhaDupla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 1;
        Pilha pilha = new Pilha();
        while (op != 0) {
            System.out.print("Comandos:\n[1] Push\n[2] Pop\n[3] Top\n[4]Size\n[0] Sair\n -> ");

op = sc.nextInt();
            switch (op) {
                case 1:
                    pilha.push(sc.next());
                    System.out.println("Pilha:");
                    pilha.mostrarPilha();
                    System.out.println();
                    break;
                case 2:
try {
                    pilha.pop();
                    System.out.println("Pilha:");
                    pilha.mostrarPilha();
                    System.out.println();
                } catch (EPilhaVazia e) {
                    System.out.println("\nPilha vazia!\n");
                }
                break;
                case 3:
try {
                    System.out.println("\n" + pilha.top() + "\n");
                } catch (EPilhaVazia e) {
                    System.out.println("\nPilha vazia!\n");
                }
                break;
                case 4:

                    System.out.println("\n" + pilha.tamanho() + "\n");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}

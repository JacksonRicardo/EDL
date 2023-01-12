/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;
/**
 *
 * @author jacks
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();
        int op = 1;
        while (op != 0) {
            System.out.print("Comandos:\n[1] Enfileirar\n[2] Desenfileirar\n[3] Inicio\n[4] Tamanho\n[0] Sair\n -> ");
op = sc.nextInt();
            switch (op) {
                case 1:
                    fila.enfileirar(sc.next());
                    fila.mostrarFila();
                    break;
                case 2:
try {
                    System.out.println("Saiu: " + fila.desenfileirar());
                    fila.mostrarFila();

                } catch (EFilaVazia e) {
                    System.out.println("\nFila vazia!\n");
                }
                break;
                case 3:
try {
                    if (fila.inicio() == null || fila.inicio() == "-") {
                        throw new EFilaVazia("Fila vazia.");
                    }

                    System.out.println("\n" + fila.inicio() + "\n");
                } catch (EFilaVazia e) {
                    System.out.println("\nFila vazia!\n");
                }
                break;
                case 4:
                    System.out.println("\n" + fila.tamanho() + "\n");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}

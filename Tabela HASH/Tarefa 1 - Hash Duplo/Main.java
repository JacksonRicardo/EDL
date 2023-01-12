package main;

/*
*UTILIZANDO HASH DUPLO
*Estrutura de Dados Lineares
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 1;
        Object elemento;
        int chave;
        TabelaHash t = new TabelaHash(13);
        System.out.println("[Hashing Duplo]");
        while (op != 0) {
            System.out.print("Comandos:\n"
                    + "[1] insertItem\n"
                    + "[2] removeElement\n"
                    + "[3] findElement\n"
                    + "[4] size\n"
                    + "[5] isEmpty\n"
                    + "[6] keys\n"
                    + "[7] elements\n"
                    + "[8] Mostrar Tabela\n"
                    + "[0] Sair\n-> ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Chave: ");
                    chave = sc.nextInt();
                    System.out.print("Elemento: ");
                    elemento = sc.next();
                    t.insertItem(chave, elemento);
                    break;
                case 2:
                    if (t.isEmpty()) {
                        System.out.println("Tabela vazia.");
                    } else {
                        System.out.print("Chave do elemento: ");
                        chave = sc.nextInt();
                        Object o = t.removeElement(chave);
                        if (o == "NO_SUCH_KEY") {
                            System.out.println("NO_SUCH_KEY");
                        } else {
                            System.out.println("Removido o elemento [" + o
                                    + "]");
                        }
                    }
                    break;
                case 3:
                    if (t.isEmpty()) {
                        System.out.println("Tabela vazia.");
                    } else {
                        System.out.print("Chave do elemento: ");
                        chave = sc.nextInt();
                        Object aux = t.findElement(chave);
                        if (aux == "NO_SUCH_KEY") {
                            System.out.println("NO_SUCH_KEY");
                        } else {
                            System.out.println("Elemento da chave " + chave +  " encontrado = " + aux);
                        }
                       
}
break;
                case 4:
                    System.out.println("Size = " + t.size());
                    break;
                case 5:
                    System.out.println(t.isEmpty());
                    break;
                case 6:
                    if (t.isEmpty()) {
                        System.out.println("Tabela vazia.");
                    } else {
                        System.out.println(Arrays.toString(t.keys()));
                    }
                    break;
                case 7:
                    if (t.isEmpty()) {
                        System.out.println("Tabela vazia.");
                    } else {
                        System.out.println(Arrays.toString(t.elements()));
                    }
                    break;
                case 8:
                    if (t.isEmpty()) {
                        System.out.println("Tabela vazia.");
                    } else {
                        t.showTabela();
                    }
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}

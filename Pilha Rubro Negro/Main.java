package pilha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho, op = 1;

        System.out.print("Tamanho da pilha: ");
        tamanho = sc.nextInt();

        Pilha pilha = new Pilha(tamanho);

        while (op != 0) {
            System.out.print("Comandos:\n[1] Push Red\n[2] Push Black\n[3] Pop Red\n[4] Pop Black\n[5] Top Red\n[6] Top Black\n[7] Size\n[0] Sair\n-> ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    pilha.pushRed(sc.next());
                    System.out.println("Pilha:");
                    for (int i = pilha.capacity() - 1; i >= 0; i--) {
                        if (pilha.getPilha()[i] == null) {
                            System.out.println("-");
                        } else {
                            System.out.println(pilha.getPilha()[i]);
                        }

                    }
                    System.out.println();
                    break;
                case 2:
                    pilha.pushBlack(sc.next());
                    System.out.println("Pilha:");
                    for (int i = pilha.capacity() - 1; i >= 0; i--) {
                        if (pilha.getPilha()[i] == null) {
                            System.out.println("-");
                        } else {
                            System.out.println(pilha.getPilha()[i]);
                        }

                    }
                    System.out.println();
                    break;
                case 3:
                    try {
                    pilha.popRed();
                    System.out.println("Pilha:");
                    for (int i = pilha.capacity() - 1; i >= 0; i--) {
                        if (pilha.getPilha()[i] == null) {
                            System.out.println("-");
                        } else {
                            System.out.println(pilha.getPilha()[i]);
                        }

                    }
                    System.out.println();
                } catch (EPilhaVazia e) {
                    System.out.println("\nPilha Vermelha vazia!\n");
                }
                break;
                case 4:
                    try {
                    pilha.popBlack();
                    System.out.println("Pilha:");
                    for (int i = pilha.capacity() - 1; i >= 0; i--) {
                        if (pilha.getPilha()[i] == null) {
                            System.out.println("-");
                        } else {
                            System.out.println(pilha.getPilha()[i]);
                        }

                    }
                    System.out.println();
                } catch (EPilhaVazia e) {
                    System.out.println("\nPilha Preta vazia!\n");
                }

                break;
                case 5:
                    try {
                    System.out.println("\n" + pilha.topRed() + "\n");
                } catch (EPilhaVazia e) {
                    System.out.println("\nPilha Vermelha vazia!\n");
                }
                break;
                case 6:
                    try {
                    System.out.println("\n" + pilha.topBlack() + "\n");
                } catch (EPilhaVazia e) {
                    System.out.println("\nPilha Preta vazia!\n");
                }
                break;
                case 7:
                    System.out.println("\n" + pilha.capacity() + "\n");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r, op = 1;
    Object o;
    Vetor vetor = new Vetor();
    while (op != 0) {
      System.out
          .print("Comandos:\n[1] elemAtRank\n[2]replaceAtRank\n[3] insertAtRank\n[4] removeAtRank\n[0] Sair\n-> ");

      op = sc.nextInt();
      switch (op) {
        case 1:
          System.out.println("Rank: ");
          vetor.elemAtRank(sc.nextInt());
          System.out.println();
          break;
        case 2:
          System.out.println("Rank: ");
          r = sc.nextInt();
          System.out.println("Elemento: ");
          o = sc.next();
          vetor.replaceAtRank(r, o);
          vetor.mostrarVetor();
          /*
           * try {
           * pilha.pop();
           * System.out.println("Pilha:");
           * for(int i = pilha.size()-1; i >= 0; i--)
           * { System.out.println(pilha.getPilha()
           * [i]);
           * }
           * System.out.println();
           * } catch (EPilhaVazia e)
           * { System.out.println("\nPilha vazia!\
           * n");
           * }
           */
          break;
        case 3:
          try {
            System.out.println("Rank: ");
            r = sc.nextInt();
            System.out.println("Elemento: ");
            o = sc.next();
            vetor.insertAtRank(r, o);
          } catch (EVetorExcecao e) {
            System.out.println("\nRank inválido.\n");
          }
          vetor.mostrarVetor();
          break;
        case 4:
          try {
            System.out.println("Rank: ");
            vetor.removeAtRank(sc.nextInt());
          } catch (EVetorExcecao e) {
          }

          vetor.mostrarVetor();
          break;
        default:
          break;
      }
    }
    sc.close();
  }
}

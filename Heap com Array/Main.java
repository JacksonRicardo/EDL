import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int op = 1;
    Object elemento;
    int chave;
    Heap h = new Heap();
    while (op != 0) {
      System.out.print("Comandos:\n[1] insert\n[2] removeMin\n[3]min\n[4] size\n[5] Mostrar Heap\n[0] Sair\n -> ");
      op = sc.nextInt();
      switch (op) {
        case 1:
          System.out.print("Chave de prioridade: ");
          chave = sc.nextInt();
          System.out.print("Elemento: ");
          elemento = sc.next();
          h.insert(chave, elemento);
          break;
          
        case 2:
          if (h.isEmpty()) {
          System.out.println("Heap vazio.");
          } else {
          Item i = h.removeMin();
          System.out.println("Removido o Item de Chave [" + i.getChave() + "] e Elemento [" + i.getElemento() + "]");
          }
          break;

        case 3:
          if (h.isEmpty()) {
          System.out.println("Heap vazio.");
          } else {
          System.out.println("O min é o Item de Chave [" + h.min().getChave() + "] e Elemento [" + h.min().getElemento() + "]");
          }
          break;

        case 4:
          System.out.println("Size = " + h.size());
          break;
        case 5:
          if (h.isEmpty()) {
            System.out.println("Heap vazio.");
          } else {
            h.showHeap();
          }
        default:
          break;
      }
    }
    sc.close();
  }
}
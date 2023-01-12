public class Vetor {
  private Object arrayVetor[];
  private int n; // Guarda o tamanho atual do vetor
  private int tamanho;

  public Vetor() {
    tamanho = 5;
    arrayVetor = new Object[tamanho];
    n = 0;
  }

  public int size() {
    return n;
  }

  public boolean isEmpty() {
    if (n == 0)
      return true;
    else
      return false;
  }

  public Object elemAtRank(int r) {
    return arrayVetor[r];
  }

  public Object replaceAtRank(int r, Object o) {
    Object aux = arrayVetor[r];
    arrayVetor[r] = o;
    return aux;
  }

  public void insertAtRank(int r, Object o) throws EVetorExcecao {
    if (r >= tamanho || r < 0 || r > n)
      throw new EVetorExcecao("Rank inválido.");
    if (n == tamanho) {
      System.out.println("Vetor cheio. Dobrando tamanho...");
      Object auxVetor[] = new Object[tamanho * 2];
      for (int i = 0; i < tamanho; i++) {
        auxVetor[i] = arrayVetor[i];
      }
      arrayVetor = auxVetor;
      tamanho *= 2;
    }
    if (arrayVetor[r] == null) {
      arrayVetor[r] = o;
    } else {
      for (int i = tamanho - 2; i >= r; i--) {
        arrayVetor[i + 1] = arrayVetor[i];
      }
    }
    arrayVetor[r] = o;
    n++;
  }

  public Object removeAtRank(int r) throws EVetorExcecao {
    if (r >= tamanho || r < 0)
      throw new EVetorExcecao("Rank inválido.");
    Object aux = arrayVetor[r];
    for (int i = r; i < tamanho - 1; i++) {
      arrayVetor[i] = arrayVetor[i + 1];
    }
    n--;
    arrayVetor[tamanho - 1] = null;
    return aux;
  }

  public void mostrarVetor() {
    System.out.println("Vetor:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("[");

      if (arrayVetor[i] == null)
        System.out.print("-");
      else
        System.out.print(arrayVetor[i]);
      System.out.print("]");
    }
    System.out.println();
  }
}

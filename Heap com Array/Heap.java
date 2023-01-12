public class Heap {
  private Item vetor[];
  private int tamanho;
  private int ultimo;

public Heap() {
  tamanho = 10;
  vetor = new Item[tamanho + 1];
  ultimo = 0;
}
  
public void insert(int k, Object o) {
  Item i = new Item(k, o);
  ultimo++;
  vetor[ultimo] = i;
  upHeap();
}
public Item removeMin() {
  Item aux = vetor[1];
  vetor[1] = vetor[ultimo];
  vetor[ultimo] = null;
  ultimo--;
  downHeap();
return aux;
}
  
public Item min() {
  return vetor[1];
}
  
public int size() {
  return ultimo;
}
  
public boolean isEmpty() {
  if (ultimo == 0) {
return true;
    
} else {
  return false;
  }
}
  
public void upHeap() {
  Item aux;
  int auxUlt = ultimo;
  int n = auxUlt / 2;
  while (n != 0) {
    if (vetor[auxUlt].getChave() < vetor[n].getChave()) {
      aux = vetor[n];
      vetor[n] = vetor[auxUlt];
      vetor[auxUlt] = aux;
      auxUlt = n;
      n = n / 2;
    } else {
break;
    }
  }
}
  
public void downHeap() {
  int n = 1;
  Item aux;
  while (n != ultimo) {
    if (hasLeft(n) && hasRight(n)) {
      if (vetor[n * 2].getChave() < vetor[n * 2 + 1].getChave()) {
        aux = vetor[n * 2];
        vetor[n * 2] = vetor[n];
        vetor[n] = aux;
        n = n * 2;
} 
      else if (vetor[n * 2].getChave() > vetor[n * 2 + 1].getChave()) {
        aux = vetor[n * 2 + 1];
        vetor[n * 2 + 1] = vetor[n];
        vetor[n] = aux;
        n = n * 2 + 1;
      } else {
        break;
  }
} 
    else if (hasLeft(n)) {
      if (vetor[n].getChave() > vetor[n * 2].getChave()) {
        aux = vetor[n * 2];
        vetor[n * 2] = vetor[n];
        vetor[n] = aux;
        n = n * 2;
      } else {
        break;
  }

    } else if (hasRight(n)) {
      if (vetor[n].getChave() > vetor[n * 2 + 1].getChave()) {
        aux = vetor[n * 2 + 1];
        vetor[n * 2 + 1] = vetor[n];
        vetor[n] = aux;
        n = n * 2 + 1;
      } else {
        break;
      }
    } else {
      break;
    }
  }
}

  public Boolean hasLeft(int i) {
    if (vetor[i * 2] != null) {
      return true;
    } else {
      return false;
  }
}
  
public Boolean hasRight(int i) {
  if (vetor[i * 2 + 1] != null) {
  return true;
  } else {
    return false;
  }
}

  public void showHeap() {
    System.out.println("Heap:");
    for (int i = 1; i <= size(); i++) {
      System.out.print(vetor[i].getChave());
      System.out.print("[");
      System.out.print(vetor[i].getElemento());
      System.out.print("] ");
    }
    System.out.println();
  }
}
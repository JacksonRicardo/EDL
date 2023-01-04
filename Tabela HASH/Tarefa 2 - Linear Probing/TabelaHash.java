package hash;

/*
*UTILIZANDO HASH LINEAR PROBING
*Estrutura de Dados Lineares
*/

public class TabelaHash {

    private Item vetor[];
    private int tamanho;
    private int tamanho_atual;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        vetor = new Item[tamanho];
        tamanho_atual = 0;
    }

    public Object findElement(int k) {
        int h = (k % tamanho);
        int cont = 0;
        do {
            if (vetor[h] == null) {
                return "NO_SUCH_KEY";
            } else if (vetor[h].getChave() == k) {
                return vetor[h].getElemento();
            } else {
                h = ((h + 1) % tamanho);
            }
            cont++;
        } while (cont <= size());
        return "NO_SUCH_KEY";
    }

    public void insertItem(int k, Object o) {
        int h = (k % tamanho);
        int cont = 0;
        if (size() == tamanho) {
            System.out.println("Tabela cheia. Dobrando o tamanho...");
            tamanho = tamanho * 2;
            TabelaHash aux = new TabelaHash(tamanho);
            for (int i = 0; i < size(); i++) {
                aux.insertItem(vetor[i].getChave(),
                        vetor[i].getElemento());
            }
            vetor = aux.getVetor();
        }
        do {
            if (vetor[h] == null || vetor[h].getElemento() == "AVAILABLE") {
                Item i = new Item(k, o);
                vetor[h] = i;
                break;
            }
            h = ((h + 1) % tamanho);
            cont++;
        } while (cont <= size());
        tamanho_atual++;
    }

    public Object removeElement(int k) {
        int h = (k % tamanho);
        int cont = 0;
        do {
            if (vetor[h] == null) {
                return "NO_SUCH_KEY";
            } else if (vetor[h].getChave() == k) {
                Object aux = vetor[h].getElemento();
                vetor[h].setChave(0);
                vetor[h].setElemento("AVAILABLE");
                tamanho_atual--;
                return aux;
            } else {
                h = ((h + 1) % tamanho);
            }
            cont++;
        } while (cont <= size());
        return "NO_SUCH_KEY";
    }

    public int size() {
        return tamanho_atual;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int[] keys() {
        int[] chaves = new int[size()];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                chaves[cont] = vetor[i].getChave();
                cont++;
            }
        }
        return chaves;
    }

    public Object[] elements() {
        Object[] elementos = new Object[size()];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                elementos[cont] = vetor[i].getElemento();
                cont++;
            }
        }
        return elementos;
    }

    public Item[] getVetor() {
        return vetor;
    }

    public void showTabela() {
        System.out.println("Tabela:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == null || vetor[i].getElemento() == "AVAILABLE") {
                System.out.print("[");
                System.out.print("-");
                System.out.print("] ");
            } else {
                System.out.print(vetor[i].getChave());
                System.out.print("[");
                System.out.print(vetor[i].getElemento());
                System.out.print("] ");
            }
        }
        System.out.println();
    }
}

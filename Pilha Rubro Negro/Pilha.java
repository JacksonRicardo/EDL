package pilha;

/**
 *
 * @author jackson ricardo (20181014040004)
 */
public class Pilha {

    private Object arrayPilha[];
    private int indiceTopoVermelho = -1;
    private int indiceTopoPreto;

    /*Criando o Array*/
    public Pilha(int capacidade) {
        arrayPilha = new Object[capacidade];
        indiceTopoPreto = capacidade;
    }

    /*Instânciandoo o Array*/
    public Object[] getPilha() {
        return arrayPilha;
    }

    /*retorna o número de lementos armazenados*/
    public int size() {
        return indiceTopoVermelho + arrayPilha.length - indiceTopoPreto;
    }

    public int capacity() {
        return arrayPilha.length;
    }

    /*indica se há ou não elementos na Pilha*/
    public boolean isEmpty() {
        if (indiceTopoVermelho == -1 && indiceTopoPreto == arrayPilha.length) {
            return true;
        } else {
            return false;
        }

    }

    /*retorna o último elemento inserido sem removê-lo do Red*/
    public Object topRed() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha Vazia.");
        } else if (indiceTopoVermelho == -1) {
            throw new EPilhaVazia("Pilha Vermelha Vazia.");
        } else {
            return arrayPilha[indiceTopoVermelho];
        }

    }

    /*retorna o último elemento inserido sem removê-lo do Black*/
    public Object topBlack() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha Vazia.");
        } else if (indiceTopoPreto == arrayPilha.length) {
            throw new EPilhaVazia("Pilha Preta Vazia.");
        } else {
            return arrayPilha[indiceTopoPreto];
        }

    }

    /*insere um elemento red*/
    public void pushRed(Object o) {
        if (indiceTopoVermelho - indiceTopoPreto == -1) {
            Object aux[] = new Object[capacity() * 2];
            for (int i = 0; i <= indiceTopoVermelho; i++) {
                aux[i] = arrayPilha[i];
            }
            for (int i = arrayPilha.length - 1; i >= indiceTopoPreto; i--) {
                aux[i + (aux.length - arrayPilha.length)] = arrayPilha[i];
            }
            System.out.println("\nIncrementado: " + (aux.length - arrayPilha.length) + "\n");
            indiceTopoPreto = indiceTopoPreto + (aux.length - arrayPilha.length);
            arrayPilha = aux;
        }
        arrayPilha[++indiceTopoVermelho] = o;
    }

    /*insere um elemento no Black*/
    public void pushBlack(Object o) {
        if (indiceTopoVermelho - indiceTopoPreto == -1) {
            Object aux[] = new Object[capacity() * 2];
            for (int i = 0; i <= indiceTopoVermelho; i++) {
                aux[i] = arrayPilha[i];
            }
            for (int i = arrayPilha.length - 1; i >= indiceTopoPreto; i--) {
                aux[i + (aux.length - arrayPilha.length)] = arrayPilha[i];
            }
            System.out.println("\nIncrementado: " + (aux.length - arrayPilha.length) + "\n");

            indiceTopoPreto = indiceTopoPreto + (aux.length - arrayPilha.length);
            arrayPilha = aux;
        }
        arrayPilha[--indiceTopoPreto] = o;

    }

    /*remove e returna o último elemento inserido do Red*/
    public Object popRed() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha Vazia.");
        } else if (indiceTopoVermelho == -1) {
            throw new EPilhaVazia("Pilha Vermelha Vazia.");
        } else {
            arrayPilha[indiceTopoVermelho] = null;
            return arrayPilha[indiceTopoVermelho--];
        }
    }

    /*remove e returna o último elemento inserido do Black*/
    public Object popBlack() throws EPilhaVazia {
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha Vazia.");
        } else if (indiceTopoPreto == arrayPilha.length) {
            throw new EPilhaVazia("Pilha Preta Vazia.");
        } else {
            arrayPilha[indiceTopoPreto] = null;
            return arrayPilha[indiceTopoPreto++];
        }
    }

}

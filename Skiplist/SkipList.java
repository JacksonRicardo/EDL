
import java.util.ArrayList;
import java.util.List;

    //Classe SkipList
public class SkipList {
    private SkipNo head;
    private SkipNo tail;


    public SkipList() {
        head = new SkipNo(Integer.MIN_VALUE);
        tail = new SkipNo(Integer.MAX_VALUE);

        head.right = tail;
        tail.left = head;
    }

    public SkipNo pesquisa(int val) {
        SkipNo atual = head;

        while (atual != null) {
            while (atual.right != null && atual.right.val <= val) {
                atual = atual.right;
            }

            if (atual.val == val) {
                break;
            }

            atual = atual.down;
        }

        return atual;
    }

    public boolean inserir(int data) {
        List<SkipNo> pointersUpdate = new ArrayList<>();

        SkipNo atual = head;
        while (atual != null) {
            while (atual.right != null && atual.right.val < data) {
                atual = atual.right;
            }

            pointersUpdate.add(atual);
            atual = atual.down;
        }

        // insira após este nó.
        int level = 0;
        SkipNo novoNo = null;

        while (level == 0 || virar()) {
            // now move up.
            if (novoNo == null) {
                novoNo = new SkipNo(data);
            } else {
                novoNo = new SkipNo(novoNo);
            }

            SkipNo noUpdate;

            if (pointersUpdate.size() <= level) {
                createNew();
                noUpdate = this.head;
            } else {
                noUpdate = pointersUpdate.get(pointersUpdate.size() - level - 1);
            }

            // inserçao
            novoNo.right = noUpdate.right;
            novoNo.left = noUpdate;

            novoNo.right.left = novoNo;
            noUpdate.right = novoNo;

            level++;
        }

        return true;
    }

    public boolean remove(int data) {
        List<SkipNo> pointersUpdate = new ArrayList<>();

        SkipNo atual = this.head;
        while (atual != null) {
            while (atual.right != null && atual.right.val < data) {
                atual = atual.right;
            }

            if (atual.right.val == data) {
                pointersUpdate.add(atual);
            }

            atual = atual.down;
        }

        for (int i = 0; i < pointersUpdate.size(); i++) {
            SkipNo noUpdate = pointersUpdate.get(i);
            SkipNo noDelete = noUpdate.right;

            noUpdate.right = noDelete.right;
            noDelete.right.left = noUpdate;

            noDelete.up = null;
            noDelete.down = null;
        }

        return true;
    }

    private void createNew() {
        SkipNo newHead = new SkipNo(Integer.MIN_VALUE);
        SkipNo newTail = new SkipNo(Integer.MAX_VALUE);

        newHead.right = newTail;
        newTail.left = newHead;

        head.up = newHead;
        newHead.down = head;
        head = newHead;

        tail.up = newTail;
        newTail.down = tail;
        tail = newTail;
    }

    private boolean virar() {
        return Math.random() >= 0.5;
    }

    public void print() {
        SkipNo atual = this.head;

        while (atual.down != null) {
            atual = atual.down;
        }

        atual = atual.right;

        while (atual.right != null) {
            System.out.print(atual.val + " ");
            atual = atual.right;
        }

        System.out.println();
    }

    public void imprimir() {
        SkipNo atual = this.head;

        while (atual != null) {
            SkipNo first = atual;
            first = first.right;

            while (first.right != null) {
                System.out.print(first.val + " ");
                first = first.right;
            }

            atual = atual.down;
            System.out.println();
        }
    }
}

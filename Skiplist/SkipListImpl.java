
//Para realizar os testes
public class SkipListImpl {

    public static void main(String[] args) {
        SkipList list = new SkipList();
        list.inserir(5);
        list.inserir(10);
        list.inserir(9);
        list.inserir(8);
        list.inserir(12);
        list.inserir(1);
        list.inserir(50);
        list.inserir(60);
        list.inserir(70);
        list.inserir(90);

        list.print();
        SkipNo node = list.pesquisa(9);
        System.out.println(node.val);
        //list.printAllLevel();

        list.remove(10);
        list.remove(1);
        list.print();
        //list.printAllLevel();
    }
}

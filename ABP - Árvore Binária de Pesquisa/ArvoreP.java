package arvorep;
/**
 *
 * @author jacks
 */

//classe Main
public class ArvoreP {
        public static void main(String[] args) {
        ArvoreBinaria nova = new ArvoreBinaria(10);
        nova.adicionar(5);
        nova.adicionar(15);
        nova.adicionar(2);
        nova.adicionar(8);
        nova.adicionar(22);
        nova.adicionar(25);
        nova.display();
        System.out.println("-----------------------------------" + nova.getSize());
        try {
            nova.remover(5);
        } catch (ElemNaoEncontradoException e) {
            e.printStackTrace();
        }
        nova.display();
        System.out.println("-----------------------------------" + nova.getSize());
    }
}

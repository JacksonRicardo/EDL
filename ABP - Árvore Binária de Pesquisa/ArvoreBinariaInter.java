package arvorep;

import java.util.ArrayList;
/**
 *
 * @author jacks
 */
//interface ArvoreBinariaInter
public interface ArvoreBinariaInter {
    public boolean adicionar(Object elem);
    public No buscar(Object elem, No raiz);
    public void remover(Object elem) throws ElemNaoEncontradoException;
    public ArrayList<No> nos(int mode);
    public int height(No no);
    public int profundidade(No no);
    public boolean isRoot(No no);
    public boolean containsChildEsquerdo(No no);
    public boolean containsChildDireito(No no);
    public int countChilds(No no);
    public boolean isExternal(No no);
    public void display();
}
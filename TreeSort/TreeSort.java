package treesort;

import java.util.Scanner;

//Classe contendo filho esquerdo e direito do nó atual e valor da chave(data)
class Arvore_no{
    int data;
    Arvore_no left, right;
}

public class TreeSort{
    Arvore_no root;
    //declarando nó raiz
    int array[]=new int [20], n;
    //declarando funções membros públicas
    void accept(){
        int i;
        Scanner sc = new Scanner(System.in);
        //pega o númeero de elementos
        System.out.println("Digite o número de elementos: ");
        n = sc.nextInt();
        //pega os elementos do array
        System.out.println("Digite os elementos do array: ");
        for(i=0; i<n; i++)
            array[i]=sc.nextInt();
        //imprimindo o array não ordenado 
        System.out.println("O Array não ordenado é: ");
        for(i=0; i<n; i++)
            System.out.println(array[i]+" ");
    }
    void insert_no(int x){
        Arvore_no p, ptr, str;
        //p=(bs_node*)malloc(sizeof(bst_node));
        p=new Arvore_no();
        p.data=x;
        
        /*Se a árvore estiver vazia,
        retornar um novo nó */
        p.left=p.right=null;
        str=ptr=root;
        while(ptr!=null){
           str=ptr;
           
        /*Caso contrário, 
        voltar a descer a árvore*/ 
           if(x<ptr.data)
               ptr=ptr.left;
           else
               ptr=ptr.right;
        }
    if(x<str.data)
        str.left=p;
    else
        str.right=p;
}
    //Função para fazer a travessia em ordem
    //primeiro a esquedrda e depois a direita
        void inorder (Arvore_no root)
        {
            if (root!=null)
            {
                inorder(root.left);
                System.out.print(root.data+ " ");
                inorder(root.right);
            }
        }
        
        void sort()
        {
            int i;
            root=new Arvore_no();
            root.data=array[0];
            root.left=root.right=null;
            for (i=1; i<n; i++)
                insert_no(array[i]);
            System.out.println("\nO Array ordenado é: \n");
            inorder(root);
        }
//Função principal
    public static void main(String[] args) {
        TreeSort t=new TreeSort();
        //pega a entrada do usuário
        t.accept();
        //ordenando o array
        t.sort();
    }
}

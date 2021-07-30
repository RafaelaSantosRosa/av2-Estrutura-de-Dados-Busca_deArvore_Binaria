
public class Executa {

    public static void main(String[] args) {
        ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
 
        tree.insere(8);
        
        //Caso 1.1 Remover Raiz
        tree.remove(8);
        System.out.println("REMOVENDO NA RAIZ");
        System.out.println(tree);
        
               
        //Caso 1.2 Remover Raiz com Filho Esquerdo
        tree.insere(8);
        tree.insere(3);
        tree.remove(8);
        System.out.println("Removendo na raiz com filho esquerdo:");
        System.out.println(tree);
        tree.remove(3);
        
        //Caso 1.3 Remover Raiz com Filho Direito
        tree.insere(8);
        tree.insere(14);
        tree.remove(8);        
        System.out.println("Removendo na raiz com filho direito:");
        System.out.println(tree);
        tree.remove(14);
        
        
        tree.insere(8);
        tree.insere(3);
        tree.insere(14);                
        tree.remove(8);        
        System.out.println("Removendo na raiz com filho direito e esquerdo:");
        System.out.println(tree);
        tree.remove(14);
        tree.remove(3);
        
                
        tree.insere(8);
        tree.insere(3);
        tree.insere(10);                
        tree.insere(1);
        tree.insere(6);
        tree.insere(14);
        tree.insere(4);
        tree.insere(7);
        tree.insere(13);
        
        
        
        System.out.println("Árvore completa:");
        System.out.println(tree);   

        tree.remove(4);
        System.out.println("\nREMOVENDO FOLHA\n");
        System.out.println(tree);
        
        tree.remove(6);
        System.out.println("Removendo nó com apenas o filho direito:");
        System.out.println(tree);
        
        tree.remove(14);
        System.out.println("Removendo nó com apenas o filho esquerdo:");
        System.out.println(tree);
        
        tree.remove(3);
        System.out.println("Removendo nó com dois filhos:");
        System.out.println(tree);
        
        tree.remove(8);
        System.out.println("Imprimindo árvore resultante");
        System.out.println(tree);
        
        tree.remove(1);
        System.out.println("Imprimindo árvore resultante");
        System.out.println(tree);
        
        tree.remove(7);
        System.out.println("Imprimindo árvore resultante");
        System.out.println(tree);
        
        tree.remove(10);
        System.out.println("Imprimindo árvore resultante");
        System.out.println(tree);
        
        tree.remove(13);
        System.out.println("Imprimindo árvore resultante");
        System.out.println(tree);
        
        tree.insere(8);
        tree.insere(3);
        tree.insere(10);                
        tree.insere(1);
        tree.insere(6);
        tree.insere(14);
        tree.insere(4);
        tree.insere(7);
        tree.insere(13);
        
        System.out.println("Árvore completa:");
        System.out.println(tree);
        
        tree.remove(3);
        System.out.println("Removendo nó com dois filhos");
        System.out.println(tree);       
    }   
}

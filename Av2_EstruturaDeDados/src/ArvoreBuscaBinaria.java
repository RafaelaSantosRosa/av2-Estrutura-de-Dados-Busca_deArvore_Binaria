
public class ArvoreBuscaBinaria {
    private Nodo nodo;

    public ArvoreBuscaBinaria() {
        this.setNodo(null);
    }
    
    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public void insere(Nodo no, int valor) {
        if (no.getValor() == valor) {
            System.out.println("Já existe um nó com este valor!");
        } else if (no == null) {
            no.setValor(valor);
        } else {
            if (valor < no.getValor()) {
                if (no.getEsquerda() == null) {
                    Nodo novo = new Nodo(valor);
                    no.setEsquerda(novo);
                } else {
                    insere(no.getEsquerda(), valor);
                }
            } else {
                if (no.getDireita() == null) {
                    Nodo novo = new Nodo(valor);
                    no.setDireita(novo);
                } else {
                    insere(no.getDireita(), valor);
                }
            }

        }
    }

    public void insere(int valor) {
        if (this.getNodo() == null) {
            this.nodo = new Nodo(valor);
        } else {
            insere(this.nodo, valor);
        }

    }
    
    private void VerificaNo(Nodo no, Nodo pai, int valor){
        if (valor < no.getValor()) {
                if (no.getEsquerda() != null) {
                    remove(no.getEsquerda(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            } else {
                if (no.getDireita() != null) {
                    remove(no.getDireita(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            }
    }
    
    private void remocaoPorFilhoDiretoPai(Nodo no, Nodo pai){
        if(pai.getDireita() == no){
            pai.setDireita(null);               
        }
        else{
            pai.setEsquerda(null);
        }
    }
    
    public void remove(Nodo no, Nodo pai, int valor) {
        //verifica se o nó existe na árvore
        if (no.getValor() != valor) 
            VerificaNo(no, pai, valor);           
        
        //verifica se o nó em questao tem o mesmo valor a ser removido      
        else {
            Nodo aux = null;
            //remoção de folha
            if (no.getDireita() == null && no.getEsquerda() == null) 
                remocaoPorFilhoDiretoPai(no, pai);                            
            //nó possui 1 filho
            else if (no.getDireita() == null || no.getEsquerda() == null) 
                verificaSubarvores(no, pai);                     
            else
                remocaoNoComDoisFilhos(no, aux);
            
        }
    }
    
    public void verificaSubarvores(Nodo no, Nodo pai){
        if (no.getEsquerda() != null) 
            obtemAntecessor(no, pai);               
        else 
            obtemSucessor(no, pai);
                
    }
    
    private void obtemSucessor(Nodo no, Nodo pai){
        if(no == this.nodo)
            this.nodo = no.getDireita();
        else
        {
            if(no.getDireita() != null)
                pai.setDireita(no.getDireita());
            else
                pai.setDireita(no.getEsquerda());
        }
    }
    
    private void obtemAntecessor(Nodo no, Nodo pai){
        if(no == this.nodo)
            this.nodo = no.getEsquerda();
                    
        else
        {
            if(no.getEsquerda() != null)
                pai.setDireita(no.getEsquerda());
            else
                pai.setDireita(no.getDireita());
        }
    }
    
    private void remocaoNoComDoisFilhos(Nodo no, Nodo aux){
        aux = no.sucessor(no);
        no.setValor(aux.getValor());
        remove(no.getDireita(), no, aux.getValor());
    }
    
    public void remove(int valor) {
        //caso em que a arvore está vazia
        if (this.getNodo() == null)
            ; 
        //caso em que há apenas a nodo
        else if(this.getNodo().getValor() == valor && 
                this.getNodo().getEsquerda() == null && 
                this.getNodo().getDireita() == null)
        {
            this.nodo = null;
        }
        else {
           remove(this.getNodo(), this.getNodo(), valor);
        }
    }

    public String imprimeSubArvoreIn(Nodo no) {
        String ret;

        if (no == null) {
            return " ";
        }

        ret = "";
        ret = ret + this.imprimeSubArvoreIn(no.getEsquerda());
        ret = ret + no.toString();
        ret = ret + this.imprimeSubArvoreIn(no.getDireita());

        return ret;
    }

    @Override
    public String toString() {
        return this.imprimeSubArvoreIn(this.getNodo());
    }
}

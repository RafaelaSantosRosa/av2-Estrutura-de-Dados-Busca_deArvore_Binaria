public class Nodo {
    private int valor;
    private Nodo direita;
    private Nodo esquerda;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDireita() {
        return direita;
    }

    public void setDireita(Nodo direita) {
        this.direita = direita;
    }
    
    public Nodo getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    public Nodo() {
        
    }

    public Nodo(int valor){
        this.valor = valor;
    }
    
    public Nodo(int valor, Nodo direita, Nodo esquerda) {
        this.valor = valor;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public String toString() {
        return Integer.toString(this.getValor()); 
    }
    
    public Nodo sucessor(Nodo no)
    {
        Nodo sucessor = no;
        
        sucessor = sucessor.getDireita();
        
        while(sucessor.getEsquerda() != null)
            sucessor = sucessor.getEsquerda();
        
        return sucessor;
    }
    
    public Nodo antecessor(Nodo no)
    {
        Nodo antecessor = no;
        
        antecessor = antecessor.getEsquerda();
        
        while(antecessor.getDireita() != null)
        {
            antecessor = antecessor.getDireita();
        }
        
        return antecessor;
    }
}


    

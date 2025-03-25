package tentar;

public class Aviao {
    private int quantidade_avioes;
    private int assentos;
    private int quantidade_assentos;
   
    public Aviao(int quantidade_avioes, int assentos, int quantidade_assentos) {
        this.quantidade_avioes = quantidade_avioes;
        this.assentos = assentos;
        this.quantidade_assentos = quantidade_assentos;
        
        
    }

    public int getQuantidade_avioes() {
        return quantidade_avioes;
    }

    public void setQuantidade_avioes(int quantidade_avioes) {
        this.quantidade_avioes = quantidade_avioes;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    
    
    
    public int getQuantidade_assentos() {
        return quantidade_assentos;
    }
    
    public void setQuantidade_assentos(int quantidade_assentos) {
        this.quantidade_assentos = quantidade_assentos;
    }
    
    
}

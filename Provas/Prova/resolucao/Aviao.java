package resolucao;

class Aviao {
    private int numero;
    private int assentosDisponiveis;
    
    public Aviao(int numero, int assentosDisponiveis) {
        this.numero = numero;
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
    
    public boolean reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            return true;
        }
        return false;
    }
}

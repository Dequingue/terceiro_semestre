class Aviao {
    private int numero;
    private int capacidadeTotal;
    private int assentosDisponiveis;
    
    public Aviao(int numero, int capacidadeTotal) {
        this.numero = numero;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosDisponiveis = capacidadeTotal;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
    
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    //Verifica se ainda há assentos disponíveis
    //caso tenha, reduz a quantidade de assentos disponiveis
    //retorna para true que mostra que a reserva foi realizada com sucesso
    
    public boolean reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            return true;
        }
        return false;
    }
}

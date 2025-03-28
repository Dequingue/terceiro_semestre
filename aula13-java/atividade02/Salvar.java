package atividade02;

public class Salvar {
    private String nome;
    private String modelo;
    private int anoLancado;
    public Salvar(String nome, String modelo, int anoLancado) {
        this.nome = nome;
        this.modelo = modelo;
        this.anoLancado = anoLancado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoLancado() {
        return anoLancado;
    }
    public void setAnoLancado(int anoLancado) {
        this.anoLancado = anoLancado;
    }
    
    
    
}

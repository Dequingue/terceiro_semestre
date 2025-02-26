public class Carro {

    private String marca;
    private String modelo;
    private Integer anoFabricado;

    public Carro(String marca, String modelo, Integer anoFabricado){
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabricado=anoFabricado;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Integer getAnoFabricado(){
        return anoFabricado;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void SetAnoFabricado(Integer anoFabricado){
        this.anoFabricado=anoFabricado;
    }
    
}

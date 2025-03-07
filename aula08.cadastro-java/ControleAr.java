public class ControleAr {
    private String modelo;
    private String codigo;
    private String marca;
    private double btu;
    private String defeito;
    private String especificarDef;

    public ControleAr(String modelo, String codigo, String marca, double btu, String defeito, String especificarDef) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
        this.especificarDef = especificarDef;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getBtu() {
        return btu;
    }

    public void setBtu(double btu) {
        this.btu = btu;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getEspecificarDef() {
        return especificarDef;
    }

    public void setEspecificarDef(String especificarDef) {
        this.especificarDef = especificarDef;
    }

    
    public void exibiInfo(){
        System.out.println("Modelo: "+getModelo()+"\nCodigo: "+getCodigo()+
        "\nMarca: "+getMarca()+"\nBTU: "+getBtu()+"\nDefeito: "+getDefeito()+
        "\nEspecificar: "+getEspecificarDef());
    }
    
}

package modelo;

public class Pessoa {
    private String loginCD;
    private String senhaCD;
    public Pessoa(String loginCD, String senhaCD) {
        this.loginCD = loginCD;
        this.senhaCD = senhaCD;
    }
    public String getLoginCD() {
        return loginCD;
    }
    public void setLoginCD(String loginCD) {
        this.loginCD = loginCD;
    }
    public String getSenhaCD() {
        return senhaCD;
    }
    public void setSenhaCD(String senhaCD) {
        this.senhaCD = senhaCD;
    }

    
}

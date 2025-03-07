
public class FuncionarioApp {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Anderson",600,25);
        Gerente gerente = new Gerente("Carlos", 2000, 50, 200);
        System.out.println("Nome: "+funcionario.getNome()+"\nSalario: "+funcionario.getSalario());
        System.out.println("Nome: "+gerente.getNome()+"\nSalario: "+gerente.getSalario());
        
    }
}

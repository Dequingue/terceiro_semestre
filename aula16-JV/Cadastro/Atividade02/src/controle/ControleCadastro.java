package controle;

import java.util.ArrayList;

import dao.PessoaDAO;
import modelo.Pessoa;


public class ControleCadastro {
        private PessoaDAO pessoaDAO = new PessoaDAO();

    public void CadastroP(String loginCD, String senhaCD){
        Pessoa p = new Pessoa(loginCD, senhaCD);
        pessoaDAO.salvar(p);
    }

    public ArrayList<Pessoa> obterPessoa(){
        return pessoaDAO.listarTodos();
    }



    
}

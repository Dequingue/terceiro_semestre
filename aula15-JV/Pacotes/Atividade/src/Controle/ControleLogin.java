package Controle;

import dao.UsuarioDAO;

public class ControleLogin {
    private UsuarioDAO usuarioDAO;
        // construtor: cria o DAO
    public ControleLogin(){
        usuarioDAO = new UsuarioDAO();
    }    

// metodo que será chamado pela interface (view)
    public boolean autenticar(String login, String senha){
        return usuarioDAO.autenticar(login, senha);
    }
    
}

package controle;

import dao.UsuarioDAO;

public class ControleLogin {
    private UsuarioDAO usuarioDAO;

    public ControleLogin(){
        usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String login, String senha){
        return usuarioDAO.autenticar(login, senha);
    }
    
}

package controle;

import java.util.ArrayList;

import dao.UsuarioDAO;
import modelo.Usuario;

public class ControleLogin {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    
    public boolean Autenticar(String login, String senha){
        Usuario u  = new Usuario(login, senha);
        usuarioDAO.salvar(u);
        return true;
    }
    public ArrayList<Usuario> obteUsuarios(){
           return usuarioDAO.listarTodos(); 
    }
}

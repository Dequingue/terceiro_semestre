package dao;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioDAO(){
        usuarios.add(new Usuario(null, null));
    }
    public boolean autenticar(String login, String senha){
        for (Usuario u : usuarios) {
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
    
}

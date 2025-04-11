package dao;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    //construtor: adiciona usuarios "Pre-cadastrados"
    public UsuarioDAO(){

        usuarios.add(new Usuario("admin","admin123"));
        usuarios.add(new Usuario("usuario","1234"));
    }
    //Verifica se o login e senha informados existem na lista
    public boolean autenticar(String login , String senha){
        for (Usuario u : usuarios) {
            if(u.getLogin().equals(login)&& u.getSenha().equals(senha)){
                return true;//usuario encontrado
            }
        }
        return false;//não encontrado
    }
}

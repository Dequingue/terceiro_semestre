package dao;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

   public void salvar(Usuario u){
    usuarios.add(u);
   }
   public ArrayList<Usuario> listarTodos(){
        return usuarios;
   }
    
}

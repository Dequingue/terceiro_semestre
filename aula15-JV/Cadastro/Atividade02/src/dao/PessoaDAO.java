package dao;

import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void salvar(Pessoa p){
        pessoas.add(p);
        
    }
    public ArrayList<Pessoa> listarTodos(){
        return pessoas;
    }
}

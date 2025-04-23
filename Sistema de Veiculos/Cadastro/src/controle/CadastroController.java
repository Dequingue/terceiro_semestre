package controle;

import java.util.ArrayList;

import dao.CadastroDAO;
import modelo.Carro;
import modelo.Moto;

public class CadastroController {
    private CadastroDAO dao;
    public CadastroController(){

        dao = new CadastroDAO();
    }

    public void cadastrarC(String marca, String modelo, String nPortas){
        Carro c = new Carro(marca, modelo, nPortas);
        dao.adicionarC(c);
    }

    public void cadastrarM(String marca, String modelo, String cilidranda){
        Moto m = new Moto(marca, modelo, cilidranda);
        dao.adicionarM(m);
    }

    public ArrayList<Carro> listarC(){
        return dao.listarC();
    }

    public ArrayList<Moto> listarM(){
        return dao.listaM();
    }

    public boolean autenticar(String marca, String modelo, String nPortas, String cilidranda){
        return dao.autenticar(marca,modelo,nPortas,cilidranda);
    }
    
}

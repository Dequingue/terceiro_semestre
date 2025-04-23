package dao;

import modelo.*;
import java.util.ArrayList;

public class CadastroDAO {
    private  ArrayList<Carro> carros = new ArrayList<>();
    private ArrayList<Moto> motos = new ArrayList<>();

    public void adicionarC(Carro c){
        carros.add(c);
    }
    public ArrayList<Carro> listarC(){
        return carros;
    }


    public void adicionarM(Moto m){
        motos.add(m);
    }
    public ArrayList<Moto> listaM(){
        return motos;
    }
    public boolean autenticar(String marca, String modelo, String nPortas, String cilidranda) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticar'");
    }
}

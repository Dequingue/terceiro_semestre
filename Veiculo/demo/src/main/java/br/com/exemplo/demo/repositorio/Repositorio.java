package br.com.exemplo.demo.repositorio;

import java.util.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.com.exemplo.demo.modelo.Veiculo;

@Repository
public interface Repositorio extends CrudRepository <Veiculo, Integer> {

    @SuppressWarnings("null")
    List <Veiculo> findAll();

    Veiculo findByCodigo(int codigo);
}

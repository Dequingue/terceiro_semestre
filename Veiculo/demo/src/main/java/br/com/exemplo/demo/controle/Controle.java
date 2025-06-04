package br.com.exemplo.demo.controle;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.demo.modelo.Veiculo;
import br.com.exemplo.demo.repositorio.Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class Controle {
    
//Localhost:8080
@GetMapping("")
public String mensagem() {
    return "Olá Mundo";
}

// localhost:8080/boasVindas
@GetMapping("/boasVindas")
public String getMethodName() {
    return "Seja bem vindo";
}

// localhost:8080/boasVindas/{nome}
@GetMapping("/boasVindas/{nome}")
public String getMethodName(@PathVariable String nome) {
    return "Seja bem vindo " + nome;
}

@PostMapping("/Veiculo")
public Veiculo veiculo(@RequestBody Veiculo v) {
    
    return v;
}

// Maven (Dependencia)
// mysql / data-jpa
@Autowired
private Repositorio acao;

// metodo cadastrar carro
@PostMapping("/demo")
public Veiculo cadastrar(@RequestBody Veiculo obj) {
    
    return acao.save(obj);
}

// metodo listar carros
@GetMapping("/demo")
public List<Veiculo> selecionar() {
    
    return acao.findAll();
}
// metodo selecionar carro
@GetMapping("/demo/{codigo}")
public Veiculo selecionarCodigo(@PathVariable int codigo) {
    
    return acao.findByCodigo(codigo);

}

//metodo atualizar carro
@PutMapping("/demo")
public Veiculo atualizar (@RequestBody Veiculo obj) {    
    return acao.save(obj);
}

//metodo excluir carro
//verifica no thunder os veiculos cadastrados, depois
//seleciona o veiculo no DELETE e exclui
@DeleteMapping("/demo/{codigo}")
public void remover(@PathVariable int codigo) {
    Veiculo obj = acao.findByCodigo(codigo);
    acao.delete(obj);
}
    
}
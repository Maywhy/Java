package br.org.generation.ExercicioSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.ExercicioSpringBoot.model.Produto;
import br.org.generation.ExercicioSpringBoot.model.Usuario;


@RestController
public class ControllerTeste {
	
	@GetMapping("/bemvindo")
	public String BemVindo() {
		return "Seja Bem-vindo a loja dos sonhos Gamer's.";
	}
	
	@GetMapping("/produto") 
	public String produto() {
		
		Produto p = new Produto();
		p.id = 1;
		p.titulo = "Produto";
		p.detalhes = "Processador i9 9900k, 32GB RAM, Placa de Video 2080Ti";
		p.preco = "R$ 30.000";
		p.qtdEstoque = 10;
		p.linkFoto = "link";
		
		return p.toString();
	}
	
	@GetMapping("/usuario")
	public String Usuario() {
		
		Usuario u = new Usuario();
		u.id = 2;
		u.login = "maywhy";
		u.email = "maywhy.maywhy@gamer.com";
		u.nomeCompleto = "Maywhy Gamer";
		u.senha = "abcd1234";
		u.perfilAcesso = "Acesso total";
		
		return u.toString();
	}
}
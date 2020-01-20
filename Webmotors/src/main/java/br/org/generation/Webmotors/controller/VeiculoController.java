package br.org.generation.Webmotors.controller;


import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.Webmotors.model.Cliente;
import br.org.generation.Webmotors.model.Veiculo;

public class VeiculoController {
	// faz com que o browser enxergue essa conotação como o controller de navegação
	
	@RestController
	public class VericuloController{
		// associa/vincula a URL ao metodo http://localhost/veiculo/teste
		
		@GetMapping("/veiculo/teste")
		public Veiculo testeVeiculo() {
			Veiculo v = new Veiculo();
			v.setId(123);
			v.setMarca("Honda");
			v.setAno(2020);
			v.setCor("preto");
			v.setModelo("CRV");
			v.setTipo("Luxo");
			v.setDetalhes("8 Cilindros, Cambio Automatico, banco de couro");
			return v;
		}
	}
	
	private BDVeiculo bd = new BDVeiculo();
	
	@PostMapping()
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo){
		
	}
	
	
}

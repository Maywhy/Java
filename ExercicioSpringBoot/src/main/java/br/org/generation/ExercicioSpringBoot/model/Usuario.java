package br.org.generation.ExercicioSpringBoot.model;

public class Usuario {

	public String 	Usuario;
	public int 		id;
	public String 	login;
	public String 	email;
	public String 	nomeCompleto;
	public String 	senha;
	public String 	perfilAcesso;

	@Override
	public String toString() {
		return "{id: " + id + ", login: " + login + ", Email: " + email + ", nomeCompleto: " + nomeCompleto
				+ ", senha: " + senha + ", Perfil Acesso: " + perfilAcesso + "}";
	}
}
package br.org.generation.ExercicioSpringBoot.model;

public class Produto {

	public String 	Produto;
	public int 		id;
	public String	 titulo;
	public String 	detalhes;
	public String 	preco;
	public int 		qtdEstoque;
	public String 	linkFoto;

	@Override
	public String toString() {
		return "{id: " + id + ", titulo: " + titulo + ", detalhes: " + detalhes + ", preco: " + preco + ", qtdEstoque: "
				+ qtdEstoque + ", linkFoto: " + linkFoto + "}";
	}
}

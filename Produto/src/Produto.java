public class Produto {
	
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qtdEstoque;
	
	//public Produto(String id, String nome, String detalhes, float preco, float qtdEstoque) {
		
	//}
	
	public Produto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id <= 0) {
			throw new RuntimeException("ID deve ser um numero inteiro");
		}
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new RuntimeException("Nome nao pode ser vazio");
		}
		this.nome = nome;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		if (detalhes == null || detalhes.length() == 0) {
			throw new RuntimeException("Detalhes nao pode ser vazio");
		}
		this.detalhes = detalhes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if(preco <= 0 ) {
			throw new RuntimeException("Preco precisa ter  valor positivo");
		}
		this.preco = preco;
	}

	public float getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(float qtdEstoque) {
		if(preco < 0 ) {
			throw new RuntimeException("Quantidade em estoque nao pode ser menor que zero");
		}
		this.qtdEstoque = qtdEstoque;
	}
	
	public String ToString() {
		return this.id+";"+this.nome+"R$ "+this.preco+" ()"+this.qtdEstoque;
	}
}
import java.util.Scanner;

public class Cadastro {
	public static void main(String args[]) {
	
	Produto lista[] = new Produto[5];
	int posicao;
	Scanner teclado = new Scanner(System.in);
	posicao = 0;
	
	do {
		try {
			System.out.println("--- Posicao "+posicao);
			Produto p = new Produto();
			
			System.out.println("Digite o ID do Produto");
			int id = Integer.parseInt(teclado.nextLine());
			p.setId(id);
			
			System.out.println("Digite o nome do produto");
			String nome = teclado.nextLine();
			p.setNome(nome);
			
			System.out.println("Digite os detalhes do produto");
			String detalhes = teclado.nextLine();
			p.setDetalhes(detalhes);
		
			
			System.out.println("Digite o preco do produto");
			float preco = Float.parseFloat(teclado.nextLine());
			p.setPreco(preco);
			
			System.out.println("Digite a quantidade em estoque");
			float qtdEstoque = Float.parseFloat(teclado.nextLine());
			p.setQtdEstoque(qtdEstoque);
			
			lista[posicao] = p;
			posicao++;
			
			} catch (Exception ex) {
				System.out.println("----> Ops... erro ao cadastrar");
				System.out.println("MOTIVO: "+ex.getMessage());
			}
		
		} while (posicao < 5);
	}

}
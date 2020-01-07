import java.util.Scanner;

public class URI1143QuadradoeCubo {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int n, soma;

		n = teclado.nextInt();

		for (soma = 1; soma <= n; soma++) System.out.print(soma + " " + soma * soma + " " + soma * soma * soma + " \n");
			
		}
}

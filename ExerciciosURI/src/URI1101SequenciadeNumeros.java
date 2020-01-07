import java.util.Scanner;

public class URI1101SequenciadeNumeros {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int menor, maior, sub, soma, res;

		menor = teclado.nextInt();
		maior = teclado.nextInt();

		if (menor != 0 && maior != 0) {
			if (menor > maior) {
				sub = maior;
				maior = menor;
				menor = sub;
			}

			res = menor;
			soma = res;

			for (int i = 0; i < (maior - menor); i++) {
				System.out.print(res);
				res++;
				soma = res + soma;
			}
			System.out.print(res + " Sum=" + soma);
			teclado.close();
		}
	}
}

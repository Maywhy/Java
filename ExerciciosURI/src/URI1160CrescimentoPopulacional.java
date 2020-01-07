import java.util.Scanner;

public class URI1160CrescimentoPopulacional {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int qtdC = teclado.nextInt();
		int res[] = new int[qtdC];

		for (int i = 0; i < qtdC; i++) {
			float C[] = new float[4];

			for (int n = 0; n < 4; n++) {
				C[n] = teclado.nextFloat();
			}

			int contador = 0;

			while (C[0] <= C[1])
				;
			C[0] = C[0] + (int) (C[0] * (C[2] / 100));
			C[1] = C[1] + (int) (C[1] * (C[3] / 100));
			contador++;
			res[i] = contador;
		}

		for (int i = 0; i < qtdC; i++) {
			if (res[i] > 100) {
				System.out.print("Mais de 1 seculo.\n");
			} else {
				System.out.print(res[i] + " anos.\n");
			}
		}
	}
}
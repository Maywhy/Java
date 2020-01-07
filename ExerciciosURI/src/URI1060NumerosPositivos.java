import java.util.Scanner;

public class URI1060NumerosPositivos {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		float valores[] = new float[6];
		int valor = 0;

		for (int v = 0; v < 6; v++) {
			valores[v] = teclado.nextFloat();
			if (valores[v] > 0) {
				valor++;
			}
		}
		System.out.print(valor + " valores positivos");
		teclado.close();
	}
}

import java.util.Scanner;

public class URI1047TempoJogo {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int hrinicio, mininicio, hrfim, minfim, hora = 0, minuto = 0;

		hrinicio = teclado.nextInt();
		mininicio = teclado.nextInt();
		hrfim = teclado.nextInt();
		minfim = teclado.nextInt();

		if (hrfim == hrinicio && minfim == mininicio) {
			hora = 24;
			minuto = 0;
		} else {
			if (minfim < mininicio) {
				minfim = minfim + 60;
				hrfim = hrfim - 1;
			} else {
				minuto = minfim - mininicio;
				if (hrfim < hrinicio) {
					hora = (24 - hrinicio) + hrfim;
				} else {
					hora = hrfim - hrinicio;
				}
			}
		}
		System.out.print("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");

		teclado.close();
	}
}

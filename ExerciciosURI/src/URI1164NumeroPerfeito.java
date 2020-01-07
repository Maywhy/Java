import java.util.Scanner;

public class URI1164NumeroPerfeito {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int valor, soma;
		
			valor = teclado.nextInt();
			
			for (valor = 1 ; valor <= 1000 ; valor++){
				if (valor % valor == 0) {
					System.out.print(valor + " eh perfeito ");	
				}
				else {
					System.out.print(valor + " nao eh perfeito ");
				}
				teclado.close();
			}	
	}
}

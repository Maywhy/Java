import java.util.Scanner; 

public class URI1044Multiplos {
	
	public static void main (String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a, b;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		if (b % a == 0) {
			System.out.print("Sao Multiplos");
		}
		else {
			System.out.print("Nao sao Multiplos");
			
			teclado.close();
		}
	}
}

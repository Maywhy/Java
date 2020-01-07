import java.util.Scanner;

public class URI1017 {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double tempo, distancia, litro, velocidade;
		
		
		tempo = teclado.nextDouble();
		
		velocidade = teclado.nextDouble();
		distancia = tempo * velocidade;
		litro = distancia / 12;
		System.out.printf("%.3f\n", litro);
		
	}

}
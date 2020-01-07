// adicionando uma biblioteca 
// Classe Scanner do pacote java.util
import java.util.Scanner;

public class URI1012 {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double a, b, c, areaTrapezio,triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		
		System.out.print("Digite o primeiro valor: ");
		a = teclado.nextDouble();
		System.out.print("Digite o segundo valor:  ");
		b = teclado.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		c = teclado.nextDouble();
		
		triangulo = a * c / 2;
		circulo = pi * c * c;
		areaTrapezio = a + b;
		trapezio = areaTrapezio * c / 2;
		quadrado = b * b;
		retangulo = a * b;
				
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
		
		teclado.close();
		
		
		
	}

}

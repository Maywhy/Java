import java.util.Scanner;

public class URI1045TiposdeTriangulos {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		float a, b, c, lado1, lado2, lado3;
		
		lado1 = teclado.nextFloat();
		lado2 = teclado.nextFloat();
		lado3 = teclado.nextFloat();
		
		if (lado1 > lado2 && lado1 > lado3)
			{
				a = lado1;
				if (lado2 > lado3) {
					b = lado2;
					c = lado3;		
					
				} else {
						c = lado3;
						b = lado2;
						}
		} else 
				{	
				if (lado2 > lado1 && lado2 > lado3)	
						{	
							a = lado2;
							if(lado1 > lado3) 
							{
								b = lado1;
								c = lado3;
							} else {
									b = lado3;
									c = lado1;
									}
								}
						else {		
							a = lado3;
							if(lado1 > lado2)
							{
								b = lado1;
								c = lado2;
							}
							else {
								c = lado1;
								b = lado2;
							}		
					}
				
				}
									
		if (a >= b + c) {
			System.out.print("NAO FORMA TRIANGULO\n");
		}
		else
		{
			if (a * a == b * b + c * c) {
				System.out.print("TRIANGULO RETANGULO\n");
			}
			
			if (a * a > b * b + c * c) {
				System.out.print("TRIANGULO OBTUSANGULO\n");
			}
			if (a * a < b * b + c * c) {
				System.out.print("TRIANGULO ACUTANGULO\n");
			}
			if (a == b && a == c && b == c) {
				System.out.print("TRIANGULO EQUILATERO\n");
			}
			if (a == b && a != c || b == c && b != a || a == c && a != b);
				System.out.print("TRIANGULO ISOCELES");
				teclado.close();
		}
	}
}

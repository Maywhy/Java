public class Hello {
	
	public static void main(String args[]){
		
		float salMin, qtdKw, valTotal, desc, valKw;
		
		salMin = Float.parseFloat(args[0]); 
		qtdKw  = Float.parseFloat(args[1]);
	
		valKw    = salMin / 700;
		valTotal = valKw * qtdKw;
		desc     = valTotal * 0.9f;
		
		System.out.println("Valor em reais de cada kw " + valKw);
		System.out.println("Valor em reais a ser pago " + valTotal );
		System.out.println("Valor com desconto de 10% " + desc);
		
	}
}

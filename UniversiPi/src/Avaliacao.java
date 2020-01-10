import java.util.Scanner;
public class Avaliacao {
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		String respostaUser;
		int acertos = 0;
		QuestaoSimples simulado [] = new QuestaoSimples [3];
		
		simulado [0] = new QuestaoSimples 			("Quanto e 1+1?", "2"); 
		simulado [1] = new QuestaoMultiplaEscolha  	("Quanto e 2+2", "4", "6", "8", "10", "12");
		simulado [2] = new QuestaoComDica  			("Quanto e 3+3", "6", "somar 1+1+1+1+1+1" );
		
		for (int i=0; i<simulado.length; i++) {
			System.out.println(simulado[i].aplicarQuestao());
			respostaUser = teclado.nextLine();
			if (simulado[i].corrigir(respostaUser)) {
				acertos++;
			}
		}
		System.out.println("Voce teve "+acertos+" acertos");
	}
}

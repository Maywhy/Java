public class QuestaoComDica extends QuestaoSimples {
	
	private String dica;
	
	public QuestaoComDica(String enunciado, String resp, String dica) {
		super(enunciado, resp);
		this.dica = dica;
	}
	public String aplicarQuestao() {
		String res = super.aplicarQuestao()+"\n"+ "somar 1+1+1+1+1+1";
		return res;
	}
	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}	
}

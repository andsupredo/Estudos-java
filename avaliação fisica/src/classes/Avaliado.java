package classes;

public class Avaliado {

	public String nome;
	public int idade;
	public double peso;
	public double altura;
	public String sexo;
	
	public Avaliado(String nome,int idade, double peso, double altura, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

	public double indiceMassaCorporal() {
		double new_altura = altura/100;
		double imc = (peso / ((new_altura * new_altura)));
		return imc;
	}

	public double gorudura(double triciptal, double subescapular, double peitoral, double axilar_media, double abdominal, double suprailiaca, double coxa) {

		double dc = 1.112 - 0.00043499 * (triciptal + subescapular + peitoral + axilar_media + abdominal + suprailiaca + coxa) + 0.00000055 * (triciptal + subescapular + peitoral + axilar_media + abdominal + suprailiaca + coxa) * 2 - 0.00028826 * idade;
		double percentual_gordura = ((4.95 / dc) - 4.50) * 100;
		        return percentual_gordura;
	}
}
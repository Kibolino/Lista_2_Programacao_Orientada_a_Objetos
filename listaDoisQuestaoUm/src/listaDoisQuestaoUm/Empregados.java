package listaDoisQuestaoUm;

public class Empregados {
	public String nome;
	public String sobrenome;
	public double salario;

	public Empregados(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;

		if (salario > 0.0) {
			this.salario = salario;
		} else {
			this.salario = 0.0;
		}
	}

	public double getSalarioAnual() {
		return this.salario * 12;
	}

	public void aumento() {
		this.salario = salario * 1.1;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSalario(double salario) {
		if (salario < 0.0) {
			this.salario = salario;
		} else {
			this.salario = 0.0;
		}
	}

	public double getSalario() {
		return this.salario;
	}

}

package listaDoisQuestaoCinco;

public class Ingresso {
	public double valor;

	public Ingresso(double valor) {
		this.valor = valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

	public String toString() {
		return String.format("%.2f", this.valor);
	}

	public double getValorFinal() {
		return this.valor;
	}

}

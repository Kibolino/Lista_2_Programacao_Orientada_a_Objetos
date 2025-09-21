package listaDoisQuestaoCinco;

public class IngressoVip extends Ingresso {
	public double valorAdicional;

	public IngressoVip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public double getValorFinal() {
		return super.getValor() + this.valorAdicional;
	}

	public String toString() {
		return String.format("%.2f", getValorFinal());
	}

}

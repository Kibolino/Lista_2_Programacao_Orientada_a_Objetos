package listaDoisQuestaoDois;

public class Fatura {
	public String numeroItem;
	public String descricaoItem;
	public int quantidadeComprada;
	public double precoUnitario;
	public double precoTotal;

	public Fatura(String numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario,
			double precoTotal) {
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
		if (quantidadeComprada > 0) {
			this.quantidadeComprada = quantidadeComprada;
		} else {
			this.quantidadeComprada = 0;
		}
		if (precoUnitario > 0) {
			this.precoUnitario = precoUnitario;
		} else {
			this.precoUnitario = 0;
		}

	}

	public double getFatura() {
		return quantidadeComprada * precoUnitario;
	}

	public void desconto(double porcentagem) {
		if (porcentagem > 0 && porcentagem <= 100) {
			double descontoAplicado = 1 - (porcentagem / 100);
			this.precoUnitario *= descontoAplicado;
		}
	}

	public void setNumeroItem(String numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getNumeroItem() {
		return this.numeroItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public String getDescricaoItem() {
		return this.descricaoItem;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		if (quantidadeComprada > 0) {
			this.quantidadeComprada = quantidadeComprada;
		} else {
			this.quantidadeComprada = 0;
		}
	}

	public int getQuantidadeComprada() {
		return this.quantidadeComprada;
	}

	public void setprecoUnitario(double precoUnitario) {
		if (precoUnitario > 0) {
			this.precoUnitario = precoUnitario;
		} else {
			this.precoUnitario = 0;
		}
	}

	public double getprecoUnitario() {
		return this.precoUnitario;
	}

}

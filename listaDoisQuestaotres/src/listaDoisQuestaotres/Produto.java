package listaDoisQuestaotres;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	public boolean comprado;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.comprado = false;
	}

	public double getValorTotal() {
		double valorTotal = this.preco * this.quantidade;
		double desconto = 0.0;

		if (valorTotal > 500) {
			desconto = 0.25;
		} else if (valorTotal > 200) {
			desconto = 0.20;
		} else if (valorTotal > 100) {
			desconto = 0.10;
		}

		double valorComDesconto = valorTotal * (1 - desconto);
		return valorComDesconto;
	}

	public void recibo() {
		if (this.comprado) {
			double valorFinal = getValorTotal();
			System.out.printf(" -> Nome do produto: %s%n", this.nome);
			System.out.printf(" -> Valor total a ser pago: R$ %.2f%n%n", valorFinal);
		} else {
			System.out.printf("O produto %s ainda não foi comprado.%n\n", this.nome);
		}
	}

	public void comprarProduto() {
		this.comprado = true;
		System.out.printf("Produto %s adicionado ao carrinho.%n", this.nome);
		recibo();
	}

}

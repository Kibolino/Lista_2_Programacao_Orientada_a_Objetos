package listaDoisQuestaotres;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Camisa Social Masculina", 48.80, 1);
		Produto produto2 = new Produto("SSD WD Green 480GB", 180.0, 1);
		Produto produto3 = new Produto("Micro-Ondas Philco 25L", 499.0, 1);
		Produto produto4 = new Produto("Notebook Gamer Acer Nitro", 5199.90, 1);

		produto1.recibo();
		produto1.comprarProduto();
		produto2.comprarProduto();
		produto3.comprarProduto();
		produto4.comprarProduto();

	}

}

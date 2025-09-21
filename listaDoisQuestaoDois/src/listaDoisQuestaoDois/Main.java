package listaDoisQuestaoDois;

public class Main {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("KAB0001","Mochila Masculina Grande Executiva", 450, 189,90);
		
		System.out.println("DETALHES DA FATURA");
		System.out.println("Número do Item: " + fatura1.getNumeroItem());
		System.out.println("Descrição: " + fatura1.getDescricaoItem());
		System.out.println("Quantidade: " + fatura1.getQuantidadeComprada());
		System.out.printf("Preço Unitário: R$ %.2f%n", fatura1.getprecoUnitario());
		System.out.printf("Valor Total da Fatura: R$ %.2f%n", fatura1.getFatura());
		
		System.out.println("\nDesconto Aplicado");
		
		fatura1.desconto(33);
		
		System.out.println("\nDETALHES DA FATURA COM DESCONTO");
		System.out.println("Número do Item: " + fatura1.getNumeroItem());
		System.out.println("Descrição: " + fatura1.getDescricaoItem());
		System.out.println("Quantidade: " + fatura1.getQuantidadeComprada());
		System.out.printf("Preço Unitário: R$ %.2f%n", fatura1.getprecoUnitario());
		System.out.printf("Valor Total da Fatura: R$ %.2f%n", fatura1.getFatura());

	}

}

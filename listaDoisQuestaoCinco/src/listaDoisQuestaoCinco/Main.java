package listaDoisQuestaoCinco;

public class Main {

	public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(100.00);
        Ingresso ingresso2 = new Ingresso(100.00);
        IngressoVip ingressoVip1 = new IngressoVip(100.00, 50.00);
        IngressoVip ingressoVip2 = new IngressoVip(100.00, 70.00);

        Evento showHeavyMetal = new Evento();
        showHeavyMetal.adicionarIngresso(ingresso1);
        showHeavyMetal.adicionarIngresso(ingresso2);
        showHeavyMetal.adicionarIngresso(ingressoVip1);
        showHeavyMetal.adicionarIngresso(ingressoVip2);

        System.out.println("\nIngressos Disponíveis");
        showHeavyMetal.ingressosNaoVendidos();

        System.out.println("\n>>> Realizando vendas...\n");
        showHeavyMetal.venderIngresso(ingresso1);
        showHeavyMetal.venderIngresso(ingressoVip2);
        showHeavyMetal.venderIngresso(ingresso1);

        showHeavyMetal.ingressosNaoVendidos();

        System.out.println("\nRelatório Financeiro");
        System.out.printf("Valor total arrecadado: R$ %.2f%n", showHeavyMetal.valorTotal());

	}

}

package listaDoisQuestaoCinco;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	private List<Ingresso> ingressosDisponiveis;
	private List<Ingresso> ingressosVendidos;

	public Evento() {
		this.ingressosDisponiveis = new ArrayList<>();
		this.ingressosVendidos = new ArrayList<>();
	}

	public void adicionarIngresso(Ingresso ingresso) {
		this.ingressosDisponiveis.add(ingresso);
	}

	public void venderIngresso(Ingresso ingresso) {
		if (this.ingressosDisponiveis.contains(ingresso)) {
			this.ingressosDisponiveis.remove(ingresso);
			this.ingressosVendidos.add(ingresso);
			System.out.println("Venda realizada com sucesso: " + ingresso);
		} else {
			System.out.println("Venda não realizada: Ingresso indisponível ou já vendido");
		}
	}

	public double valorTotal() {
		double total = 0.0;
		for (Ingresso ingresso : this.ingressosVendidos) {
			total += ingresso.getValorFinal();
		}
		return total;
	}

	public void ingressosNaoVendidos() {
		if (ingressosDisponiveis.isEmpty()) {
			System.out.println("Todos os ingressos foram vendidos");
		} else {
			for (Ingresso ingresso : this.ingressosDisponiveis) {
				System.out.println(ingresso);
			}
		}
	}
}
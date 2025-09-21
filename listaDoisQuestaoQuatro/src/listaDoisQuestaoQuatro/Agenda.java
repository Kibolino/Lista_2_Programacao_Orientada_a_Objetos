package listaDoisQuestaoQuatro;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contato> contatos;
	private String nomeAgenda;
	private String descricao;

	public Agenda(String nomeAgenda, String descricao) {
		this.nomeAgenda = nomeAgenda;
		this.descricao = descricao;
		this.contatos = new ArrayList<>();
	}

	public void adicionarContato(Contato contato) {
		this.contatos.add(contato);
		System.out.println("Contato '" + contato.getNome() + "' adicionado à agenda '" + this.nomeAgenda + "'.");
	}

	public void imprimirContatosDaAgenda() {
		System.out.println("\nContatos da Agenda: " + this.nomeAgenda);
		if (contatos.isEmpty()) {
			System.out.println("A agenda está vazia.");
		} else {
			for (Contato contato : contatos) {
				contato.imprimirContato();
			}
		}
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}
}
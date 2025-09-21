package listaDoisQuestaoQuatro;

public class Cliente {
	private String nomeCliente;
	private Agenda agenda;

	public Cliente(String nomeCliente, Agenda agenda) {
		this.nomeCliente = nomeCliente;
		this.agenda = agenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public Agenda getAgenda() {
		return agenda;
	}
}
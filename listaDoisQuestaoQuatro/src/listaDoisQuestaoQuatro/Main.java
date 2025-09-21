package listaDoisQuestaoQuatro;

public class Main {
	public static void main(String[] args) {
		Contato c1 = new Contato(1001, "Ana Silva", "ana_silva@gmail.com");
		Contato c2 = new Contato(2002, "Beto Costa");
		Contato c3 = new Contato(3003);
		Contato c4 = new Contato("98765432");

		System.out.println("Teste de contato com código inválido");
		Contato c5 = new Contato(100);
		System.out.println("\nTeste de contato com telefone inválido");
		Contato c6 = new Contato("12345");

		c1.setEndereco("Rua das Flores, 123");
		c1.setTelefone("12345678");
		c1.setObservacao("Caloteira");
		System.out.println();
		c1.imprimirContato();

		System.out.println("\nContato 'c1' está totalmente preenchido? " + c1.preenchido());
		System.out.println("Contato 'c2' está totalmente preenchido? " + c2.preenchido());

		Contato contatoDuplicado = c1.duplicar();
		System.out.println("\nContato Original:");
		c1.imprimirContato();
		System.out.println("\nContato Duplicado:");
		contatoDuplicado.imprimirContato();

		Agenda agendaPessoal = new Agenda("Pessoal", "Contatos de amigos e família");

		System.out.println();
		agendaPessoal.adicionarContato(c1);
		agendaPessoal.adicionarContato(contatoDuplicado);

		Cliente cliente = new Cliente("Fernando", agendaPessoal);
		System.out.println("\nCliente '" + cliente.getNomeCliente() + "' acessando sua agenda...");

		cliente.getAgenda().imprimirContatosDaAgenda();
	}
}
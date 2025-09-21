package listaDoisQuestaoQuatro;

public class Contato {
	public int codigo;
	public String nome;
	public String endereco;
	public String email;
	public String telefone;
	public String observacao;

	public Contato(int codigo) {
		this.setCodigo(codigo);
	}

	public Contato(int codigo, String nome) {
		this.setCodigo(codigo);
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		this.setCodigo(codigo);
		this.nome = nome;
		this.setEmail(email);
	}

	public Contato(String telefone) {
		this.setTelefone(telefone);
	}

	public Contato(int codigo, String nome, String endereco, String email, String telefone, String observacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.observacao = observacao;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void imprimirContato() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Observação: " + this.observacao);
	}

	public void setCodigo(int codigo) {
		if (codigo >= 1000 && codigo <= 9999) {
			this.codigo = codigo;
		} else {
			System.out.println("Código inválido!");
		}
	}

	public void setTelefone(String telefone) {
		if (telefone != null && telefone.matches("\\d{8}")) {
			this.telefone = telefone;
		} else {
			System.out.println("Telefone inválido!");
		}
	}

	public Contato duplicar() {
		return new Contato(this.codigo, this.nome, this.endereco, this.email, this.telefone, this.observacao);
	}

	public boolean preenchido() {
		return this.codigo >= 1000 && this.nome != null && !this.nome.isEmpty() && this.endereco != null
				&& !this.endereco.isEmpty() && this.email != null && !this.email.isEmpty() && this.telefone != null
				&& !this.telefone.isEmpty() && this.observacao != null && !this.observacao.isEmpty();
	}

}

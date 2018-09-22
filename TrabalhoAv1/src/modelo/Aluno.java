package modelo;

public class Aluno {
	private String nome;
	private long cpf;
	private long matricula;
	private String email;
	private long telefone;
	private boolean situacao;

	
	public Aluno(String nome, long cpf, long matricula, String email, long telefone, boolean situacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.telefone = telefone;
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	//metodos
	
	public void mostrarAlunos() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("CPF do aluno: " + this.cpf);
		System.out.println("Matr�cula do aluno: " + this.matricula);
		System.out.println("Email do aluno: " + this.email);
		System.out.println("Telefone do aluno: " + this.telefone);
		System.out.println("Situa��o do aluno: " + this.situacao);
		
	}
	

}

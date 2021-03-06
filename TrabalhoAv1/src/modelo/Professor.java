package modelo;
import java.util.ArrayList;
import java.util.List;


public class Professor {
	private String nome;
	private long cpf;
	private String email;
	private long telefone;
	private String endereco;
	private String categoria;
	private List<Disciplina> disciplinas = new ArrayList();
	
	public Professor() {
	}

	public Professor(String nome, long cpf, String email, long telefone, String endereco, String categoria) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.categoria = categoria;
	}
	public List<Disciplina> getDisciplinas(){
		return this.disciplinas;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
		
	public void mostraProfessor() {
		System.out.println("Nome do professor: " + this.nome);
		System.out.println("CPF do professor: " + this.cpf);
		System.out.println("Email do professor: " + this.email);
		System.out.println("Telefone do professor: " + this.telefone);
		System.out.println("Endere�o do professor: " + this.endereco);
		System.out.println("Categoria do professor: " + this.categoria);		
	}
	
	

}

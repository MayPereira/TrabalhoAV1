package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private long cpf;
	private long matricula;
	private String email;
	private long telefone;
	private List<Curso> cursos = new ArrayList();
	private List<Disciplina> disciplinas = new ArrayList();
	
	public Aluno(String nome, long cpf, long matricula, String email, long telefone ) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.telefone = telefone;
	}
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public List<Curso> getCursos(){
		return this.cursos;
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

	//metodos
	
	
	public void mostrarAlunos() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("CPF do aluno: " + this.cpf);
		System.out.println("Matrícula do aluno: " + this.matricula);
		System.out.println("Email do aluno: " + this.email);
		System.out.println("Telefone do aluno: " + this.telefone);
	}

	}



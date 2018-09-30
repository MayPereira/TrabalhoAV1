package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private int codigo;
	List<Professor> professor = new ArrayList();
	List<Aluno> chamada = new ArrayList();
	private int sala;
	private String cargaHo;
	private String horario;
	private int custo;	

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Professor> getProfessor() {
		return this.professor;
	}
	public List<Aluno> getChamada(){
		return this.chamada;
	}
	
	public Disciplina(String nome, int codigo, int sala, String cargaHo,
			String horario, int custo) {
		this.nome = nome;
		this.codigo = codigo;
		this.sala = sala;
		this.cargaHo = cargaHo;
		this.horario = horario;
		this.custo = custo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getCargaHo() {
		return cargaHo;
	}

	public void setCargaHo(String cargaHo) {
		this.cargaHo = cargaHo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}
	

}

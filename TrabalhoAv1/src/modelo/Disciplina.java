package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private int codigo;
	List<Professor> professor = new ArrayList();
	List<Aluno> chamada = new ArrayList();
	private int sala;
	private int cargaHo;
	private String horario;
	private int custo;

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public List<Professor> getProfessor() {
		return this.professor;
	}

	public List<Aluno> getChamada() {
		return this.chamada;
	}

	public Disciplina(String nome, int codigo, int sala, int cargaHo, String horario, int custo) {
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

	public int getCargaHo() {
		return cargaHo;
	}

	public void setCargaHo(int cargaHo) {
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

	// metodos da disciplina


	public void mostrarDisciplina() {
		System.out.println("Disciplina" + this.nome);
		System.out.println("Código da disciplina: " + this.codigo);
		System.out.println("Sala: " + this.sala);
		System.out.println("Carga horária: " + this.cargaHo);
		System.out.println("Horário: " + this.horario);
		System.out.println("Custo da disciplina: " + this.custo);
	}
	public void calcularCategoria(int custo) {
		for (Professor professor : professor) {
			if (professor.getCategoria()=="especialista") {
				this.setCusto(25);
				System.out.println("Professor especialista. ");
				
			}else if(professor.getCategoria()=="mestre") {
				this.setCusto(35);		
				System.out.println("Professor mestre. ");
			}else if(professor.getCategoria()=="doutor") {
				this.setCusto(45);
			}
			
		}
		
	}
	public void  custoInfra(int custo) {
		custo =  cargaHo *30;
		System.out.println("Custo com infraestrutura: ");
	}

}

package modelo;
import java.util.ArrayList;
import java.util.List;


public class Curso {
	private String nome;
	private int codigo;
	private String turno;
	private Professor coordenador;
	private List<Disciplina> grade = new ArrayList();

	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public Curso(String nome, int codigo, String turno, Professor coordenador) {
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.coordenador = coordenador;
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

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}

}

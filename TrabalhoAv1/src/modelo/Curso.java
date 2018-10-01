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
	public Curso(String nome, int codigo, String turno) {
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
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
public void mostraCurso() {
	System.out.println("Curso: " + this.nome);
	System.out.println("Código do curso: " + this.codigo);
	System.out.println("Turno: " + this.turno);
}

}

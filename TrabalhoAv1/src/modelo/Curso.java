package modelo;

public class Curso {
	private String nome;
	private int codigo;
	private String turno;
	private Professor coordenador;
	private Disciplina disciplina;

	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public Curso(String nome, int codigo, String turno, Professor coordenador, Disciplina disciplina) {
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.coordenador = coordenador;
		this.disciplina = disciplina;
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	

}

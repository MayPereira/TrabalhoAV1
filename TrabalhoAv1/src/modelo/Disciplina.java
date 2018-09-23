package modelo;

public class Disciplina {
	private String nome;
	private int codigo;
	private Professor professor;
	private Aluno chamada;
	private int sala;
	private String cargaHo;
	private String horario;
	private int custo;	

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}
	

	public Disciplina(String nome, int codigo, Professor professor, Aluno chamada, int sala, String cargaHo,
			String horario, int custo) {
		this.nome = nome;
		this.codigo = codigo;
		this.professor = professor;
		this.chamada = chamada;
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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getChamada() {
		return chamada;
	}

	public void setChamada(Aluno chamada) {
		this.chamada = chamada;
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

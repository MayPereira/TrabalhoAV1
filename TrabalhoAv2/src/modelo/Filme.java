package modelo;

public class Filme {
	private String titulo;
	private String duracao;
	private String anoLancamento;
	private String formato;
	private String nomeAutores;
	
	public Filme() {
	}

	public Filme(String titulo, String duracao, String anoLancamento, String formato, String nomeAutores) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.anoLancamento = anoLancamento;
		this.formato = formato;
		this.nomeAutores = nomeAutores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getNomeAutores() {
		return nomeAutores;
	}

	public void setNomeAutores(String nomeAutores) {
		this.nomeAutores = nomeAutores;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", anoLancamento=" + anoLancamento + ", formato="
				+ formato + ", nomeAutores=" + nomeAutores + ", toString()=" + super.toString() + "]";
	}
	
	public void alugarFilme() {
		System.out.println("Nome do filme " + this.getTitulo());
		System.out.println("Nome Ators " + this.getNomeAutores());
		System.out.println("Duração do filme " + this.getDuracao());
		System.out.println("Ano de lançamento do filme " + this.getAnoLancamento());
		
		
	}
	

}

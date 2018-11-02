package modelo;

public class Copia extends Filme{
	
	private int numero;
	private String locacao;
	
	public Copia() {
	}

	public Copia(int numero, String locacao) {
		super();
		this.numero = numero;
		this.locacao = locacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocacao() {
		return locacao;
	}

	public void setLocacao(String locacao) {
		this.locacao = locacao;
	}
	
	public void alugar() {
		
	}
	
	
}


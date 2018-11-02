package modelo;

public class Socio {
	private String nome;
	private String endereco;
	private long telefone;
	private long rg;
	private long cpf;
	private String dataAdesao;
	
	public Socio() {
	}

	public Socio(String nome, String endereco, long telefone, long rg, long cpf, String dataAdesao) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdesao = dataAdesao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getDataAdesao() {
		return dataAdesao;
	}

	public void setDataAdesao(String dataAdesao) {
		this.dataAdesao = dataAdesao;
	}

	@Override
	public String toString() {
		return "Socio [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", rg=" + rg + ", cpf="
				+ cpf + ", dataAdesao=" + dataAdesao + ", toString()=" + super.toString() + "]";
	}
	

}

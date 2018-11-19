package modelo;

public class Programa {

	public static void main(String[] args) {
		
		Socio socio = new Socio();
		socio.setNome("Arlindo");
		socio.setEndereco("Rua A n206");
		socio.setCpf(99999999);
		socio.setDataAdesao("10/10/2010");
		socio.setTelefone(999999696);

		Filme filme = new Copia();
		filme.setTitulo("A volta dos que não foram");
		filme.setNomeAutores("Cristian Gray");
		filme.setDuracao("O resto da vida");
		filme.setAnoLancamento("1999");
		
		System.out.println("Dados da locação: ");
		
		filme.alugarFilme();
		System.out.println("             ");
		socio.mostrarSocio();
		

	}

}

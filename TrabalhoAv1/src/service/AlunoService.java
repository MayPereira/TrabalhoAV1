package service;
import java.util.ArrayList;

import modelo.Aluno;

public class AlunoService {
	ArrayList<Aluno> listaAluno = new ArrayList();
	
	public ArrayList<Aluno> getListaAluno(){
		return this.listaAluno;
	}
	
	//Criando aluno
	
	public void addAluno(String nome, long cpf, long matricula, String email, long telefone, boolean situacao) {
		Aluno c = new Aluno(nome, cpf, matricula, email,telefone, situacao);
		listaAluno.add(c);
	}
	
	//Pesquisando aluno
	


}

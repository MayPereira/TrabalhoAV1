package service;
import java.util.ArrayList;

import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;

public class AlunoService {
	ArrayList<Aluno> listaAluno = new ArrayList();
	
	public ArrayList<Aluno> getListaAluno(){
		return this.listaAluno;
	}
	
	//Criando aluno
	
	public void addAluno(String nome, long cpf, long matricula, String email, long telefone){
		Aluno c = new Aluno(nome, cpf, matricula, email,telefone); 
		
		listaAluno.add(c);
	}
	
	//Pesquisando aluno
	public String buscarAluno(String nome) {
		for (Aluno aluno : listaAluno) {
			if(aluno.getNome().equals(nome)) {
				return nome;
			}
			
		}
		System.out.println("Aluno não encontrado!");
		return null;
	}
	
	//Atualizar dados do aluno
	
	public void alterarAluno(Aluno obj, String nome, long cpf, long matricula, String email, long telefone) {
		obj.setNome(nome);
		obj.setCpf(cpf);
		obj.setMatricula(matricula);
		obj.setTelefone(telefone);
		
	}
	
	//Apagar dados do aluno
	
	public void apagarAluno(String nome) {
		String obj = buscarAluno(nome);
		listaAluno.remove(obj);
		
	}
	public void listarAluno() {
		for (Aluno aluno : listaAluno) {
			aluno.mostrarAlunos();
			aluno.situacaoM();
			
		}
	}
/*	public void povoar() {
		addAluno("mayara", 99999999, 101010, "teste@gmail", 96969696);
		addAluno("pedro", 99999999, 101010, "teste@gmail", 96969696);
		addAluno("paulo", 99999999, 101010, "teste@gmail", 96969696);
		addAluno("alexandre", 99999999, 101010, "teste@gmail", 96969696);
		addAluno("vinicius", 99999999, 101010, "teste@gmail", 96969696);

		
		
	} */

}

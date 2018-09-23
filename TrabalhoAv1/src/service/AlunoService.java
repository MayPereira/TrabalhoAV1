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
	
	public void addAluno(String nome, long cpf, long matricula, String email, long telefone, boolean situacao,Curso curso, Disciplina disciplina) {
		Aluno c = new Aluno(nome, cpf, matricula, email,telefone, situacao, curso, disciplina);
		listaAluno.add(c);
	}
	
	//Pesquisando aluno
	public String buscarAluno(String nome) {
		for (Aluno aluno : listaAluno) {
			if(aluno.getNome()==nome) {
				return nome;
			}
			
		}
		System.out.println("Aluno não encontrado!");
		return null;
	}
	
	//Atualizar dados do aluno
	
	public void alterarAluno(Aluno obj, String nome, long cpf, long matricula, String email, long telefone, boolean situacao) {
		obj.setNome(nome);
		obj.setCpf(cpf);
		obj.setMatricula(matricula);
		obj.setTelefone(telefone);
		obj.setSituacao(situacao);
		
	}
	
	//Apagar dados do aluno
	
	public void apagarAluno(String nome) {
		String obj = buscarAluno(nome);
		listaAluno.remove(obj);
		
	}
	public void listarAluno() {
		for (Aluno aluno : listaAluno) {
			aluno.mostrarAlunos();
			
		}
	}


}

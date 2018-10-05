package service;
import java.util.ArrayList;

import modelo.Aluno;
import modelo.Disciplina;

public class AlunoService {
	ArrayList<Aluno> listaAluno = new ArrayList();
	ArrayList<Disciplina> disciplinas = new ArrayList();
	
	public ArrayList<Aluno> getListaAluno(){
		return this.listaAluno;
	}
	
	//Criando aluno
	
	public void addAluno(String nome, long cpf, long matricula, String email, long telefone){
		Aluno c = new Aluno(nome, cpf, matricula, email,telefone); 
		
		listaAluno.add(c);
	}
	
	//Pesquisando aluno
	public Aluno buscarAluno(String nome) {
		for (Aluno aluno : listaAluno) {
			if(aluno.getNome().equals(nome)) {
				return aluno;
			}
			
		}
		System.out.println("Aluno não encontrado!");
		return null;
	}
	
	//Atualizar dados do aluno
	
	public void alterarNome(Aluno obj, String nome) {
		obj.setNome(nome);
	}
	public void alterarCpf(Aluno obj, long cpf) {
		obj.setCpf(cpf);
	}
	public void alterarMatricula(Aluno obj, long matricula) {
		obj.setMatricula(matricula);
	}
	public void alterarEmail(Aluno obj, String email) {
		obj.setEmail(email);
	}
	public void alterarTelefone(Aluno obj, long telefone) {
		obj.setTelefone(telefone);
	}
	
	//Apagar dados do aluno
	
	public void apagarAluno(String nome) {
		Aluno obj = buscarAluno(nome);
		listaAluno.remove(obj);
		
	}
	public void listarAluno() {
		for (Aluno aluno : listaAluno) {
			aluno.mostrarAlunos();
			//aluno.situacaoM();
			
		}
	}
	public void situacaoM() {
		if (disciplinas.isEmpty()) {
			System.out.println("Aluno pendente.");
		}else{
			System.out.println("Aluno matriculado.");
			
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

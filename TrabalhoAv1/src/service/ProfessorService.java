package service;

import java.util.ArrayList;

import modelo.Professor;

public class ProfessorService {
	ArrayList<Professor> listaProfessor = new ArrayList();
	public ArrayList<Professor> getListaProfessor(){
		return this.listaProfessor;
	}
	
	//Adicionando professor
	
	public void addProfessor(String nome, long cpf, String email, long telefone, String endereco, String categoria,
			String disciplina) {
		Professor p = new Professor(nome, cpf, email, telefone, endereco, categoria, disciplina);
		listaProfessor.add(p);
		}
	
	//pesquisando professor
	public String buscarProfessor(String nome) {
		for (Professor professor : listaProfessor) {
			if(professor.getNome()==nome) {
				return nome;
			}
			
		}
		System.out.println("Professor não encontrado!");
		return null;
	}
	
	//Atualizando dados do professo
	
	public void alterarProfessor(Professor obj, String nome, long cpf, String email, long telefone, String endereco, String categoria,
			String disciplina) {
		obj.setNome(nome);
		obj.setCpf(cpf);
		obj.setEmail(email);
		obj.setTelefone(telefone);
		obj.setEndereco(endereco);
		obj.setCategoria(categoria);
		obj.setDisciplina(disciplina);
	}
	//Apagar dados do professor
	public void apagarProfessor(String nome) {
		String obj = buscarProfessor(nome);
		listaProfessor.remove(obj);
	}
	

	

}

package service;

import java.util.ArrayList;

import modelo.Professor;

public class ProfessorService {
	ArrayList<Professor> listaProfessor = new ArrayList();
	public ArrayList<Professor> getListaProfessor(){
		return this.listaProfessor;
	}
	
	//Adicionando professor
	
	public void addProfessor(String nome, long cpf, String email, long telefone, String endereco, String categoria) {
		Professor p = new Professor(nome, cpf, email, telefone, endereco, categoria);
		listaProfessor.add(p);
		}
	
	//pesquisando professor
	public Professor buscarProfessor(String nome) {
		for (Professor professor : listaProfessor) {
			if(professor.getNome().equals(nome)) {
				return professor;
			}
			
		}
		System.out.println("Professor n�o encontrado!");
		return null;
	}
	
	//Atualizando dados do professo
	
	public void alterarProfessor(Professor obj, String nome, long cpf, String email, long telefone, String endereco, String categoria) {
		obj.setNome(nome);
		obj.setCpf(cpf);
		obj.setEmail(email);
		obj.setTelefone(telefone);
		obj.setEndereco(endereco);
		obj.setCategoria(categoria);
		}
	//Apagar dados do professor
	public void apagarProfessor(String nome) {
		Professor obj = buscarProfessor(nome);
		listaProfessor.remove(obj);
	}
	public void listaProfessor() {
		for (Professor professor : listaProfessor) {
			professor.mostraProfessor();
		}
	}

	

}

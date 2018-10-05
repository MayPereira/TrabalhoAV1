package service;

import java.util.ArrayList;

import modelo.Disciplina;
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
		System.out.println("Professor não encontrado!");
		return null;
	}
	
	//Atualizando dados do professo
	
	public void alterarProfessor(Professor obj, String nome) {
		obj.setNome(nome);
		}
	public void alteraCpf(Professor obj, long cpf) {
		obj.setCpf(cpf);		
	}
	public void alterarEmail(Professor obj, String email) {
		obj.setEmail(email);
	}
	public void alteraTelefone(Professor obj, long telefone) {
		obj.setTelefone(telefone);	
	}
	public void alteraEndereco(Professor obj, String endereco) {
		obj.setEndereco(endereco);
	}
	public void alteraCategoria(Professor obj, String categoria) {
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

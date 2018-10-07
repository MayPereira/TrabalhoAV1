package service;

import java.awt.List;
import java.util.ArrayList;


import modelo.Curso;
import modelo.Disciplina;

public class CursoService {
	ArrayList<Curso> listaCurso = new ArrayList();	
	public ArrayList<Curso> getListaCurso(){
		return this.listaCurso;
	}
	
	public ArrayList<Disciplina> listaDisciplina = new ArrayList();
	public ArrayList<Disciplina> getListaDisciplina(){
		return this.listaDisciplina;
	}
	

	//Adicionando curso
	public void addCurso(String nome, int codigo, String turno) {
		Curso p = new Curso(nome, codigo, turno);
		listaCurso.add(p);
	}
	//Pesquisando curso
	public Curso buscarCurso(String nome) {
		for (Curso curso : listaCurso) {
			if(curso.getNome().equals(nome)) {
				return curso;
			}
			
		}
		System.out.println("Curso não encontrado! ");
		return null;
	}
	
	//alterando dados do curso
	public void alterarCurso(Curso obj, String nome){
		obj.setNome(nome);
	}
	public void alteraCodigo(Curso obj, int codigo) {
		obj.setCodigo(codigo);
	}
	public void alteraTurno(Curso obj, String turno) {
		obj.setTurno(turno);
	}
		//deletar dados do curso
	public void deletarCurso(String nome) {
		Curso obj = buscarCurso(nome);
		listaCurso.remove(obj);
		
	}
	public void listarCurso() {
		for (Curso curso : listaCurso) {
			curso.mostraCurso();			
		}
	}
	
	public void addDisciplina(Curso obj, Disciplina disciplina) {
		disciplina.getNome();
		
	}
}

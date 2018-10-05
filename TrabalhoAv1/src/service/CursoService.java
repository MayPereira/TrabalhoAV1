package service;

import java.util.ArrayList;

import modelo.Curso;
import modelo.Disciplina;
import modelo.Professor;

public class CursoService {
	ArrayList<Curso> listaCurso = new ArrayList();
	public ArrayList<Curso> getListaCurso(){
		return this.listaCurso;
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
		System.out.println("Curso n�o encontrado! ");
		return null;
	}
	
	//alterando dados do curso
	public void alterarCurso(Curso obj, String nome, int codigo, String turno) {
		obj.setNome(nome);
		obj.setCodigo(codigo);
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
	
}

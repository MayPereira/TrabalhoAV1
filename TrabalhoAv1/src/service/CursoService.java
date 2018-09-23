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
	public void addCurso(String nome, int codigo, String turno, Professor coordenador, Disciplina disciplina) {
		Curso p = new Curso(nome, codigo, turno, coordenador, disciplina);
		listaCurso.add(p);
	}
	//Pesquisando curso
	public String buscarCurso(String nome) {
		for (Curso curso : listaCurso) {
			if(curso.getNome()==nome) {
				return nome;
			}
			
		}
		System.out.println("Curso não encontrado! ");
		return null;
	}
	
	//alterando dados do curso
	public void alterarCurso(Curso obj, String nome, int codigo, String turno, Professor coordenador, Disciplina disciplina) {
		obj.setNome(nome);
		obj.setCodigo(codigo);
		obj.setTurno(turno);
		obj.setCoordenador(coordenador);
		obj.setDisciplina(disciplina);
		
	}
	
	//deletar dados do curso
	public void deletarCurso(String nome) {
		String obj = buscarCurso(nome);
		listaCurso.remove(obj);
		
	}
	
}

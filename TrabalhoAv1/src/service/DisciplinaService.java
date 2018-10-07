package service;

import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Disciplina;
import modelo.Professor;

public class DisciplinaService {
	ArrayList<Disciplina> listaDisciplina = new ArrayList();
	ArrayList<Professor> listaProfessor = new ArrayList<>();
	
	public ArrayList<Disciplina> getListaDisciplina(){
		return this.listaDisciplina;
	}
	public ArrayList<Professor> getListaProfessor(){
		return this.listaProfessor;
	}
	
	//Adicionando disciplina
	
	public void addDisciplina(String nome,int codigo,int sala, int cargaHo, String horario, int custo) {
		Disciplina d = new Disciplina(nome, codigo, sala, cargaHo, horario, custo);
		listaDisciplina.add(d);
	}
	
	//Buscando disciplina
	public Disciplina buscaDisciplina(String nome) {
		for (Disciplina disciplina : listaDisciplina) {
			if (disciplina.getNome().equals(nome)) {
				return disciplina;
			}
			
		}
		System.out.println("Disciplina não encontrada! ");
		return null;
	}
	//Alterando dados da disciplina	
	public void alterarNome(Disciplina obj, String nome) {
		obj.setNome(nome);
	}
	public void alterarcodigo(Disciplina obj, int codigo) {
		obj.setCodigo(codigo);
	}
	public void alterarSala(Disciplina obj, int sala) {
		obj.setSala(sala);
	}
	public void alteraCargah(Disciplina obj, int cargaH) {
		obj.setCargaHo(cargaH);
	}
	public void alteraHorario(Disciplina obj, String horario) {
		obj.setHorario(horario);
	}
	public void alteraCusto(Disciplina obj, int custo){
		obj.setCusto(custo);
	}
	//excluir dados da disciplina
	
	public void excluirDisciplina(String nome) {
		Disciplina obj = buscaDisciplina(nome);
		listaDisciplina.remove(obj);
	}
	//listar dados da disciplina

	public void listarDisciplina() {
		for (Disciplina disciplina : listaDisciplina) {
			disciplina.mostrarDisciplina();
		}
	
	}	
	


			
			
		
	}
	


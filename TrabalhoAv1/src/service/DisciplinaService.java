package service;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Disciplina;
import modelo.Professor;

public class DisciplinaService {
	ArrayList<Disciplina> listaDisciplina = new ArrayList();
	
	public ArrayList<Disciplina> getListaDisciplina(){
		return this.listaDisciplina;
	}
	
	//Adicionando disciplina
	
	public void addDisciplina(String nome,int codigo,int sala, String cargaHo, String horario, int custo) {
		Disciplina d = new Disciplina(nome, codigo, sala, cargaHo, horario, custo);
		listaDisciplina.add(d);
	}
	
	//Buscando disciplina
	public String buscaDisciplina(String nome) {
		for (Disciplina disciplina : listaDisciplina) {
			if (disciplina.getNome().equals(nome)) {
				return nome;
			}
			
		}
		System.out.println("Disciplina não encontrada! ");
		return null;
	}
	//Alterando dados da disciplina	
	public void alterarDisciplina(Disciplina obj, String nome, int codigo, Professor professor, Aluno chamada, int sala, String cargaHo,
			String horario, int custo) {
		obj.setNome(nome);
		obj.setCodigo(codigo);
		obj.setSala(sala);
		obj.setCargaHo(cargaHo);
		obj.setHorario(horario);
		obj.setCusto(custo);
	}
	//excluir dados da disciplina
	
	public void excluirDisciplina(String nome) {
		String obj = buscaDisciplina(nome);
		listaDisciplina.remove(obj);
	}
	
}

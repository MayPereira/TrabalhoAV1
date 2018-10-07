package programa;

import modelo.Aluno;
import modelo.Disciplina;

public class TesteMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("portugues");
		disciplina.setCusto(25);
		disciplina.calcularCategoria(25);
		
		
		aluno.getDisciplinas().add(disciplina);
		disciplina.calcularCategoria(10);
		
		
		aluno.mostrarAlunos();

	}

}

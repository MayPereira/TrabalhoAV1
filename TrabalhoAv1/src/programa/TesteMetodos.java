package programa;

import modelo.Aluno;
import modelo.Disciplina;

public class TesteMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("portugues");

		aluno.getDisciplinas();
		aluno.setNome("mayara");
		aluno.getDisciplinas().add(disciplina);
		
		
		aluno.situacaoM();
		aluno.mostrarAlunos();

	}

}

package programa;
import java.util.Scanner;

import service.AlunoService;
import service.CursoService;
import service.DisciplinaService;
import service.ProfessorService;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		AlunoService alunoService = new AlunoService();
		CursoService cursoService = new CursoService();
		DisciplinaService disciplinaService = new DisciplinaService();
		ProfessorService professorService = new ProfessorService();
		
		int ops = -1;
		int ops1 = -1;
		int ops2 = -1;
		
	System.out.println("************ SISTEMA ACADÊMICO *************");	
	System.out.println("             ***** MENU *****");
	
	System.out.println("1 - ALUNO           2 - CURSO");
	System.out.println("3 - DISCIPLINA      4 - PROFESSOR");
	
	System.out.println("Selecione uma opção: ");
	ops = teclado.nextInt();
	
	while(ops!=0) {
	
	switch (ops) {
	case 1:
		// Menu do aluno
		System.out.println("   Você está no menu ALUNO    ");
		System.out.println("                              ");
		System.out.println("1 - CADASTRAR      2 - LISTAR ");
		System.out.println("3 - ALTERAR        4 - EXCLUIR ");
		
		System.out.println("Selecione uma opção: ");
		ops1 = teclado.nextInt();
		// caso selecionado a opção 1
		switch (ops1) {
		case 1:
			System.out.println(" CADASTRAR DADOS DO ALUNO ");
			
			System.out.println("Nome do aluno: ");
			String nome = teclado.next();
			System.out.println("CPF do aluno: ");
			long cpf = teclado.nextLong();
			System.out.println("Matrícula do aluno: ");
			long matricula = teclado.nextLong();
			System.out.println("Email do aluno: ");
			String email = teclado.next();
			System.out.println("Telefone do aluno: ");
			long telefone = teclado.nextLong();
			System.out.println("Situação do aluno: ");
			boolean situacao = teclado.hasNext();
		//	System.out.println("Curso matriculado: ");
			//curso = teclado.nextLine();
		//	System.out.println("Disciplina matriculada: ");
			//String disciplina = teclado.nextLine();
			alunoService.addAluno(nome, cpf, matricula, email, telefone, situacao);
			
			break;
			// caso selecionado a opção 2
		case 2:
			System.out.println(" LISTAR DADOS DO ALUNO ");
			alunoService.listarAluno();
			break;
			
			// caso selecionado a opção 3
		case 3:
			System.out.println(" ALTERAR DADOS DO ALUNO ");
			break;
			
			// caso selecionado a opção 4
		case 4: 
			System.out.println(" EXCLUIR DADOS DO ALUNO ");
	default:
	break;
		}
	case 2:
		// Menu do curso
			System.out.println("   Você está no menu CURSO    ");
			System.out.println("                              ");
			System.out.println("1 - CADASTRAR      2 - LISTAR ");
			System.out.println("3 - ALTERAR        4 - EXCLUIR ");
				
			System.out.println("Selecione uma opção: ");
				ops2 = teclado.nextInt();
		switch (ops2) {
		case 1:
			System.out.println(" CADASTRAR DADOS DO CURSO ");
			
			
			
			break;

		default:
			break;
		}

				
				
		
	break;

	default:
		break;
	}
	
	

	
	
	
	
		
		

	}
	teclado.close();


}
	
}

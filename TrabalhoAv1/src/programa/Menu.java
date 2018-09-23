package programa;
import java.util.Scanner;

import modelo.Aluno;
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
		int ops3 = -1;
		int ops4 = -1;
	System.out.println("************ SISTEMA ACAD�MICO *************");	
	System.out.println("             ***** MENU *****");
	
	System.out.println("1 - ALUNO           2 - CURSO");
	System.out.println("3 - DISCIPLINA      4 - PROFESSOR");
	
	System.out.println("Selecione uma op��o: ");
	ops = teclado.nextInt();
	
	while(ops!=0) {
	
	switch (ops) {
	case 1:
		// Menu do aluno
		System.out.println("   Voc� est� no menu ALUNO    ");
		System.out.println("                              ");
		System.out.println("1 - CADASTRAR      2 - LISTAR ");
		System.out.println("3 - ALTERAR        4 - EXCLUIR ");
		
		System.out.println("Selecione uma op��o: ");
		ops1 = teclado.nextInt();
		
		while(ops1!=0) {
		// caso selecionado a op��o 1
		switch (ops1) {
		case 1:
			System.out.println(" CADASTRAR DADOS DO ALUNO ");
			
			System.out.println("Nome do aluno: ");
			String nome = teclado.next();
			System.out.println("CPF do aluno: ");
			long cpf = teclado.nextLong();
			System.out.println("Matr�cula do aluno: ");
			long matricula = teclado.nextLong();
			System.out.println("Email do aluno: ");
			String email = teclado.next();
			System.out.println("Telefone do aluno: ");
			long telefone = teclado.nextLong();
			System.out.println("Situa��o do aluno: ");
			boolean situacao = teclado.hasNext();
		//	System.out.println("Curso matriculado: ");
			//curso = teclado.nextLine();
		//	System.out.println("Disciplina matriculada: ");
			//String disciplina = teclado.nextLine();
			alunoService.addAluno(nome, cpf, matricula, email, telefone, situacao);
			
			break;
			// caso selecionado a op��o 2
		case 2:
			System.out.println(" LISTAR DADOS DO ALUNO ");
			alunoService.listarAluno();
			break;
			
			// caso selecionado a op��o 3
		case 3:
			System.out.println(" ALTERAR DADOS DO ALUNO ");
			break;
			
			// caso selecionado a op��o 4
		case 4: 
			System.out.println(" EXCLUIR DADOS DO ALUNO ");
	default:
	break;
		}
	}
	case 2:
		// Menu do curso
			System.out.println("   Voc� est� no menu CURSO    ");
			System.out.println("                              ");
			System.out.println("1 - CADASTRAR      2 - LISTAR ");
			System.out.println("3 - ALTERAR        4 - EXCLUIR ");
				
			System.out.println("Selecione uma op��o: ");
				ops2 = teclado.nextInt();
		while(ops2!=0) {
				
		switch (ops2) {
		case 1:
			System.out.println(" CADASTRAR DADOS DO CURSO ");
			
			System.out.println("Digite nome do curso: ");
			String nome = teclado.next();
			System.out.println("Digite codigo do curso: ");
			int codigo = teclado.nextInt();
			System.out.println("Digite o turno do curso: ");
			String turno = teclado.next();
			System.out.println("Digite o nome do coordenador");
			String coordenador = teclado.next();
			System.out.println("Digite o nome disciplina: ");
			String disciplina = teclado.next();
		//	cursoService.addCurso(nome, codigo, turno, coordenador, disciplina);
					
			break;
		case 2:
			System.out.println(" LISTAR DADOS DO CURSO ");
			//criar m�todo de listar na classe curso!
			break;
			
			// caso selecionado a op��o 3
		case 3:
			System.out.println(" ALTERAR DADOS DO CURSO ");
		//	cursoService.alterarCurso(obj, nome, codigo, turno, coordenador, disciplina);
			break;
			
			// caso selecionado a op��o 4
		case 4: 
			System.out.println(" EXCLUIR DADOS DO ALUNO ");

		default:
			break;
		}
	}
	case 3:
		// Menu da disciplina
					System.out.println("   Voc� est� no menu DISCIPLINA    ");
					System.out.println("                              ");
					System.out.println("1 - CADASTRAR      2 - LISTAR ");
					System.out.println("3 - ALTERAR        4 - EXCLUIR ");
						
					System.out.println("Selecione uma op��o: ");
						ops3 = teclado.nextInt();
		while(ops3!=0) {
			
			switch (ops3) {
			case 1:
				System.out.println(" CADASTRAR DADOS DA DISCIPLINA ");
				System.out.println("Digite o nome da disciplina: ");
				String nome = teclado.next();
				System.out.println("Digite o codigo da disciplina: ");
				int codigo = teclado.nextInt();
				System.out.println("Digite o professor da disciplina: ");
				//perguntar em sala
				Scanner professor = teclado.useDelimiter(nome);
				System.out.println("Digite a chamada: ");
				boolean chamada = teclado.hasNext();
				System.out.println("Informe a sala: ");
				int sala = teclado.nextInt();
				System.out.println("Informe a carga hor�ria da disciplina: ");
				String cargaHo = teclado.next();
				System.out.println("Informe o hor�rio do curso: ");
				String horario = teclado.next();
				System.out.println("Informe o custo: ");
				int custo = teclado.nextInt();
				
				
			//	disciplinaService.addDisciplina(nome, codigo, professor, chamada, sala, cargaHo, horario, custo);

			case 2:
				System.out.println(" LISTAR DADOS DA DISCIPLINA ");
				//criar m�todo de listar na classe curso!
				break;
				
				// caso selecionado a op��o 3
			case 3:
				System.out.println(" ALTERAR DADOS DA DISCIPLINA ");
			//	cursoService.alterarCurso(obj, nome, codigo, turno, coordenador, disciplina);
				break;
				
				// caso selecionado a op��o 4
			case 4: 
				System.out.println(" EXCLUIR DADOS DA DISCIPLINA ");

				
				
				break;
			

			default:
				break;
			}
		}
	case 4:
		// Menu da disciplina
		System.out.println("   Voc� est� no menu PROFESSOR    ");
		System.out.println("                              ");
		System.out.println("1 - CADASTRAR      2 - LISTAR ");
		System.out.println("3 - ALTERAR        4 - EXCLUIR ");
			
		System.out.println("Selecione uma op��o: ");
			ops4 = teclado.nextInt();
while(ops4!=0) {

switch (ops4) {
case 1:
	System.out.println("Digite o nome do professor: ");
	String nome = teclado.next();
	System.out.println("Informe CPF do professor: ");
	long cpf = teclado.nextLong();
	System.out.println("Informe email do professor: ");
	String email = teclado.next();
	System.out.println("Informe telefone do professor: ");
	long telefone = teclado.nextLong();
	System.out.println("Informe endere�o do professor: ");
	String endereco = teclado.next();
	System.out.println("Informe a categoria do professor: ");
	String categoria = teclado.next();
	System.out.println("Informe disciplina do professor: ");
	String disciplina = teclado.next();	
	professorService.addProfessor(nome, cpf, email, telefone, endereco, categoria, disciplina);
	
	break;
case 2:
	System.out.println(" LISTAR DADOS DO PROFESSOR ");
	//criar m�todo de listar na classe curso!
	break;
	
	// caso selecionado a op��o 3
case 3:
	System.out.println(" ALTERAR DADOS DO PROFESSOR ");
//	cursoService.alterarCurso(obj, nome, codigo, turno, coordenador, disciplina);
	break;
	
	// caso selecionado a op��o 4
case 4: 
	System.out.println(" EXCLUIR DADOS DO PROFESSOR ");

	

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

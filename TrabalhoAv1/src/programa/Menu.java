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
		boolean aux = true;
		
		AlunoService alunoService = new AlunoService();
		CursoService cursoService = new CursoService();
		DisciplinaService disciplinaService = new DisciplinaService();
		ProfessorService professorService = new ProfessorService();
		
		int opsMenu = -1;
		int opsAluno = -1;
		int opsCurso = -1;
		int opsDisciplina = -1;
		int opsProfessor = -1;
	
	
	while(opsMenu!=0) {
		
		System.out.println("************ SISTEMA ACADÊMICO *************");	
		System.out.println("             ***** MENU *****");
		
		System.out.println("1 - ALUNO           2 - CURSO");
		System.out.println("3 - DISCIPLINA      4 - PROFESSOR");
		
		System.out.println("Selecione uma opção: ");
		opsMenu = teclado.nextInt();
		
	switch (opsMenu) {
	case 1:
			while(opsAluno!=0) {
			// Menu do aluno
			System.out.println("   Você está no menu ALUNO    ");
			System.out.println("                              ");
			System.out.println("1 - CADASTRAR      2 - LISTAR ");
			System.out.println("3 - ALTERAR        4 - EXCLUIR ");
			
			System.out.println("Selecione uma opção: ");
			opsAluno = teclado.nextInt();
		// caso selecionado a opção 1
		switch (opsAluno) {
		
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
		//	System.out.println("Curso matriculado: ");
			//curso = teclado.nextLine();
		//	System.out.println("Disciplina matriculada: ");
			//String disciplina = teclado.nextLine();
			alunoService.addAluno(nome, cpf, matricula, email, telefone);

			System.out.println("Aluno cadastrado com sucesso!!!");
			System.out.println("Deseja cadastrar outro aluno? 1 - SIM 0 - NÃO");
			opsMenu = teclado.nextInt();

			break;

			// caso selecionado a opção 2
		case 2:
			System.out.println(" LISTAR DADOS DO ALUNO ");
			alunoService.listarAluno();
			break;
			// caso selecionado a opção 3
		case 3:
			System.out.println(" ALTERAR DADOS DO ALUNO ");
			System.out.println("Digite o nome do aluno a ser alterado: ");
		   // Aluno obj = alunoService.buscarAluno(teclado.next());
			System.out.println("Digite o telefone do aluno a ser alterado: ");
			//alunoService.alterarAluno(objt, nome, cpf, matricula, email, telefone, situacao);

			break;
			
			// caso selecionado a opção 4
		case 4: 
			System.out.println(" EXCLUIR DADOS DO ALUNO ");
			System.out.println("Digite o nome do aluno a ser apagado: ");
			alunoService.apagarAluno(teclado.next());
			break;
			

default:
	System.out.println("Saindo...");
	teclado.close();
break;
		}
}
	
	case 2:
		
		while(opsCurso!=0) {
			// Menu do curso
						System.out.println("   Você está no menu CURSO    ");
						System.out.println("                              ");
						System.out.println("1 - CADASTRAR      2 - LISTAR ");
						System.out.println("3 - ALTERAR        4 - EXCLUIR ");
							
						System.out.println("Selecione uma opção: ");
							opsCurso = teclado.nextInt();
				
		switch (opsCurso) {
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
			//criar método de listar na classe curso!
			
			break;
			
			// caso selecionado a opção 3
		case 3:
			System.out.println(" ALTERAR DADOS DO CURSO ");
		//	cursoService.alterarCurso(obj, nome, codigo, turno, coordenador, disciplina);
			break;
			
			// caso selecionado a opção 4
		case 4: 
			System.out.println(" EXCLUIR DADOS DO ALUNO ");

		default:
			System.out.println("Saindo...");
			teclado.close();
			break;
		}
	}
	case 3:
		// Menu da disciplina
					System.out.println("   Você está no menu DISCIPLINA    ");
					System.out.println("                              ");
					System.out.println("1 - CADASTRAR      2 - LISTAR ");
					System.out.println("3 - ALTERAR        4 - EXCLUIR ");
						
					System.out.println("Selecione uma opção: ");
						opsDisciplina = teclado.nextInt();
		while(opsDisciplina!=0) {
			
			switch (opsDisciplina) {
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
				System.out.println("Informe a carga horária da disciplina: ");
				String cargaHo = teclado.next();
				System.out.println("Informe o horário do curso: ");
				String horario = teclado.next();
				System.out.println("Informe o custo: ");
				int custo = teclado.nextInt();
				
				
			//	disciplinaService.addDisciplina(nome, codigo, professor, chamada, sala, cargaHo, horario, custo);

			case 2:
				System.out.println(" LISTAR DADOS DA DISCIPLINA ");
				//criar método de listar na classe curso!
				break;
				
				// caso selecionado a opção 3
			case 3:
				System.out.println(" ALTERAR DADOS DA DISCIPLINA ");
			//	cursoService.alterarCurso(obj, nome, codigo, turno, coordenador, disciplina);
				break;
				
				// caso selecionado a opção 4
			case 4: 
				System.out.println(" EXCLUIR DADOS DA DISCIPLINA ");

				
				
				break;
			

			default:
				System.out.println("Saindo...");
				teclado.close();
				break;
			}
		}
	case 4:
		// Menu do professor
		System.out.println("   Você está no menu PROFESSOR    ");
		System.out.println("                              ");
		System.out.println("1 - CADASTRAR      2 - LISTAR ");
		System.out.println("3 - ALTERAR        4 - EXCLUIR ");
			
		System.out.println("Selecione uma opção: ");
			opsProfessor = teclado.nextInt();
while(opsProfessor!=0) {

switch (opsProfessor) {
case 1:
	System.out.println("Digite o nome do professor: ");
	String nome = teclado.next();
	System.out.println("Informe CPF do professor: ");
	long cpf = teclado.nextLong();
	System.out.println("Informe email do professor: ");
	String email = teclado.next();
	System.out.println("Informe telefone do professor: ");
	long telefone = teclado.nextLong();
	System.out.println("Informe endereço do professor: ");
	String endereco = teclado.next();
	System.out.println("Informe a categoria do professor: ");
	String categoria = teclado.next();
	System.out.println("Informe disciplina do professor: ");
	String disciplina = teclado.next();	
	professorService.addProfessor(nome, cpf, email, telefone, endereco, categoria);
	
	break;
case 2:
	System.out.println(" LISTAR DADOS DO PROFESSOR ");
	//criar método de listar na classe curso!
	break;
	
	// caso selecionado a opção 3
case 3:
	System.out.println(" ALTERAR DADOS DO PROFESSOR ");
//	cursoService.alterarCurso(obj, nome, codigo, turno, coordenador, disciplina);
	break;
	
	// caso selecionado a opção 4
case 4: 
	System.out.println(" EXCLUIR DADOS DO PROFESSOR ");
break;
	

default:
	System.out.println("Saindo...");
	teclado.close();
	break;
}
	
	break;
		
	}
}
	teclado.close();


}
	
}
}


package programa;

import java.util.Scanner;

import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Professor;
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

		int opsMenu = -1;
		int opsAluno = -1;
		int opsCurso = -1;
		int opsDisciplina = -1;
		int opsProfessor = -1;

		while (opsMenu != 0) {

			System.out.println("************ SISTEMA ACAD�MICO *************");
			System.out.println("             ***** MENU *****");

			System.out.println("1 - CURSO           2 - DISCIPLINA");
			System.out.println("3 - PROFESSOR      4 - ALUNO");

			System.out.println("Selecione uma op��o: ");
			opsMenu = teclado.nextInt();

			switch (opsMenu) {			
			case 1:
				
				//COLOCAR CURSO AQUI
				while (opsCurso != 0) {
					// Menu do curso
					System.out.println("   Voc� est� no menu CURSO    ");
					System.out.println("                              ");
					System.out.println("1 - CADASTRAR      2 - LISTAR ");
					System.out.println("3 - ALTERAR        4 - EXCLUIR ");
					System.out.println("0 - VOLTAR AO MENU INICIAL ");

					System.out.println("Selecione uma op��o: ");
					opsCurso = teclado.nextInt();

					switch (opsCurso) {
					case 1:
						System.out.println(" CADASTRAR DADOS DO CURSO ");

						System.out.print("Digite nome do curso: ");
						String nome = teclado.next();
						System.out.print("Digite codigo do curso: ");
						int codigo = teclado.nextInt();
						System.out.print("Digite o turno do curso: ");
						String turno = teclado.next();
						cursoService.addCurso(nome, codigo, turno);

						System.out.print("Curso cadastrado com sucesso!!!");
					//	System.out.println("Deseja cadastrar uma disciplina? 1 - SIM 0 - N�O: ");
						cursoService.getListaDisciplina();	
										
						
						System.out.print("Deseja voltar ao menu curso? 1 - SIM 0 - N�O: ");
						opsCurso = teclado.nextInt();

						break;
					case 2:
						System.out.println(" LISTAR DADOS DO CURSO ");
						cursoService.listarCurso();
						break;

					// caso selecionado a op��o 3
					case 3:
						System.out.println(" ALTERAR DADOS DO CURSO ");
						System.out.print("Digite o nome do curso a ser alterado: ");
						Curso obj = cursoService.buscarCurso(teclado.next());
						
						System.out.println("Digite o novo nome do curso: ");
						cursoService.alterarCurso(obj, teclado.next());
						System.out.println("Digite novo c�digo do curso: ");
						cursoService.alteraCodigo(obj, teclado.nextInt());
						System.out.println("Digite novo turno do curso: ");
						cursoService.alteraTurno(obj, teclado.next());
						break;

					// caso selecionado a op��o 4
					case 4:
						System.out.println(" EXCLUIR DADOS DO CURSO ");
						System.out.print("Digite o nome do curso a ser apagado: ");

						cursoService.deletarCurso(teclado.next());
						break;

					default:
						System.out.println("Saindo...");
						teclado.close();
						break;
					}
				}
				opsCurso = -1;
				break;
				
				
			case 2:
				//COLOCAR DISCIPLINA AQUI
				// Menu da disciplina
				System.out.println("   Voc� est� no menu DISCIPLINA    ");
				System.out.println("                              ");
				System.out.println("1 - CADASTRAR      2 - LISTAR ");
				System.out.println("3 - ALTERAR        4 - EXCLUIR ");
				System.out.println("0 - VOLTAR AO MENU INICIAL ");

				System.out.println("Selecione uma op��o: ");
				opsDisciplina = teclado.nextInt();
				while (opsDisciplina != 0) {

					switch (opsDisciplina) {
					case 1:
						System.out.print(" CADASTRAR DADOS DA DISCIPLINA ");
						System.out.print("Digite o nome da disciplina: ");
						String nome = teclado.next();
						System.out.print("Digite o codigo da disciplina: ");
						int codigo = teclado.nextInt();
						System.out.print("Informe a sala: ");
						int sala = teclado.nextInt();
						System.out.print("Informe a carga hor�ria da disciplina: ");
						int cargaHo = teclado.nextInt();
						System.out.print("Informe o hor�rio do curso: ");
						String horario = teclado.next();
						System.out.print("Informe o custo: ");
						int custo = teclado.nextInt();

						disciplinaService.addDisciplina(nome, codigo, sala, cargaHo, horario, custo);

						System.out.println("Disciplina cadastrado com sucesso!!!");
						System.out.println("Deseja voltar ao menu disciplina? 1 - SIM 0 - N�O");
						opsDisciplina = teclado.nextInt();
						break;

					case 2:
						System.out.println(" LISTAR DADOS DA DISCIPLINA ");
						// criar m�todo de listar na classe curso!
						disciplinaService.listarDisciplina();
						
						break;

					// caso selecionado a op��o 3
					case 3:
						System.out.println(" ALTERAR DADOS DA DISCIPLINA ");
						Disciplina obj = disciplinaService.buscaDisciplina(teclado.next());
						System.out.print("Digite o nome da disciplina a ser alterada: ");
						disciplinaService.alterarNome(obj, teclado.next());
						System.out.print("Digite o nome do c�digo da disciplina a ser alterada: ");
						disciplinaService.alterarcodigo(obj, teclado.nextInt());
						System.out.print("Digite a nova sala da disciplina a ser alterada: ");
						disciplinaService.alterarSala(obj, teclado.nextInt());
						System.out.print("Digite a nova carga hor�ria da disciplina a ser alterada: ");
						disciplinaService.alteraCargah(obj, teclado.nextInt());
						System.out.print("Digite o novo custo da disciplina a ser alterada: ");
						disciplinaService.alteraCusto(obj, teclado.nextInt());	
						break;

					// caso selecionado a op��o 4
					case 4:
						System.out.println(" EXCLUIR DADOS DA DISCIPLINA ");
						System.out.print("Digite o nome da disciplina a ser apagado: ");

						disciplinaService.excluirDisciplina(teclado.next());

						break;

					default:
						System.out.println("Saindo...");
						teclado.close();
						break;
					}
				}
				 opsDisciplina = -1;
				break;

				
			case 3:
				// Menu do professor
				System.out.println("   Voc� est� no menu PROFESSOR    ");
				System.out.println("                              ");
				System.out.println("1 - CADASTRAR      2 - LISTAR ");
				System.out.println("3 - ALTERAR        4 - EXCLUIR ");
				System.out.println("0 - VOLTAR AO MENU INICIAL ");

				System.out.println("Selecione uma op��o: ");
				opsProfessor = teclado.nextInt();
				while (opsProfessor != 0) {

					switch (opsProfessor) {
					case 1:
						System.out.print("Digite o nome do professor: ");
						String nome = teclado.next();
						System.out.print("Informe CPF do professor: ");
						long cpf = teclado.nextLong();
						System.out.print("Informe email do professor: ");
						String email = teclado.next();
						System.out.print("Informe telefone do professor: ");
						long telefone = teclado.nextLong();
						System.out.print("Informe endere�o do professor: ");
						String endereco = teclado.next();
						System.out.print("Informe a categoria do professor: ");
						String categoria = teclado.next();
						System.out.print("Informe disciplina do professor: ");
						String disciplina = teclado.next();
						professorService.addProfessor(nome, cpf, email, telefone, endereco, categoria);

						System.out.print("Professor cadastrado com sucesso!!!");
						System.out.print("Deseja voltar ao menu professor? 1 - SIM 0 - N�O");
						opsProfessor = teclado.nextInt();

						break;
					case 2:
						System.out.println(" LISTAR DADOS DO PROFESSOR ");
						// m�todo de listar na classe curso!
						professorService.listaProfessor();
						break;

					// caso selecionado a op��o 3
					case 3:
						System.out.println(" ALTERAR DADOS DO PROFESSOR ");
						System.out.println("Digite o nome do professor a ser alterado: ");
						Professor obj = professorService.buscarProfessor(teclado.next());
						System.out.println("Digite o novo nome do professor: ");
						professorService.alterarProfessor(obj, teclado.next());
						System.out.println("Digite o novo CPF do professor: ");
						professorService.alteraCpf(obj, teclado.nextLong());
						System.out.println("Digite o novo e-mail do professor: ");
						professorService.alterarEmail(obj, teclado.next());
						System.out.println("Digite o novo telefone do professor: ");
						professorService.alteraTelefone(obj, teclado.nextLong());
						System.out.println("Digite o novo endere�o do professor: ");
						professorService.alteraEndereco(obj, teclado.next());
						System.out.println("Digite a nova categoria do professor: ");
						professorService.alteraCategoria(obj, teclado.next());
						
						break;

					// caso selecionado a op��o 4
					case 4:
						System.out.println(" EXCLUIR DADOS DO PROFESSOR ");
						System.out.print("Digite o nome do professor a ser apagado: ");
						professorService.apagarProfessor(teclado.next());
						break;
						

					default:
						System.out.println("Saindo...");
						teclado.close();
						break;
					}
				}
		            opsProfessor = -1;
		            break;
				
			case 4:
				while (opsAluno != 0) {
					// Menu do aluno
					System.out.println("   Voc� est� no menu ALUNO    ");
					System.out.println("                              ");
					System.out.println("1 - CADASTRAR      2 - LISTAR ");
					System.out.println("3 - ALTERAR        4 - EXCLUIR ");
					System.out.println("0 - VOLTAR AO MENU INICIAL ");

					System.out.println("Selecione uma op��o: ");
					opsAluno = teclado.nextInt();
					// caso selecionado a op��o 1
					switch (opsAluno) {

					case 1:
						System.out.println(" CADASTRAR DADOS DO ALUNO ");

						System.out.print("Nome do aluno: ");
						String nome = teclado.next();
						System.out.print("CPF do aluno: ");
						long cpf = teclado.nextLong();
						System.out.print("Matr�cula do aluno: ");
						long matricula = teclado.nextLong();
						System.out.print("Email do aluno: ");
						String email = teclado.next();
						System.out.print("Telefone do aluno: ");
						long telefone = teclado.nextLong();
						alunoService.addAluno(nome, cpf, matricula, email, telefone);

						System.out.println("Aluno cadastrado com sucesso!!!");
						System.out.println("Deseja voltar ao menu aluno? 1 - SIM 0 - N�O");
						opsAluno = teclado.nextInt();

						break;

					// caso selecionado a op��o 2
					case 2:
						System.out.println(" LISTAR DADOS DO ALUNO ");
						alunoService.listarAluno();
						System.out.print("Situa��o do aluno: " );
						alunoService.situacaoM();
						break;
					// caso selecionado a op��o 3
					case 3:
						System.out.println(" ALTERAR DADOS DO ALUNO ");
						System.out.print("Digite o nome do aluno a ser alterado: ");
						Aluno obj = alunoService.buscarAluno(teclado.next());
						
						System.out.println("Digite o nome a ser alterado");
						alunoService.alterarNome(obj, teclado.next());
						System.out.println("Digite o telefone do aluno a ser alterado: ");
						alunoService.alterarTelefone(obj, teclado.nextLong());;
						System.out.println("Digite o CPF a ser alterado");
						alunoService.alterarCpf(obj, teclado.nextLong());
						System.out.println("Digite a matr�cula do aluno a ser alterado");
						alunoService.alterarMatricula(obj, teclado.nextLong());
						System.out.println("Digite o email a ser alterado");
						alunoService.alterarEmail(obj, teclado.next());
						System.out.println("Digite o CPF a ser alterado");
						alunoService.alterarTelefone(obj, teclado.nextLong());						
						break;

					// caso selecionado a op��o 4
					case 4:
						System.out.println(" EXCLUIR DADOS DO ALUNO ");
						System.out.print("Digite o nome do aluno a ser apagado: ");
						alunoService.apagarAluno(teclado.next());
						break;
						
					default:
						System.out.println("Saindo...");
						teclado.close();
						break;
						
						
					}
				}
				opsAluno = -1;

				break;

				
		          }
		      }
			System.out.println("opsMenu >> "+opsMenu);
		      opsMenu = -1;
		      }

	}


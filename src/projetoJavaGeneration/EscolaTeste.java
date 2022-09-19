package projetoJavaGeneration;

import java.util.Scanner;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos ("Maria Joana", "Feminino", "Rua das Lágrimas, 1", "12345678910", 14, 44443333, 12345, 9,
				"B");		
		
		
		Professores prof1 = new Professores ("João Paulo", "masculino", "Avenida Souza e Silva, 2", "01987654321", 42, 33334444, 57089,
					"História", "Noturno");
		Professores prof2 = new Professores ("Eduarda Reis", "feminino", "Rua da Paróquia, 36","6574239751", 37, 975489571,21487010, 
					"Geografia","Matutino");
		
		Staff limpeza = new Staff ("Maria Lúcia", "Não-declarado", "Desconhecido", "23654789104", 56, 55556666, "Limpeza", 
		"Matutino e Noturno");
		Staff diretoria = new Staff("Patricia Bonfim", "Feminino","Avenida Rudge, 52", "6954165249", 52, 333658741, "Diretoria","Tempo Integral");
	
		//Chamando os métodos para invocar os comportamentos
		int op,acesso;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n1- Acessar sistema do Aluno");
		System.out.println("\n2- Acessar o Sistema do Professor");
		System.out.println("\n3- Acessar o Sistema do Staff");
		
		do {
		
		System.out.println("\nQual sistema gostaria de acessar? ");	
		op = ler.nextInt();	
							
		switch(op) {
		
		case 1:		
			
			System.out.println("\n******Bem vinde ao Sistema do Aluno*******");
			//Novo menu de Opções dentro do Sistema Aluno
			
			System.out.println("\n1- Calcular a Média do Aluno");
			System.out.println("\n2- Contar a quantidade de faltas");			
			
			System.out.println("\nDigite a opção que deseja acessar: ");		
			acesso= ler.nextInt();					
			
			switch(acesso) {
			case 1:
				aluno1.leiaMedia();
				break;
			case 2:
				aluno1.leiaFaltas();
				break;
			case 3:
				aluno1.aprovaAluno();
				break;
				default:
					System.out.println("\nOpção Inválida, digite as do menu");					
				}break;			
			
			
		case 2:
			System.out.println("\n******Bem vinde ao Sistema do Professor*****");
			prof1.imprimirProf();			
			break;
			
		case 3:
			System.out.println("\n*******Bem vinde ao Sistema do Staff******");
			limpeza.imprimirStaff();
			limpeza.sorteioDia();
			break;			
			default:
				System.out.println("\nOpção inválida, digite as opções do Menu");
				
		}
				
		}while (op != 0);		
	}						

}
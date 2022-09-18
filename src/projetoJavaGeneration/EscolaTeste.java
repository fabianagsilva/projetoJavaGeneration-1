package projetoJavaGeneration;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos ("Maria Joana", "Feminino", "Rua das Lágrimas, 1", "12345678910", 14, 44443333, 12345, 9,
			"B");
		Professores prof1 = new Professores ("João Paulo", "masculino", "Avenida Souza e Silva, 2", "01987654321", 42, 33334444, 57089,
				"História", "Noturno");
		Staff cantina = new Staff ("Lucia Lucía", "Não-declarado", "Desconhecido", "23654789104", 56, 55556666, "Cantina", 
			"Matutino e Noturno");
		
		aluno1.leiaMedia();	
		aluno1.imprimirAluno();
			
		
		
		

	}

}

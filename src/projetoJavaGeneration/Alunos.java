package projetoJavaGeneration;

import java.util.Scanner;

public class Alunos extends Escola {
	
	Scanner leia = new Scanner (System.in);
	
	float mediaFinal;
	private int id;
	private int serie;
	private String turma;
	
	public Alunos (String nome, String genero, String endereco, String cpf, int idade, int telefone, int id, int serie,
			String turma) {
		super(nome, genero, endereco, cpf, idade, telefone);
		
		this.id = id;
		this.serie = serie;
		this.turma = turma;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
	//Apenas uma ideia para pedirmos um input do usuário, o qual definirá as médias dos alunos e mostraremos o uso do Scanner
	public void leiaMedia() {
		float n1, n2, n3, n4;
		System.out.println("Qual a média do(a) "+getNome()+" no 1º Bimestre? ");
		n1 = leia.nextFloat();
		System.out.println("Qual a média do(a) "+getNome()+" no 2º Bimestre? ");
		n2 = leia.nextFloat();
		System.out.println("Qual a média do(a) "+getNome()+" no 3º Bimestre? ");
		n3 = leia.nextFloat();
		System.out.println("Qual a média do(a) "+getNome()+" no 4º Bimestre? ");
		n4 = leia.nextFloat();
		mediaFinal = (n1+n2+n3+n4)/4;
		System.out.println("Média Final: "+mediaFinal);
		
	}
	
	public void imprimirAluno() {
		System.out.println("\n****************Aluno****************");
		System.out.println("\nNome: "+getNome()+"\nGênero: "+getGenero()+"\nEndereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nIdade: "
				+getIdade()+"\nTelefone: "+getTelefone()+"\nRA: "+id+"\n"+serie+" série "+turma);
		System.out.println("Média Final: "+mediaFinal);

	}

}

package projetoJavaGeneration;

import java.util.Scanner;

public class Professores extends Escola {
	
	Scanner leia = new Scanner(System.in);
	
	private int registro;
	private String materia;
	private String turno;
	
	public Professores (String nome, String genero, String endereco, String cpf, int idade, int telefone, int registro, String materia,
			String turno) {
		super(nome, genero, endereco, cpf, idade, telefone);
		this.registro = registro;
		this.materia = materia;
		this.turno = turno;
		
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void imprimirProf() {
		System.out.println("\n****************Professor****************");
		System.out.println("\nNome: "+getNome()+"Gênero: "+getGenero()+"\nEndereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nIdade: "
				+getIdade()+"\nTelefone: "+getTelefone()+"\nRegistro: "+registro+"\nMatéria"+materia+"\nTurno: "+turno);
	}

}

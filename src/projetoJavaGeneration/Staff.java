package projetoJavaGeneration;

public class Staff extends Escola {
	
	private String area;
	private String turno;
	
	public Staff (String nome, String genero, String endereco, String cpf, int idade, int telefone, String area, 
			String turno) {
		super (nome, genero, endereco, cpf, idade, telefone);
		this.area = area;
		this.turno = turno;
		
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void imprimirStaff() {
		System.out.println("\n****************Staff****************");
		System.out.println("\nNome: "+getNome()+"Gênero: "+getGenero()+"\nEndereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nIdade: "
				+getIdade()+"\nTelefone: "+getTelefone()+"\nArea: "+area+"\nTurno: "+turno);
		}

}

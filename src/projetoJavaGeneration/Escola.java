package projetoJavaGeneration;
//Classe mãe
public class Escola {
	//Atributos
	private String nome;
	private String genero; //char
	private String endereco;
	private String cpf; 
	private int idade;
	private int telefone;
	

	public Escola (String nome, String genero, String endereco, String cpf, int idade, int telefone) {
		//Inicializar os objetos
		this.nome = nome;
		this.genero = genero;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
		
	}	
	
	//Métodos estão associados aos tipos de comportamento que nosso objeto tem
	public void validarCpf() {  
		
		//Verificar se aluno1.validarCpf() -> referencia qual o objeto tem determinado
		//comportamento
		
		//Conjunto de instruções que o método vai executar
		
		if(getCpf().length()!=11){
			System.out.println("\n---CPF Inválido!!!---");
		}else {
			System.out.println("\n---CPF Válido!!!---");
		}
	}
	
	//Get é um método que busca e retorna
	public String getNome() {
		return nome;		
	}
	
	//Estabelecer um valor para o atributo
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}		

}
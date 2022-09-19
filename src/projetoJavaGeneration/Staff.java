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

        int a = (int)(Math.random()*5.0);        
        System.out.println("\nO número escolhido foi: "+a+ " logo, o local a ser limpado é: ");
                
        switch(a) {
        case 1:
            System.out.println("\nPátio");
            break;        
        case 2:
            System.out.println("\nCantina");
            break;
        case 3:
            System.out.println("\nRefeitório");
            break;
        case 4:
            System.out.println("\nSetor Financeiro");
            break;
        case 5:
            System.out.println("\nSalas de Aula");
            default:
                System.out.println("\nSala de Diretoria/Professores");
        }
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
        System.out.println("\nNome: "+getNome()+"\nGênero: "+getGenero()+"\nEndereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nIdade: "
                +getIdade()+"\nTelefone: "+getTelefone()+"\nArea: "+getArea()+"\nTurno: "+turno);    
            
        }
}
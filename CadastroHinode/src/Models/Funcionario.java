package Models;

public class Funcionario {

	private String nome;
	private int matricula;
	
	public Funcionario (String nome ,  int matricula) {
		
		this.nome = nome;
		this.matricula = matricula;
		
	}

	public String getNome() {
		return this.nome;
	}

/*	public void setNome(String nome) {
		this.nome = nome;
	} */

	public String getMatricula() {
		return String.valueOf(this.matricula);
	}

/*	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}*/
	
	
	
}

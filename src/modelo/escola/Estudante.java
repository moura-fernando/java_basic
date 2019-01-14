package modelo.escola;

public class Estudante extends Pessoa{
	
	
	public Estudante(String nome) {
		super(nome);
	}

	private Integer matricula;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
}

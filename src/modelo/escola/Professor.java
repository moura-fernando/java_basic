package modelo.escola;


public class Professor extends Pessoa {
	
	private String disciplina;
	
	public Professor(String nome) {
	   super(nome);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return "Este professor chama-se: " + getNome();
	}
}

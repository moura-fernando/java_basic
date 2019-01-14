package modelo.turma;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("nome não pode ser null.");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula +"]"; 
	}
	
    @Override
    public boolean equals(Object obj) {
    	Aluno a = (Aluno) obj;
    	return this.nome.equals(a.getNome());
    }
    
    @Override
    public int hashCode() {
    	return this.nome.hashCode();
    }

}

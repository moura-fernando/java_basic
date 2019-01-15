package modelo.empresa;

public class Empregado {

	private String nome;
	
	public Empregado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	  Empregado e1 = (Empregado)	obj;
	  return this.nome.equals(e1.getNome());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}

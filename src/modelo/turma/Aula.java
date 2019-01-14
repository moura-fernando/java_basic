package modelo.turma;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
		
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aula: " + titulo + ", Dura��o: " + tempo + " minutos.";
	}

	@Override
	public int compareTo(Aula o) {		
		return this.titulo.compareTo(o.titulo);
	}
}

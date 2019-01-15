package modelo.turma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
//	private Set<Aluno> alunos = new TreeSet<>();
//	private Set<Aluno> alunos = new LinkedHashSet<>(); //Se rodar um for, trás na ordem em que os elementos foram adicionados.
	private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: "+ nome + ", tempo total: " + this.getTempoTotal() + ","+
	 "aulas: " + this.aulas + " ]";
	}



	public Aluno buscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("Não existe um aluno correspondente a matrícula: " + numero);
		return matriculaParaAluno.get(numero);
	}
}

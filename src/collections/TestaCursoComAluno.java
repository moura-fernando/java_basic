package collections;

import java.util.Iterator;
import java.util.Set;


import modelo.turma.Aluno;
import modelo.turma.Aula;
import modelo.turma.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo");
	
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 36459);
		Aluno a2 = new Aluno("Guilherme Silveira", 233354);
		Aluno a3 = new Aluno("Mauricio Aniche", 344412);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os Alunos Matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		//ITERATOR
		Set<Aluno> alunos = javaColecoes.getAlunos();		
		Iterator<Aluno> iterador =  alunos.iterator();
		
		while (iterador.hasNext()) {
			Aluno proximoAluno = iterador.next();
			System.out.println(proximoAluno.getNome());
		}
		
	}
}

package map;

import modelo.turma.Aluno;
import modelo.turma.Aula;
import modelo.turma.Curso;

public class TestaBuscaAlunoCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 36459);
		Aluno a2 = new Aluno("Guilherme Silveira", 233354);
		Aluno a3 = new Aluno("Mauricio Aniche", 344412);
		Aluno a4 = new Aluno("Marcelo Ferreira", 344412);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println("Alunos: "  + javaColecoes.getAlunos());
		
		System.out.println("Quem é o aluno com matricula:");
		Aluno aluno = javaColecoes.buscaMatriculado(344412);
		System.out.println("Aluno: " + aluno);
		
		System.out.println("Alunos: "  + javaColecoes.getAlunos());
		
	}

}

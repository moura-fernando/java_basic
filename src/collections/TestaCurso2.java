package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.turma.Aula;
import modelo.turma.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");
//		List<Aula> aulas = javaColecoes.getAulas();
	
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);	
		System.out.println(aulas);
		
		System.out.println("Tempo total: "+javaColecoes.getTempoTotal() + " minutos.");
		
		System.out.println(javaColecoes);
		
	}
}

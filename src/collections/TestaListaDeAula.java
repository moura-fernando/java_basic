package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import modelo.turma.Aula;

public class TestaListaDeAula {
	
	public static void main (String[] args) {
		
		Aula a1 = new Aula("Revisitando ArrayList", 11);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
//		aulas.forEach(aula -> System.out.println(aula.getTitulo()));
		
		
	}

}

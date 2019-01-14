package list;

import java.util.ArrayList;
import java.util.List;

import modelo.escola.Estudante;
import modelo.escola.Pessoa;
import modelo.escola.Professor;

public class OrdenaLista {

	public static void main(String[] args) {
		

		Professor p1 = new Professor("Stella");
		Professor p2 = new Professor("Ana");
		
		Estudante e1 = new Estudante("João");
		Estudante e2 = new Estudante("Maria");
		
		
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(e1);
		lista.add(e2);
		
		lista.sort((o1, o2)-> {
				String nome1 = o1.getNome();
				String nome2 = o2.getNome();
				return nome1.compareTo(nome2);
		});
		
		lista.forEach(pessoa -> System.out.println(pessoa.toString())); 
	}
}

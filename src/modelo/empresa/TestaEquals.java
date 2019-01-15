package modelo.empresa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaEquals {
	
	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("Ringo");
		Empregado e2 = e1;
		Empregado e3 = new Empregado("Ringo");
	
		Set<Empregado> empregados = new HashSet<>();
		empregados.add(e1);
//
		List<Empregado> empregadosList = new ArrayList<>();
		empregadosList.add(e1);
		
		
		System.out.println("É e1 == e2 que tem referencia para o mesmo objeto?");
		System.out.println(e1==e2);
		System.out.println("É e1.equals(e2) que tem referencia para o mesmo objeto?");
		System.out.println(e1.equals(e2));
		System.out.println("--------------------------------------------------------");
		System.out.println("É e1 == e3 que tem um elemento com o mesmo nome do obj e1?");
		System.out.println(e1==e3);
		System.out.println("É e1.equals(e2) que tem referencia para o mesmo objeto?");
		System.out.println(e1.equals(e3));
		System.out.println(empregadosList.contains(e3));
		System.out.println(empregados.contains(e3));
		
		
		
		
	}

}

package utils;
import java.util.ArrayList;
import java.util.List;

public class PegarNaLista {
	
	
	public static List<String> Diretor() {
		List<String> list = new ArrayList();
		
		list.add("ALFONSO CU�RON "+"28 de novembro de 1961");
		list.add("PEDRO ALMOD�VAR "+"25 de setembro de 1949");
		list.add("WOODY ALLEN "+"28 de novembro de 1976");
		
		for(String x : list) {
			
		}
		return list;
	}
	public static List<String> Filmes() {
		List<String> list = new ArrayList();
		
		list.add("E Sua M�e Tamb�m "+"2001");
		list.add("mulheres � Beira de um Ataque de Nervos  "+"1988");
		list.add("Titanic "+"1940");
		
		for(String x : list) {
			
		}
		return list;

}
	
	public void pegarNaLista(String diretor , String filme, int size) {
	    diretor = Diretor().get(size);
		filme = Filmes().get(size);
	}
	}

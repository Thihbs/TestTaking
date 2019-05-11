package utils;
import java.util.ArrayList;
import java.util.List;

public class PegarNaLista {
	
	
	public static List<String> Diretor() {
		List<String> list = new ArrayList();
		
		list.add("ALFONSO CUÁRON "+"28 de novembro de 1961");
		list.add("PEDRO ALMODÓVAR "+"25 de setembro de 1949");
		list.add("WOODY ALLEN "+"28 de novembro de 1976");
		
		for(String x : list) {
			
		}
		return list;
	}
	public static List<String> Filmes() {
		List<String> list = new ArrayList();
		
		list.add("E Sua Mãe Também "+"2001");
		list.add("mulheres à Beira de um Ataque de Nervos  "+"1988");
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

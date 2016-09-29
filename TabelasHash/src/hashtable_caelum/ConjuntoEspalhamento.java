package hashtable_caelum;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamento {
	
	
	 private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	 private int tamanho = 0;
	 
	 public ConjuntoEspalhamento() {
		for (int i = 0; i < 26; i++) {
		     LinkedList<String> lista = new LinkedList<String>();
		     tabela.add(lista);
		}
	}
	 
	private int calculaIndiceDaTabela(String palavra){
		 return palavra.toLowerCase().charAt(0) % 26;
	}
	
	public void adiciona(String palavra) {
		if (!this.contem(palavra)) {
		    int indice = this.calculaIndiceDaTabela(palavra);
		    java.util.List<String> lista = this.tabela.get(indice);
		    lista.add(palavra);
		    this.tamanho++;
	    }
	}
	
	public void remove(String palavra) {
		if (this.contem(palavra)) {
		    int indice = this.calculaIndiceDaTabela(palavra);
		    java.util.List<String> lista = this.tabela.get(indice);
		    lista.remove(palavra);
		    this.tamanho--;
		  }
	}
	
	public boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		java.util.List<String> lista = this.tabela.get(indice);
		  
		 return lista.contains(palavra);
	}
	
	public java.util.List<String> listar() {
		java.util.List<String> palavras = new ArrayList<String>();

		  for (int i = 0; i < this.tabela.size(); i++) {
		    palavras.addAll(this.tabela.get(i));
		  }

		  return palavras;
		
	}
	
	public int size() {
		return this.tamanho;
	}
}

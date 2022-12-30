package br.com.mpoda.list;

import java.util.ArrayList;
import java.util.List;

public class ExemplosArrayList {
	 public static void main(String[] args) {
	        // Cria uma lista vazia de strings
	        List<String> list = new ArrayList<>();

	        // Adiciona alguns elementos � lista
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	        // Obt�m o tamanho da lista
	        int size = list.size();
	        System.out.println("Tamanho da lista: " + size);

	        // Verifica se a lista est� vazia
	        boolean isEmpty = list.isEmpty();
	        System.out.println("A lista est� vazia? " + isEmpty);

	        // Obt�m o elemento na posi��o 1
	        String item = list.get(1);
	        System.out.println("Elemento na posi��o 1: " + item);

	        // Substitui o elemento na posi��o 2
	        list.set(2, "Grape");
	        System.out.println("Lista ap�s a substitui��o: " + list);

	        // Remove o elemento na posi��o 0
	        list.remove(0);
	        System.out.println("Lista ap�s a remo��o: " + list);
	    }
}

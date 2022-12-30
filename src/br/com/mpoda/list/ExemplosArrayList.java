package br.com.mpoda.list;

import java.util.ArrayList;
import java.util.List;

public class ExemplosArrayList {
	 public static void main(String[] args) {
	        // Cria uma lista vazia de strings
	        List<String> list = new ArrayList<>();

	        // Adiciona alguns elementos à lista
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	        // Obtém o tamanho da lista
	        int size = list.size();
	        System.out.println("Tamanho da lista: " + size);

	        // Verifica se a lista está vazia
	        boolean isEmpty = list.isEmpty();
	        System.out.println("A lista está vazia? " + isEmpty);

	        // Obtém o elemento na posição 1
	        String item = list.get(1);
	        System.out.println("Elemento na posição 1: " + item);

	        // Substitui o elemento na posição 2
	        list.set(2, "Grape");
	        System.out.println("Lista após a substituição: " + list);

	        // Remove o elemento na posição 0
	        list.remove(0);
	        System.out.println("Lista após a remoção: " + list);
	    }
}

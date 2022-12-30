package br.com.mpoda.map;

import java.util.HashMap;
import java.util.Map;

public class ExemplosHashMap {
	 public static void main(String[] args) {
	        // Cria um mapa vazio de strings
	        Map<String, String> map = new HashMap<>();

	        // Adiciona alguns elementos ao mapa
	        map.put("A", "Apple");
	        map.put("B", "Banana");
	        map.put("O", "Orange");

	        // Obtém o valor para a chave "A"
	        String valueA = map.get("A");
	        System.out.println("Valor para a chave A: " + valueA);

	        // Verifica se o mapa contém uma chave específica
	        boolean hasKeyB = map.containsKey("B");
	        System.out.println("O mapa contém a chave B? " + hasKeyB);

	        // Verifica se o mapa contém uma chave específica
	        boolean hasKeyP = map.containsKey("P");
	        System.out.println("O mapa contém a chave P? " + hasKeyP);

	        // Obtém o tamanho do mapa
	        int size = map.size();
	        System.out.println("Tamanho do mapa: " + size);

	        // Remove um elemento do mapa
	        map.remove("A");
	        System.out.println("Mapa após a remoção: " + map);
	    }
}

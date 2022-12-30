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

	        // Obt�m o valor para a chave "A"
	        String valueA = map.get("A");
	        System.out.println("Valor para a chave A: " + valueA);

	        // Verifica se o mapa cont�m uma chave espec�fica
	        boolean hasKeyB = map.containsKey("B");
	        System.out.println("O mapa cont�m a chave B? " + hasKeyB);

	        // Verifica se o mapa cont�m uma chave espec�fica
	        boolean hasKeyP = map.containsKey("P");
	        System.out.println("O mapa cont�m a chave P? " + hasKeyP);

	        // Obt�m o tamanho do mapa
	        int size = map.size();
	        System.out.println("Tamanho do mapa: " + size);

	        // Remove um elemento do mapa
	        map.remove("A");
	        System.out.println("Mapa ap�s a remo��o: " + map);
	    }
}

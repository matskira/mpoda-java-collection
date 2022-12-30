package br.com.mpoda.set;

import java.util.HashSet;
import java.util.Set;

public class ExemplosHashSet {
	public static void main(String[] args) {
        // Cria um conjunto vazio de strings
        Set<String> set = new HashSet<>();

        // Adiciona alguns elementos ao conjunto
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Verifica se o conjunto cont�m um elemento espec�fico
        boolean hasApple = set.contains("Apple");
        System.out.println("O conjunto cont�m Apple? " + hasApple);

        // Verifica se o conjunto cont�m um elemento espec�fico
        boolean hasPear = set.contains("Pear");
        System.out.println("O conjunto cont�m Pear? " + hasPear);

        // Obt�m o tamanho do conjunto
        int size = set.size();
        System.out.println("Tamanho do conjunto: " + size);

        // Remove um elemento do conjunto
        set.remove("Orange");
        System.out.println("Conjunto ap�s a remo��o: " + set);
    }
}

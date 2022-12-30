package br.com.mpoda.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemplosTreeSet {
	public static void main(String[] args) {
        // Cria um conjunto vazio de strings
        Set<String> set = new TreeSet<>();

        // Adiciona alguns elementos ao conjunto
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Verifica se o conjunto contém um elemento específico
        boolean hasApple = set.contains("Apple");
        System.out.println("O conjunto contém Apple? " + hasApple);

        // Verifica se o conjunto contém um elemento específico
        boolean hasPear = set.contains("Pear");
        System.out.println("O conjunto contém Pear? " + hasPear);

        // Obtém o tamanho do conjunto
        int size = set.size();
        System.out.println("Tamanho do conjunto: " + size);

        // Remove um elemento do conjunto
        set.remove("Orange");
        System.out.println("Conjunto após a remoção: " + set);

        // Itera sobre os elementos do conjunto
        for (String s : set) {
            System.out.println(s);
        }
    }
}

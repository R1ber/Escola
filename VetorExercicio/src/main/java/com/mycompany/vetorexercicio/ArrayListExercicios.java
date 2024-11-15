/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorexercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercicios {

    public static void main(String[] args) {
        // Exercício 1 - Adicionar e Exibir Elementos
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");
        frutas.add("Uva");
        
        System.out.println("Lista de frutas: " + frutas);

        // Exercício 2 - Remover um Elemento
        frutas.remove(2);  // Remove a terceira fruta (índice 2)
        System.out.println("Lista de frutas após remoção: " + frutas);

        // Exercício 3 - Buscar um Elemento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de uma fruta para buscar: ");
        String frutaBuscada = scanner.nextLine();
        boolean existe = buscarFruta(frutas, frutaBuscada);
        System.out.println("A fruta " + frutaBuscada + (existe ? " está" : " não está") + " na lista.");

        // Exercício 4 - Ordenar a Lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(8);
        numeros.add(3);
        numeros.add(2);

        Collections.sort(numeros);  // Ordena a lista em ordem crescente
        System.out.println("Lista de números ordenada: " + numeros);

        // Exercício 5 - Contar Elementos Pares
        int quantidadePares = contarPares(numeros);
        System.out.println("Quantidade de números pares na lista: " + quantidadePares);
    }

    // Método para buscar uma fruta
    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    // Método para contar elementos pares
    public static int contarPares(ArrayList<Integer> numeros) {
        int count = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
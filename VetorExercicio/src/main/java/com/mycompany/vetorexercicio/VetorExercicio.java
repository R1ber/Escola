/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorexercicio;

import java.util.Scanner;

public class VetorExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior, menor;

        // Solicita a entrada de 10 valores inteiros
        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Calcula o maior e o menor valor
        maior = menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe os resultados
        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("\nTodos os valores inseridos:");
        for (int num : numeros) {
            System.out.print(num);
            if (num == maior) {
                System.out.print(" (Maior)");
            } else if (num == menor) {
                System.out.print(" (Menor)");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
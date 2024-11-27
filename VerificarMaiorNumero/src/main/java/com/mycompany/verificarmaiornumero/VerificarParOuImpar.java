/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.verificarmaiornumero;


import javax.swing.JOptionPane;

public class VerificarParOuImpar {
    public static void main(String[] args) {
        // Solicitar um número ao usuário
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        // Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ÍMPAR.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.verificarmaiornumero;

import javax.swing.JOptionPane;

public class VerificarPositivoNegativoZero {
    public static void main(String[] args) {
        // Solicitar o número ao usuário
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        // Verificar se o número é positivo, negativo ou zero
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é POSITIVO.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é NEGATIVO.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ZERO.");
        }
    }
}


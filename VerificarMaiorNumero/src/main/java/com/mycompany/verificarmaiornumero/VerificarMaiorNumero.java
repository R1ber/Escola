/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarmaiornumero;

import javax.swing.JOptionPane;

public class VerificarMaiorNumero {
    public static void main(String[] args) {
        // Solicitar os números ao usuário
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        
        // Comparar os números
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.verificarmaiornumero;

import javax.swing.JOptionPane;

public class CalculoMediaAprovacao {
    public static void main(String[] args) {
        // Solicitar as notas ao usuário
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        
        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Exibir o resultado da avaliação
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Média: " + media + ". Você foi APROVADO!");
        } else {
            JOptionPane.showMessageDialog(null, "Média: " + media + ". Você foi REPROVADO!");
        }
    }
}


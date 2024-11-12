/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tratandoexcecoes;

/**
 *
 * @author gusta
 */
public class TesteExcecoes {
    public static void main(String[] args) {
        // Instanciação dos objetos
        MinhaPrimeiraExcecao primeiraExcecao = new MinhaPrimeiraExcecao("Mensagem para primeira exceção");
        MinhaSegundaExcecao segundaExcecao = new MinhaSegundaExcecao("Mensagem para segunda exceção");

        try {
            primeiraExcecao.gerarExcecao();
        } catch (MinhaPrimeiraExcecao e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            segundaExcecao.gerarExcecao();
        } catch (MinhaSegundaExcecao e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}

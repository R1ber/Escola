/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tratandoexcecoes;

/**
 *
 * @author gusta
 */
public class MinhaSegundaExcecao extends Exception {
    public MinhaSegundaExcecao(String message) {
        super(message);
    }

    public void gerarExcecao() throws MinhaSegundaExcecao {
        throw new MinhaSegundaExcecao("Exceção gerada em MinhaSegundaExcecao");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tratandoexcecoes;

/**
 *
 * @author gusta
 */
public class MinhaPrimeiraExcecao extends Exception {
    public MinhaPrimeiraExcecao(String message) {
        super(message);
    }

    public void gerarExcecao() throws MinhaPrimeiraExcecao {
        throw new MinhaPrimeiraExcecao("Exceção gerada em MinhaPrimeiraExcecao");
    }
}

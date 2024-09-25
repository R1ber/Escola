/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import interfaces.Identificavel;

/**
 *
 * @author gusta
 */
public class Funcionario extends Pessoa implements Identificavel{
        private final String cracha;

    public Funcionario(String nome, int idade, String cracha) {
        super(nome, idade);
        this.cracha = cracha;
    }

    @Override
    public void atividade() {
        System.out.println(nome + " esta realizando tarefas administrativas.");
    }

    @Override
    public String getId() {
        return "Cracha: " + cracha;
    }
}

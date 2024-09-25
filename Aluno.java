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
public class Aluno extends Pessoa implements Identificavel {
  private final String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void atividade() {
        System.out.println(nome + " esta frequentando aulas e praticando instrumentos.");
    }

    @Override
    public String getId() {
        return "Matricula: " + matricula;
    }    
}

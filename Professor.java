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
public class Professor extends Pessoa implements Identificavel {
    
     private final String registroFuncional;

    public Professor(String nome, int idade, String registroFuncional) {
        super(nome, idade);
        this.registroFuncional = registroFuncional;
    }

    @Override
    public void atividade() {
        System.out.println(nome + " esta ministrando aulas de musica.");
    }

    @Override
    public String getId() {
        return "Registro Funcional: " + registroFuncional;
    }
}

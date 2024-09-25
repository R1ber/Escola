/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import models.Aluno;
import models.Pessoa;
import interfaces.Identificavel;
import java.util.ArrayList;
import models.Funcionario;
import models.Professor;
/**
 *
 * @author gusta
 */
public class Main {

     public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Aluno aluno1 = new Aluno("Lucas", 16, "A123");
        Professor professor1 = new Professor("Mariana", 34, "P456");
        Funcionario funcionario1 = new Funcionario("Carlos", 28, "F789");

        pessoas.add(aluno1);
        pessoas.add(professor1);
        pessoas.add(funcionario1);

        for (Pessoa pessoa : pessoas) {
            pessoa.atividade();
            if(pessoa instanceof Identificavel identificavel) {
                System.out.println(identificavel.getId());
            }
        }
    }
    
}

package com.example.demo.restservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

import javax.xml.validation.Validator;

import com.example.demo.model.Aluno;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class AlunosRestServices {

@Autowired
Validator validator;

    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João15", 15));
        alunos.add(new Aluno("João16", 16));
        alunos.add(new Aluno("João17", 17));
        return alunos;
    }
@PostMapping("/alunos")
public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {
 validate(aluno);
    System.out.println("Aluno inserido: " + aluno);
     
    return aluno;
}


}

package br.com.projetoJava.todolist.testeFuncionou;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Funcionou {
    

    @GetMapping("/")
    public String funfou(){
        return "funfou";
    }
}


package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorldController {
  @GetMapping(value="Hello")
  public String getHelloWord() {
      return "Hola, Alumnos de la Materia de Fer, estan en Spring Boot";
  }
  
  
}

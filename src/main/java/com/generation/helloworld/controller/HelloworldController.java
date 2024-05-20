package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloworldController {
	
	@GetMapping
	public String ola() {
		return "olá, mundo! Buenos dias!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "churrasco \n hamburguer ";
	}
	
	@GetMapping("bsmgen")
	public String bsmGeneration() {
		return "Mentalidade de crescimento \n Orientação ao futuro \n Persistência \n Trabalho em Equipe \n Comunicação \n Orientação ao detalhe ";
	}
	
	@GetMapping("objetivos")
	public String objetivosSemana() {
		return "Aprender as funcionalidades do SpringBoot e desenvolver mais minha habilidade de trabalho em equipe com a turma, no PI";
	}
	
}

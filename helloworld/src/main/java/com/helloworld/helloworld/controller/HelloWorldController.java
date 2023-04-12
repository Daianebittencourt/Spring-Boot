package com.helloworld.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") // pq dessa barra?
public class HelloWorldController {
	
	@GetMapping // para visualizar 
	public String helloWorld (){
		return ("Olá mundão!!!");
	}
		@GetMapping ("/bsm")
	public String bsm (){
		return ("BSMs: \nPersistência; \nMentalidade de Crescimento; \nTrabalho em Equipe; \nOrientação aos Detalhes; \nOrientação ao Futuro; \nComunicação; \nProatividade; \nResponsabilidade Pessoal.");
		}

		@GetMapping ("/bsm/objetivo")
		public String objetivo (){
			return ("Objetivo: Aprender os conteúdos programados para essa semana e revisar todos os conteúdos passados no módulo I e II!");
			}
}

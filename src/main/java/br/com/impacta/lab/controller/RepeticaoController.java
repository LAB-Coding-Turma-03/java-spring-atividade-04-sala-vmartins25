package br.com.impacta.lab.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class RepeticaoController {

	@GetMapping("/repeticao")
	public ResponseEntity<String> simularValores(@RequestParam(name="numero") int numero) {
		
		String retorno = "";
		for (int index =1; index <= numero; index++ ){
			retorno = retorno + index;			
		}	
		
		return ResponseEntity.ok(retorno);
	}
	
}

package br.com.belval.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.belval.crud.model.Produto;

@Controller
public class ProdutoController {
	
	@GetMapping("/produto/novo")
	public String novo() {
		  return "novo-produto";
	}
	@PostMapping("/produto/novo")
	public ModelAndView novo(Produto produto) {
		  ModelAndView modelAndView = new ModelAndView ("novo-produto-criado");
		  modelAndView.addObject("novoProduto", produto);
		  return modelAndView;
	}

}

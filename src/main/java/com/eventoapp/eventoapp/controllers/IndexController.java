package com.eventoapp.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	//recebendo a requisição raiz do site "/"
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

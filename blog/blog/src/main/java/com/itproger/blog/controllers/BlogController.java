package com.itproger.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
	
	// чтобы отслеживать url-адрес прописываем аннотацию @GetMapping
	@GetMapping("/blog")
	public String blogMain(Model model) {
		return "blog-main";
	}
}

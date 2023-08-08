package com.itproger.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itproger.blog.models.Post;
import com.itproger.blog.repo.PostRepository;

@Controller
public class BlogController {
	
	@Autowired
	private PostRepository postRepository;
	
	// чтобы отслеживать url-адрес прописываем аннотацию @GetMapping
	@GetMapping("/blog")
	public String blogMain(Model model) {
		Iterable<Post> posts = postRepository.findAll();
		model.addAttribute("posts", posts);
		return "blog-main";
	}
}

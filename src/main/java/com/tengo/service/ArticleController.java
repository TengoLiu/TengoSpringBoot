package com.tengo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	
	@RequestMapping(value="/api/article/list")
	public String articles() {
		return "";
	}
	
	@RequestMapping(value="/api/article/detail")
	public String article() {
		return "";
	}
	
}

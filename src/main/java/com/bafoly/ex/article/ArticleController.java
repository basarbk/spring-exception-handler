package com.bafoly.ex.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {  

  @Autowired
  ArticleService articleService;

  @GetMapping("/articles/{id}")
  public Article getArticle(@PathVariable long id){
    return this.articleService.getArticleById(id);
  }
  
}

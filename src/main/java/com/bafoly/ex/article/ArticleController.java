package com.bafoly.ex.article;

import javax.servlet.http.HttpServletRequest;

import com.bafoly.ex.error.ApiError;
import com.bafoly.ex.error.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {  

  @Autowired
  ArticleService articleService;

  @GetMapping("/articles/{id}")
  public Article getArticle(@PathVariable long id){
    return this.articleService.getArticleById(id);
  }
  

  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ApiError handleNotFoundException(NotFoundException ex, HttpServletRequest request){
    ApiError error = new ApiError(404, ex.getMessage(), request.getServletPath());
    return error;
  }
}

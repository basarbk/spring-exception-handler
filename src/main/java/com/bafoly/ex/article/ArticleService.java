package com.bafoly.ex.article;

import com.bafoly.ex.error.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

  @Autowired
  ArticleRepository articleRepository;

	public Article getArticleById(long id) {
		return this.articleRepository.findById(id).orElseThrow(() -> new NotFoundException("Article does not exist!"));
	}

	public Article save(Article article) {
		return this.articleRepository.save(article);
	}
  
}

package com.bafoly.ex.article;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Size(min = 5, max = 100)
  private String content;

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setContent(String content) {
    this.content = content;
  }
  
  public String getContent() {
    return content;
  }
  
}

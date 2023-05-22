package com.demo.service;

import java.util.List;

import com.demo.entity.Article;

public interface IArticleService {
    
	List<Article> getAllArticles();
    
	boolean existsById(long articleId);
    
    Article getArticleById(long articleId);
    
    boolean addArticle(Article article);
    
    void updateArticle(Article article);
    
    void deleteArticle(int articleId);
} 

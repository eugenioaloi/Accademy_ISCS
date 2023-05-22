package com.demo.entity;
import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articles")
@JacksonXmlRootElement(localName = "article")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "article_id")
	@JacksonXmlProperty(isAttribute = true)
	private long articleId;
	
	@Column(name = "title")
	@JacksonXmlProperty
	private String title;
	
	@Column(name = "category")
	@JacksonXmlProperty
	private String category;

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", category=" + category + "]";
	}
	
	
}
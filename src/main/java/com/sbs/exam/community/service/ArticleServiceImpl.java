package com.sbs.exam.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sbs.exam.community.dao.ArticleDao;
import com.sbs.exam.community.dto.Article;

public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articoeDao;
	
	public List<Article> getArticles(){
		return articoeDao.getArticles();
	};

}

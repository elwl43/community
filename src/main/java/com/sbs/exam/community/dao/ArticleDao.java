package com.sbs.exam.community.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.exam.community.dto.Article;

@Mapper
public interface ArticleDao {
	List<Article> getArticles();
}

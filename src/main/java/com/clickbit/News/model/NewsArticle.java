package com.clickbit.News.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class NewsArticle {
    private Long id;
    private String heading;
    private String headingImage;
    private String categoryId;
    private String categoryName;
    private List<ArticleSection> sections;
}


class ArticleSection{
    private String title;
    private  String body;
}
package com.clickbit.News.service;


import com.clickbit.News.model.NewsArticle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {


    public List<NewsArticle> getAllNews(){
        List<NewsArticle> news =new ArrayList<>();
        news.add(new NewsArticle());
        return  news;
    }
}

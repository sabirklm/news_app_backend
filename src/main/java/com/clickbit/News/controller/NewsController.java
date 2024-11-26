package com.clickbit.News.controller;

import com.clickbit.News.model.NewsArticle;
import com.clickbit.News.repository.NewsRepository;
import com.clickbit.News.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService _newsService;

    @GetMapping("/test")
    public NewsArticle test() {
        return new NewsArticle();
    }

    @GetMapping("/")
    public ResponseEntity<List<NewsArticle>> getNews(){
        List<NewsArticle> news = _newsService.getAllNews();
        return  new ResponseEntity<>(news, HttpStatus.OK);
    }

}

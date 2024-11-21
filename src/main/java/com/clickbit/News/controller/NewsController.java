package com.clickbit.News.controller;

import com.clickbit.News.model.NewsArticle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    @GetMapping("/test")
    public NewsArticle test() {
        return new NewsArticle();
    }

}

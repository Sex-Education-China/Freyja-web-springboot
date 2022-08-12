package org.sexedu.spring.controller;

import org.sexedu.spring.bean.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArticleController {
    @Autowired
    MongoTemplate template;

    @ResponseBody
    @RequestMapping("/article/add")
    public String addArticle(@Valid Article article) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        article.setData(formatter.format(new Date()));
        template.insert(article, "articles");
        return "success";
    }
}

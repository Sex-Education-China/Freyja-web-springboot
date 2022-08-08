package org.sexedu.spring.controller;

import lombok.var;
import org.sexedu.spring.bean.Video;
import org.sexedu.spring.msic.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VideoController {
    @Autowired
    MongoTemplate template;
    @ResponseBody
    @RequestMapping("/video/add")
    public String addVideo(Video video) {
        template.insert(video, "videos");
        return "success";
    }
    @ResponseBody
    @RequestMapping("/video/get")
    public Video getVideo(@RequestParam Integer id) {
        var result = template.findById(id, Video.class, "videos");
        var html = Tools.getHTML(result.getLink());
        return result;
    }

}

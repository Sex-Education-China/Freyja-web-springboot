package org.sexedu.spring.controller;

import lombok.var;
import org.jsoup.Jsoup;
import org.sexedu.spring.bean.Video;
import org.sexedu.spring.msic.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.sexedu.spring.msic.Tools.getURL;

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
        String lines[] = html.split("\n");
        String url = "";
        for (int i = 0 ;i<lines.length;i++) {
            if(lines[i].contains("hlsUrl")) {
                url = getURL("(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]",lines[i]);
                break;
            }
        }
        result.setVideoLink(url.replace("\r\n",""));
        return result;
    }

}

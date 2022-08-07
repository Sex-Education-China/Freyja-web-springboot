package org.sexedu.spring.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("videos")
public class Video {
    @Id
    private String id;
    private String preview;
    private String title;
    private String[] tags;
    private String link;
}

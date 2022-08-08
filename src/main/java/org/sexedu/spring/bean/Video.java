package org.sexedu.spring.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.sexedu.spring.msic.AutoGen;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Document("videos")
public class Video {
    @Id
    @AutoGen
    private long id;
    @NotNull
    private String preview;
    @NotNull
    private String title;
    @NotNull
    private String[] tags;
    private String videoLink;
    @NotNull
    private String link;
}

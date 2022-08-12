package org.sexedu.spring.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Document("articles")
public class Article {
    @Id
    @NotNull
    private long id;

    @NotNull
    private String type;

    private String data;

    @NotNull
    private String content;

}

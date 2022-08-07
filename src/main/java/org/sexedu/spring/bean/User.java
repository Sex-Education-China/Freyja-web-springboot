package org.sexedu.spring.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Data
@Document("users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String reg_ip;
    private boolean isVip;
    private boolean isAdmin;
    private String reg_time;

}

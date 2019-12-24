package com.example.elasticsearch.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author ly
 * @date 2019/12/23
 */
@Data
@Document(indexName = "megacorp", type = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -4867354105876264577L;
    @Id
    private Integer id;
    private String username;
    private String password;
    private Integer age;
}

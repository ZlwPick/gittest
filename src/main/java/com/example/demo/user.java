package com.example.demo;

import lombok.Builder;
import lombok.Data;

/**
 * @author zlw
 * @ClassName user
 * @description
 * @createTime 2021/4/5 15:50
 */
@Data
@Builder
public class user {

    private String name;

    private String pass;

    private Integer age;

    private String hobby;
}

package com.example.demo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Alan Chen
 * @description 使用component注解注入配置信息
 * @date 2021/3/2
 */
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String name;
    private String author;
    private  Float price;

    @Override
    public String toString() {
        return name+author+price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

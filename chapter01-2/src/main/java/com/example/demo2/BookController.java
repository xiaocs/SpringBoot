package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Chen
 * @description 测试Component配置类
 * @date 2021/3/2
 */
@RestController
public class BookController {

    @Autowired
    Book book;

    @GetMapping("/book")
    public String book() {
        return book.toString();
    }
}

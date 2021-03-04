package com.tudou;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alan Chen
 * @description
 * @date 2021/3/4
 */
@Controller
public class BookController {
    @GetMapping("/books")
    public ModelAndView books(){
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("西游记");
        b1.setAuthor("吴承恩");

        Book b2 = new Book();
        b2.setId(1);
        b2.setName("楚辞");
        b2.setAuthor("屈原");

        books.add(b1);
        books.add(b2);
        ModelAndView mv =new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("books");
        return mv;
    }
}

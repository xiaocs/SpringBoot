package org.sang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Chen
 * @description
 * @date 2021/2/21
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }
}

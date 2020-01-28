package com.blog.web;

import com.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Package: com.blog.web
 * <p>
 * Author: 懒洋洋
 * <p>
 * Date: Created in 2020/1/27 12:12
 */

@Controller
public class indexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name){
//        int i =9/0;
//        String blog = null;
//        if (blog == null) {
//            throw  new NotFoundException("博客不存在");
//        }

        System.out.println("-------indes-------");
        return "index";
    }

}

package com.codesdk.category;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @RequestMapping("/categories")
    public String getAllCategories() {
        return "All Categories";
    }

}
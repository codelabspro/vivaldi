package com.codesdk.category;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @RequestMapping("/categories")
    public List<Category> getAllCategories() {
        return Arrays.asList(
            new Category("1", "Mozart", "Austrian composer"),
            new Category("2", "Beethoven", "German composer"),
            new Category("3", "Chopin", "Polish composer")  
        );
    }

}
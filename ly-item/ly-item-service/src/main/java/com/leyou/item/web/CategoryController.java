package com.leyou.item.web;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: CategoryController.java
 * @Package com.leyou.item.web
 * @Description: TODO
 * @Author ZhangYB
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     *  根据父节点id查询商品分类
     * @param pid
     * @return
     */
    @GetMapping(value = "list")
    public ResponseEntity<List<Category>> queryCategoryListByPid(@RequestParam("pid") long pid){
        return ResponseEntity.ok(categoryService.queryCategoryListByPid(pid));
    }
}

package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Title: CategoryService.java
 * @Package com.leyou.item.service
 * @Description: TODO
 * @Author ZhangYB
 * @Version V1.0
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(long pid) {
        // 查询条件 mapper会把实体属性非空字段作为查询条件的参数
        Category category = new Category();
        category.setParentId(pid);
        final List<Category> list = categoryMapper.select(category);
        if (CollectionUtils.isEmpty(list)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}

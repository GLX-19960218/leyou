package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Title: BrandMapper.java
 * @Package com.leyou.item.mapper
 * @Description: TODO
 * @Author ZhangYB
 * @Version V1.0
 */
public interface BrandMapper extends Mapper<Brand> {

    /**
     * 新增商品分类和品牌的中间表
     * @param cid
     * @param bid
     * @return
     */
    @Insert("insert into tb_category_brand (category_id ,brand_id) values (#{cid} ,#{bid})")
    int insertCategoryBrand(@Param("cid") Long cid , @Param("bid") Long bid);
}
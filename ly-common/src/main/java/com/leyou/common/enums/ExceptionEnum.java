package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Title: ExceptionEnums.java
 * @Package com.leyou.common.enums
 * @Description: TODO
 * @Author ZhangYB
 * @Version V1.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum  ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空"),
    CATEGORY_NOT_FOUND(404,"商品分类没有查到")
    ;
    private int code;
    private String msg;
}

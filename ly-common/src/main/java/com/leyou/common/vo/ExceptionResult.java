package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @Title: ExceptionResult.java
 * @Package com.leyou.common.vo
 * @Description: TODO
 * @Author ZhangYB
 * @Version V1.0
 */
@Data
public class ExceptionResult {

    private int status;
    private String message;
    private long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}

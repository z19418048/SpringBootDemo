package com.zlong.entity.dto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
/*
* 产品Dto
* */
@Data
public class ProductDto {
    //产品ID
    private Integer id;
    //产品名称
    private String name;
    //产品日期
    private Date date;
    //产品数量
    private Integer number;
    //产品价格
    private BigDecimal price;
}

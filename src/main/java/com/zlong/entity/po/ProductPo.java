package com.zlong.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/*
* 产品Po
* */
@Data
@TableName("product_table")
public class ProductPo {
    //产品ID
    @TableId(type = IdType.AUTO)
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

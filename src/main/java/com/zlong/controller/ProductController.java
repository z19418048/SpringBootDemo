package com.zlong.controller;

import com.zlong.entity.dto.ProductDto;

import com.zlong.entity.vo.ResultVo;
import com.zlong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 产品控制器
* */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    /*
    * 根据条件去查询产品个数
    * */
    @GetMapping("/getProductNums")
    public ResultVo getProductNums(ProductDto productDto){
        return productService.getProductNums(productDto);
    }
}

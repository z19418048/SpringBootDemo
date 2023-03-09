package com.zlong.service;

import com.zlong.entity.dto.ProductDto;
import com.zlong.entity.vo.ResultVo;
/*
* 产品服务层接口
* */
public interface ProductService {
    /*
     * 根据条件去查询产品个数
     * */
    ResultVo getProductNums(ProductDto productDto);
}

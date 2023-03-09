package com.zlong.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlong.entity.dto.ProductDto;
import com.zlong.entity.po.UserPo;

/*
*
* 产品Mapper
* */
public interface ProductMapper extends BaseMapper<UserPo> {
    /*
     * 根据条件去查询产品个数
     * */
    Integer getProductNums(ProductDto productDto);
}

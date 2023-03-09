package com.zlong.service.impl;

import com.zlong.dao.ProductMapper;
import com.zlong.entity.dto.ProductDto;
import com.zlong.entity.vo.ResultVo;
import com.zlong.service.ProductService;
import com.zlong.utils.ResultUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.logging.Logger;

/*
* 产品服务层实现类
* */
@Service
public class ProductServiceImpl implements ProductService {
    Logger logger = Logger.getLogger("ProductServiceImpl");

    @Resource
    ProductMapper productMapper;

    @Override
    public ResultVo getProductNums(ProductDto productDto) {
        return ResultUtils.success("查询成功","用户的总数量为"+productMapper.getProductNums(productDto));
    }
}
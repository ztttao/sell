package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);
    List<ProductInfo> findUpAll();    //查询在架商品列表
    Page<ProductInfo> findAll(Pageable pageable);   //管理端 分页
    ProductInfo save(ProductInfo productInfo );
    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);


}

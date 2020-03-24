package com.hxt.springcloud.mapper;

import com.hxt.springcloud.entities.Product;

import java.util.List;

/*** @Auther: hxt */
//@Mapper //或在主启动类上使用@MapperScan注解
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}

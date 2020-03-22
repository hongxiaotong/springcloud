package com.hxt.springcloud.service;

import com.hxt.springcloud.entities.Product;

import java.util.List;

/**
 * @Auther:hxt
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}

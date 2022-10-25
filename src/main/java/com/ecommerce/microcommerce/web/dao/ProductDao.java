package com.ecommerce.microcommerce.web.dao;


import java.util.List;

import com.ecommerce.microcommerce.web.model.Product;

public interface ProductDao {
    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);
}

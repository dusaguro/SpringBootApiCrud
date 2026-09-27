package com.dsgr.springboot.app.springboot_crudjpa.services;

import java.util.List;
import java.util.Optional;

import com.dsgr.springboot.app.springboot_crudjpa.entities.Product;

public interface ProductService {

    List<Product> findAllProducts();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Optional<Product>  delete(Product product);

}

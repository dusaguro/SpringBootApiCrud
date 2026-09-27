package com.dsgr.springboot.app.springboot_crudjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dsgr.springboot.app.springboot_crudjpa.entities.Product;

public interface ProductRepository extends CrudRepository<Product , Long> {

}

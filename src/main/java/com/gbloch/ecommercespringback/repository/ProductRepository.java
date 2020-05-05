package com.gbloch.ecommercespringback.repository;

import com.gbloch.ecommercespringback.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}

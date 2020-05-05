package com.gbloch.ecommercespringback.repository;

import com.gbloch.ecommercespringback.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

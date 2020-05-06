package com.gbloch.ecommercespringback.repository;

import com.gbloch.ecommercespringback.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}

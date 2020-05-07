package com.gbloch.ecommercespringback.repository;

import com.gbloch.ecommercespringback.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
    @RestResource(path = "category-id", rel = "category-id")
    Page<Product> findByCategoryId(@RequestParam Long id, Pageable pageable);

    @RestResource(path = "category-contains", rel = "category-contains")
    Page<Product> findByNameContaining(@RequestParam String name, Pageable pageable);
}

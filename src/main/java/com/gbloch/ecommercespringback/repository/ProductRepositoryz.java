package com.gbloch.ecommercespringback.repository;

import com.gbloch.ecommercespringback.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@Repository
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "products", collectionResourceRel = "products")
public interface ProductRepositoryz extends JpaRepository<Product, Long> {
    @RestResource(path = "category-id", rel = "category-id")
    Page<Product> findByCategoryId(@RequestParam Long id, Pageable pageable);

    @RestResource(path = "name-contains", rel = "name-contains")
    Page<Product> findByNameContaining(@RequestParam String name, Pageable pageable);
}

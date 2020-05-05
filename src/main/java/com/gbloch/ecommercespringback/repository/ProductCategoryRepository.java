package com.gbloch.ecommercespringback.repository;

import com.gbloch.ecommercespringback.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@RepositoryRestResource(collectionResourceRel = "product_categories", path = "product-categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}

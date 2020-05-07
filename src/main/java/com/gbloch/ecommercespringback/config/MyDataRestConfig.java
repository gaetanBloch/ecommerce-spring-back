package com.gbloch.ecommercespringback.config;

import com.gbloch.ecommercespringback.model.Product;
import com.gbloch.ecommercespringback.model.ProductCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import javax.persistence.EntityManager;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@RequiredArgsConstructor
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private final EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod[] unsupportedMethods = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};

        // Disable HTTP methods for products: POST, PUT and DELETE
        makeProductsReadOnly(config, unsupportedMethods);

        // Disable HTTP methods for product categories: POST, PUT and DELETE
        makeProductCategoriesReadOnly(config, unsupportedMethods);
    }

    /**
     * Disable the @unsupportedMethods for the Product Entity
     *
     * @param config Configuration
     * @param unsupportedMethods Unsupported HTTP requests
     */
    private void makeProductsReadOnly(RepositoryRestConfiguration config,
                                      HttpMethod[] unsupportedMethods) {
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)))
                .withCollectionExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)));
    }

    /**
     * Disable the @unsupportedMethods for the ProductCategory Entity
     *
     * @param config Configuration
     * @param unsupportedMethods Unsupported HTTP requests
     */
    private void makeProductCategoriesReadOnly(RepositoryRestConfiguration config,
                                      HttpMethod[] unsupportedMethods) {
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)))
                .withCollectionExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)));
    }
}

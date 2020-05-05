package com.gbloch.ecommercespringback.config;

import com.gbloch.ecommercespringback.model.Product;
import com.gbloch.ecommercespringback.model.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod[] unsupportedMethods = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};

        // Disable HTTP methods for products: POST, PUT and DELETE
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)))
                .withCollectionExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)));

        // Disable HTTP methods for product categories: POST, PUT and DELETE
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)))
                .withCollectionExposure(((metadata, httpMethods)
                        -> httpMethods.disable(unsupportedMethods)));
    }
}

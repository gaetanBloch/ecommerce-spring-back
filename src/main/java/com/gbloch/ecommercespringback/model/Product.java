package com.gbloch.ecommercespringback.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="product")
public class Product {
    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private String imageUrl;
    private boolean active;
    private int unitsInStock;
    private Date dateCreated;
    private Date lastUpdated;
}

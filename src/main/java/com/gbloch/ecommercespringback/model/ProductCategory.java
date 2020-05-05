package com.gbloch.ecommercespringback.model;

import lombok.*;

import javax.persistence.*;

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
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;
}

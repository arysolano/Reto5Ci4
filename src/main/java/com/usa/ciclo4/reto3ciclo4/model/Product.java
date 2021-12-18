package com.usa.ciclo4.reto3ciclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Autor Ary Solano
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private Integer id;
    private String brand;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private boolean availability;
    private double price;
    private Integer quantity;
    private String photography;

}

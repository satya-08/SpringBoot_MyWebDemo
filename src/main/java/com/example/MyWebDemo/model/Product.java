package com.example.MyWebDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Entity
public class Product {

    @Id
    private int prodid;
    private String name;
    private int price;

    public Product(){

    }
}

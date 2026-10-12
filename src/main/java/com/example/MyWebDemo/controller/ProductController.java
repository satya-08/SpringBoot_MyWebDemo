package com.example.MyWebDemo.controller;

import com.example.MyWebDemo.model.Product;
import com.example.MyWebDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{proid}")
    public Product getProductById(@PathVariable int proid){
        return service.getProductById(proid);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod){
        service.addProduct(prod);
        return "Record Insert Successfully";
    }

    @PutMapping("/products/update")
    public String updateRecord(@RequestBody Product prod){
        return service.updateRecord(prod);
    }

    @DeleteMapping("/products/delete/{prodId}")
    public String deleteProduct(@PathVariable int prodId){
        return service.deleteProduct(prodId);
    }
}

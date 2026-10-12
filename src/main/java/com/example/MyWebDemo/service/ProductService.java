package com.example.MyWebDemo.service;

import com.example.MyWebDemo.model.Product;
import com.example.MyWebDemo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products =new ArrayList<>( Arrays.asList(
//            new Product(101, "Iphone", 70000),
//            new Product(102, "Nothing", 30000),
//            new Product(103, "Vivo", 20000))
//    );

    public List<Product> getProducts() {
        return repo.findAll();
//        return products;
    }

    public Product getProductById(int proid) {
        return repo.findById(proid).orElse(new Product());
//        return products.stream().filter(p->p.getProdid()==proid).findFirst().get();
//        return products.stream().filter(p->p.getProdid()==proid).findFirst().orElse(new Product(100,"No Item",0));

    }

    public void addProduct(Product prod){
        repo.save(prod);
//        products.add(prod);
    }

    public String updateRecord(Product prod) {
        repo.save(prod);
//        int index=-1;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdid()==prod.getProdid())
//                index=i;
//        if(index==-1){
//            return "Product Not Found";
//        }
//        products.set(index,prod);
        return "Product Record Updated";
    }

    public String deleteProduct(int prodId) {
        repo.deleteById(prodId);
//        int index=-1;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdid()==prodId)
//                index=i;
//        if(index==-1)
//            return "Record Not Present";
//        products.remove(index);
        return "Record Deleted";
    }
}
package com.day5.classexcersice1.service;

import org.springframework.stereotype.Service;

import com.day5.classexcersice1.model.Product;
import com.day5.classexcersice1.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo){
        this.productRepo=productRepo;
    }
    public Product postProduct(Product product){
        return productRepo.save(product);
    }
    public Product putProduct(Product product){
        return productRepo.save(product);
    }
    public Boolean deleteProduct(int productId){
        productRepo.deleteById(productId);
        return true;
    }
}

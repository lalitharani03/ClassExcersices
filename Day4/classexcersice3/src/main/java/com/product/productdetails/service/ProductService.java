package com.product.productdetails.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.product.productdetails.model.Product;
import com.product.productdetails.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo){
        this.productRepo=productRepo;
    }

    public Product saveDetails(Product job){
            return productRepo.save(job);
            
    }

    public List<Product> listofProductDetail(){
           return productRepo.findAll();
    }

    public Product productById(int jobId,Product job){
          return productRepo.findById(jobId).orElse(new Product());
    }
}

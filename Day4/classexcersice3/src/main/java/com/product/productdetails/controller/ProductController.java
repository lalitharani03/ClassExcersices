package com.product.productdetails.controller;

import org.springframework.web.bind.annotation.RestController;

import com.product.productdetails.service.ProductService;
import com.product.productdetails.model.Product;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService jobService){
        this.productService=jobService;
    }  
    @PostMapping("/api/product")
    public ResponseEntity<Product> postjobDetails(@RequestBody Product job) {
        Product prodetail=productService.saveDetails(job);
        return new ResponseEntity<>(prodetail,HttpStatus.CREATED);
    }
    @GetMapping("/api/product")
    public ResponseEntity<List<Product>> getlistofjobDetail() {
        List<Product> li=productService.listofProductDetail();
        return new ResponseEntity<>(li,HttpStatus.OK);
    }
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Product> getjobById(@PathVariable("productId") int productId,Product product) {
        Product j=productService.productById(productId,product);
        if(j!=null){
        return new ResponseEntity<>(j,HttpStatus.OK);
    }
    else{
            return new ResponseEntity<>(j,HttpStatus.NOT_FOUND);

        }
    }
    
    
}
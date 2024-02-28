package com.day5.classexcersice1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day5.classexcersice1.model.Product;
import com.day5.classexcersice1.service.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<Product> postProductDetails(@RequestBody Product product) {
        Product pro=productService.postProduct(product);
        if(pro!=null){
            return new ResponseEntity<>(pro,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(pro,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping("/api/product/{productId}")
    public ResponseEntity<Product> putProductDetails(@PathVariable("productId") int productId, @RequestBody Product product) {
        Product putpro=productService.putProduct(product);
        if(putpro!=null){
            return new ResponseEntity<>(putpro,HttpStatus.OK);
        }
        return new ResponseEntity<>(putpro,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("api/product/{productId}")
    public ResponseEntity<Boolean> deleteProductDetail(@PathVariable("productId") int productId){
        Boolean b=productService.deleteProduct(productId);
        if(b!=true){
            return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(b,HttpStatus.OK);
    }
}

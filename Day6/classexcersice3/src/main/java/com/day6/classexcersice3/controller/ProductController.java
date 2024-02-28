package com.day6.classexcersice3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Product;
import com.example.springapp.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService ProductService;

    @PostMapping("/api/product")
    public ResponseEntity<Product> postProductDetails(@RequestBody Product children) {
        if (productService.postProduct(children)) {
            return new ResponseEntity<Product>(children, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<Product>> getListOfProduct(@PathVariable int offset, @PathVariable int pagesize) {
        List<Product> li = productService.getProducts(offset, pagesize);
        if (!li.isEmpty()) {
            return new ResponseEntity<List<Product>>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Product>> abcf(@PathVariable int offset, @PathVariable int pagesize,
            @PathVariable String field) {
        List<Product> li = productService.getSortBy(offset, pagesize, field);
        if (!li.isEmpty()) {
            return new ResponseEntity<List<Product>>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Product> getById(@PathVariable int productId)
    {
        Product pro = productService.getId(productId);
        if(pro==null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Product>(pro,HttpStatus.OK);
        }
    }

}



package com.product.productdetails.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.product.productdetails.model.*;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}

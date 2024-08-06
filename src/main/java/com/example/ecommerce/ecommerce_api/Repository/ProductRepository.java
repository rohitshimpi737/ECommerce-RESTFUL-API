package com.example.ecommerce.ecommerce_api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ecommerce.ecommerce_api.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
    
}

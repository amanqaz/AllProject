package com.Aman.Ecommerce.API.repositatory;

import com.Aman.Ecommerce.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductsRepo extends JpaRepository<Product,Integer> {
}

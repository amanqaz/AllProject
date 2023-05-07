package com.Aman.Ecommerce.API.repositatory;

import com.Aman.Ecommerce.API.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepo extends JpaRepository<Orders,Integer> {
}

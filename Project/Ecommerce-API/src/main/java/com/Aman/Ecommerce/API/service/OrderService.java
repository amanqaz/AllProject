package com.Aman.Ecommerce.API.service;

import com.Aman.Ecommerce.API.model.Address;
import com.Aman.Ecommerce.API.model.Orders;
import com.Aman.Ecommerce.API.model.Product;
import com.Aman.Ecommerce.API.model.User;
import com.Aman.Ecommerce.API.repositatory.IAddressRepo;
import com.Aman.Ecommerce.API.repositatory.IOrdersRepo;
import com.Aman.Ecommerce.API.repositatory.IProductsRepo;
import com.Aman.Ecommerce.API.repositatory.IUserRepo;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrdersRepo orderDatabase;
    @Autowired
    IProductsRepo productDatabase;
    @Autowired
    IAddressRepo addressDatabase;
    @Autowired
    IUserRepo userDatabase;
//    public void placeOrder(Integer userId, Integer addressId, Integer productID,Integer quantity) {
//        Address add = addressDatabase.findById (addressId ).get();
//        User  user = userDatabase.findById ( userId ).get();
//        Product product = productDatabase.findById ( productID ).get();
//
//        Orders temp = new Orders (  );
//        temp.setUsers ( user );
//        temp.setAddressID ( add );
//        temp.setProductID ( product );
//        temp.setProductQuantity ( quantity );
//
//        orderDatabase.save ( temp );
//
//
//
//    }

    public void placingOrder(Orders order) {
        orderDatabase.save ( order);
    }
}

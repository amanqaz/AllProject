package com.Aman.Ecommerce.API.repositatory;

import com.Aman.Ecommerce.API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}

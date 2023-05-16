package com.Aman.Mapping.repositatory;

import com.Aman.Mapping.model.Address;
import com.Aman.Mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo  extends JpaRepository<Address,Long> {
}

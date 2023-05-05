package com.aman.EmpAdress.Repositatory;

import com.aman.EmpAdress.Model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddressRepo extends CrudRepository<Address,Long> {

    @Modifying
    @Query(value = "update address set id =: newId where id =: id ",nativeQuery = true)
    void updateIdByNewId(Long newId,Long id);
}

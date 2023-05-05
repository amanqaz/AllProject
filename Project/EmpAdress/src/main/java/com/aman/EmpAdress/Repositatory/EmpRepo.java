package com.aman.EmpAdress.Repositatory;

import com.aman.EmpAdress.Model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Long> {


    @Modifying
    @Query(value = "update employee set id =:newId where id =:id",nativeQuery = true)
    void updateId(Long newId,Long id);
}

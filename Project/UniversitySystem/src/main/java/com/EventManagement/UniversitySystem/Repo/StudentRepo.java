package com.EventManagement.UniversitySystem.Repo;

import com.EventManagement.UniversitySystem.Model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {


   @Modifying
   @Query(value = "update student set branch = :newBranch where id =:id",nativeQuery = true)
   void updateBranchByID(String newBranch,Integer id);

//   @Modifying
//   @Query(value = "update stock set stock_id = :stockId, stock_name =
//   :stockName, stock_price= :stockPrice, stock_Birth_Time_Stamp =:stockBirthTimeStamp
//   where stock_id = :id",nativeQuery = true)
//   void updateStockById(Integer id, Integer stockId, String stockName, Double stockPrice, LocalDateTime stockBirthTimeStamp);

}

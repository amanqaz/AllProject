package com.aman.h2.demo.DAO;

import com.aman.h2.demo.Model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Users,Integer> {

}

package com.aman.EmpAdress.Controller;

import com.aman.EmpAdress.Model.Address;
import com.aman.EmpAdress.Model.Employee;
import com.aman.EmpAdress.Repositatory.AddressRepo;
import com.aman.EmpAdress.Repositatory.EmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class EmpController {
    @Autowired
    EmpRepo empDB;


    @PostMapping("addEmployee/empData")
    public void addUser(@RequestBody  Employee empData){

        List<Address> addressList =List.of ( empData.getUserAddress ()) ;
        for(Address add:addressList){
            add.setEmp ( empData );
        }
        empDB.save ( empData );

    }

    @PostMapping("addListEmployee/empData")
    public void addLists(@RequestBody List<Employee> employee){


        for(Employee emp : employee){
            List<Address> addressList = List.of ( emp.getUserAddress () );
            for(Address add : addressList ){
                add.setEmp ( emp );
            }
            empDB.save ( emp );
        }


    }
    @GetMapping("getById/{id}")
    public Employee getById(@PathVariable Long id){
        return empDB.findById (id).get();

    }

    @GetMapping("getAll")
    public Iterable<Employee> getAll(){
        return empDB.findAll();

    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        empDB.deleteById ( id );
    }

    @Transactional
    @PutMapping("update/{id}/{newId}")
    public void updateIdByNewId(@PathVariable Long id,@PathVariable Long newId ){
       empDB.updateId ( newId ,id);
    }

}

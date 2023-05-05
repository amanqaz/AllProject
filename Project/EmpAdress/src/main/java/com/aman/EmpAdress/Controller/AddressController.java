package com.aman.EmpAdress.Controller;


import com.aman.EmpAdress.Model.Address;
import com.aman.EmpAdress.Model.Employee;
import com.aman.EmpAdress.Repositatory.AddressRepo;
import com.aman.EmpAdress.Repositatory.EmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class AddressController {
    @Autowired
    AddressRepo addDB;


    @PostMapping("/addAddress/addressData")
    public void addUser(@RequestBody Address addressData){
        addDB.save ( addressData );
    }
    @GetMapping("getAllAddress")
    public Iterable<Address> getAll(){
       return addDB.findAll ();
    }
    @Transactional
    @PutMapping("updateAddressById/{id}/{newId}")
    public void updateById(@PathVariable Long id,@PathVariable Long newId){
        addDB.updateIdByNewId ( newId,id);
    }
    @DeleteMapping("deleteUserById/{id}")
    public void deleteById(@PathVariable Long id){
        addDB.deleteById ( id );
    }
}

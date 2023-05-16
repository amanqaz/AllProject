package com.Aman.Mapping.service;

import com.Aman.Mapping.model.Address;
import com.Aman.Mapping.model.Student;
import com.Aman.Mapping.repositatory.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    @Autowired
    StudentService studentService;
    public void insertAddress(Address address , Long id) {
        Student student = studentService.findById(id);

        address.setStudent ( student );

        iAddressRepo.save ( address );

    }
}

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
        if(student!=null) {
            address.setStudent ( student );

            iAddressRepo.save ( address );
        }

    }

    public Address getAddressById(Long id) {

        Student student = studentService.findById(id);
        if(student!=null) {
            return student.getAddress ( );
        }
        return null;
    }

    public void deleteAddressById(Long id) {
        Student student = studentService.findById(id);
        if(student!=null) {
            Long addressId = student.getAddress ( ).getAddressId ( );
            iAddressRepo.deleteById ( addressId );

        }
    }

    public void updateAddressById(Address address, Long id) {
        Student student = studentService.findById(id);
        if(student!=null) {
            insertAddress(address,id);

        }

    }
}

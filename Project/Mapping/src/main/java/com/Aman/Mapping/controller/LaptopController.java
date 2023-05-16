package com.Aman.Mapping.controller;

import com.Aman.Mapping.model.Laptop;
import com.Aman.Mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("toStudent/{id}")
    public void addLaptop(@RequestBody  Laptop laptop, @PathVariable Long id){
        laptopService.laptopDetailForStudent(laptop,id);

    }

    @DeleteMapping("removeAsset/{id}")
    public void unAssignLaptopToStudent(@PathVariable Long id){
        laptopService.unAssignLaptopToStudent(id);

    }
    @PutMapping("assetReplacement/{id}")
    public void updateAssetOfStudent(@RequestBody Laptop laptop,@PathVariable Long id){
        laptopService.updateAssetOfStudent(laptop,id);
    }

    @GetMapping("getAllLaptop")
    public List<Laptop> allAsset(){
        return laptopService.allLaptop();
    }
}

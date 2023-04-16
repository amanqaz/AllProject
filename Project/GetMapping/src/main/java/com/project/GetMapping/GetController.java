package com.project.GetMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GetController {

   @Autowired

    GetService Obj;

    @GetMapping("/getTesting")
    public String testing(){
      return  Obj.printing();

    }
}

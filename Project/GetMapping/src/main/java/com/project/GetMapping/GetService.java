package com.project.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class GetService {
    @Autowired
    @Qualifier("qualifier")
    mailApiObject obj;

    public String  printing(){
        String str = obj.getStr();
      //  System.out.println(str);

        return str;

    }


}

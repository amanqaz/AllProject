package com.project.GetMapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan("mailApi")

public class mailApiObject {



    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String str ="" ;

    public mailApiObject(String str) {
        this.str = str;
    }
    public mailApiObject() {
        this.str= "This api call is done by server";
    }
}

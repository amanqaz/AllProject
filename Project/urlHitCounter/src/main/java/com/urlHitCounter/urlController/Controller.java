package com.urlHitCounter.urlController;

import com.urlHitCounter.urlService.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
    @Autowired
    services service;

    @GetMapping("/urlCount")

    public String urlHits(){
        return service.urlHitcounter();
    }

}

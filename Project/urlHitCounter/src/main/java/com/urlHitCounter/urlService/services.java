package com.urlHitCounter.urlService;

import com.urlHitCounter.urlDao.database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class services {

@Autowired
    database repo;
    public String urlHitcounter() {
        return repo.hitCount();
    }
}

package com.Aman.Instagram.service;

import com.Aman.Instagram.repositatory.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;
}

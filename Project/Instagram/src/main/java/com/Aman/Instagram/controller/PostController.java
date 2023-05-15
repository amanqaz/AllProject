package com.Aman.Instagram.controller;

import com.Aman.Instagram.DTO.PostSave;
import com.Aman.Instagram.DTO.SignIn;
import com.Aman.Instagram.model.Post;
import com.Aman.Instagram.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("save")
    public void savePost(@RequestBody PostSave post){

        postService.addPost(post);
    }
    @GetMapping("/{email}/{password}")
    public ResponseEntity<List<Post>> allPost(@PathVariable String email,@PathVariable String password){
        return postService.getAllPost(email,password);

    }
}

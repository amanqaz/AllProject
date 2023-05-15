package com.Aman.Instagram.service;

import com.Aman.Instagram.DTO.PostSave;
import com.Aman.Instagram.model.Post;
import com.Aman.Instagram.model.User;
import com.Aman.Instagram.repositatory.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;
    @Autowired
    UserService userService;
    public void addPost(PostSave post) {
        boolean check =userService.verificationUser ( post.getEmail (),post.getPassword ());

        if(check) {
            User user = userService.getUserByEmail(post.getEmail ());
            Post posts = new Post ( post.getPostData (),user );
            postRepo.save ( posts );
        }

    }

    public ResponseEntity<List<Post>> getAllPost(String email, String password) {
        boolean check =userService.verificationUser ( email,password );
        if(check){
            User user = userService.getUserByEmail(email);
       //     List<Post> = user.getPosts ();
          return  ResponseEntity.ok (  ).body ( user.getPosts () );
        }
        return  ResponseEntity.ok ( ).body ( new ArrayList<> ());
    }
}

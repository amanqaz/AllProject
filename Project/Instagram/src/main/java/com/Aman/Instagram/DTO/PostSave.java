package com.Aman.Instagram.DTO;

import com.Aman.Instagram.model.Post;
import lombok.Data;

@Data
public class PostSave extends Post {
    private String email;
   private  String password;
}

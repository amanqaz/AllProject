package com.Aman.Instagram.repositatory;

import com.Aman.Instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Long> {
}

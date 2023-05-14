package com.Aman.Instagram.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private LocalDate createdDate;
  //  @NonNull
    private LocalDate updatedDate;

    private String postData;

    @ManyToOne(fetch = FetchType.LAZY)
    private User users;


}

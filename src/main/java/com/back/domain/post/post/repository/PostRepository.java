package com.back.domain.post.post.repository;

import com.back.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//post table을 다루는  repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}

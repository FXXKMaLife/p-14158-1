package com.back.global.initData;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {
    @Autowired
    private PostRepository postRepository;

    @Bean
    ApplicationRunner basinitDataApplicationRunner(){
        return args -> {
            System.out.println("기본 데이터가 초기화되었ㅅㅂ니다.");

            //postRepository.count(); //SELECT COUNT(*) FROM post;
            Post post = new Post();
            post.setTitle("제목 1");

            postRepository.save(post);//INSERT INTO post SET title = '제목 1';
        };
        //초기 데이터 삽입 로직을 여기에 작성
        //예 : 사용자, 카테고리, 태그 등 기본 데이터를 삽입
    }
}

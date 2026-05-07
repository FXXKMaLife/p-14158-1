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
            if(postRepository.count() > 0) return;//데이터가 있는지 물어봄 있으면 Early return

            /*  content를 추가했으니 컨텐트에 넣을것을 추가하자
            Post post1 = new Post();
            post1.setTitle("제목 1");
             postRepository.save(post1);
             */
            Post post1 = postRepository.save(new Post("제목 1", "내용 1"));
            Post post2 = postRepository.save(new Post("제목 2", "내용 2"));

            System.out.println("기본 데이터가 초기화되었ㅅㅂ니다.");
        };
        //초기 데이터 삽입 로직을 여기에 작성
        //예 : 사용자, 카테고리, 태그 등 기본 데이터를 삽입
    }
}

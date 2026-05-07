package com.back.domain.post.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@RequiredArgsConstructor
public class Post {
    @Id //primary key
    @GeneratedValue(strategy = IDENTITY) // AUTO_INCREMENT
    private int id; //INT
    private final String title; //VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private final String content;
}

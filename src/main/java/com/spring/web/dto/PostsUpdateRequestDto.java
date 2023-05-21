package com.spring.web.dto;

import com.spring.domain.posts.Posts;
import lombok.*;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(Posts entity) {
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}